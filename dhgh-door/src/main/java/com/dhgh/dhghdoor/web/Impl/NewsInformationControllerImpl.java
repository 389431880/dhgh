package com.dhgh.dhghdoor.web.Impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.dhgh.dhghcore.constant.CodeEnum;
import com.dhgh.dhghcore.model.dto.SimpleDTO;
import com.dhgh.dhghcore.util.ListUtils;
import com.dhgh.dhghdb.dao.domain.DNewsInformation;
import com.dhgh.dhghdb.dao.dto.DNewsInformationDTO;
import com.dhgh.dhghdb.service.NewsInformationService;
import com.dhgh.dhghdoor.model.SystemConstant;
import com.dhgh.dhghdoor.web.NewsInformationController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = SystemConstant.BASE_REQUEST_MAPPING)
public class NewsInformationControllerImpl implements NewsInformationController {

    @Autowired
    private NewsInformationService newsInformationService;

    @Override
    @GetMapping(value = SHOW_NEWS)
    public SimpleDTO<Page<DNewsInformationDTO>> getNews(@RequestParam(name="pageIndex", defaultValue="1") Integer pageIndex,
                                                        @RequestParam(name="pageSize", defaultValue="9") Integer pageSize) {
        SimpleDTO<Page<DNewsInformationDTO>> simpleDTO;
        Page<DNewsInformation> newsPage = newsInformationService.getPageNews(pageIndex, pageSize);

        if (CollectionUtils.isEmpty(newsPage.getRecords())){
            simpleDTO = new SimpleDTO<>(CodeEnum.DATA_NOT_FOUND);
            return simpleDTO;
        }
        Page<DNewsInformationDTO> newDTOPage = new Page<>();
        BeanUtils.copyProperties(newsPage, newDTOPage);

        List<DNewsInformationDTO> list = ListUtils.entityListToModelList(newsPage.getRecords(),DNewsInformationDTO.class);
        simpleDTO = new SimpleDTO<>(CodeEnum.SUCCESS);
        simpleDTO.setData(newDTOPage.setRecords(list));

        return simpleDTO;
    }

}
