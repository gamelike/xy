<@xy.html>
<@xy.html_head value="主子表父表[kf_zzb_fb]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
<@xy.form id="autoForm"  enctype="multipart/form-data" position="search">
<@xy.container>
<@xy.page_head value="主子表父表[kf_zzb_fb]" value_note="主子表父表[kf_zzb_fb]管理" more=true>
<@xy.page_head_top>
    <@xy.text label="单行文本框" value="${queryVo.likeItem['danhwb'] }" name="likeItem[danhwb]" id="danhwb" type="text" position="search"/>
    <@xy.text label="多行文本框" value="${queryVo.likeItem['duohwb'] }" name="likeItem[duohwb]" id="duohwb" type="text" position="search"/>
    <@xy.select list=xlkData value="${queryVo.equalItem['xlk'] }" name="equalItem[xlk]" position="search" label="下拉框"/>
    <@xy.select multiple="multiple" list=xlkdxData value=xlkdxArrays name="includeItem[xlkdx]" position="search" label="下拉框多选"/>
    <@xy.calendar label="日期" value="${queryVo.greaterItem['rq'] }" name="greaterItem[rq]" id="rq" position="search" time=false placeholder="日期"/>
</@xy.page_head_top>
<@xy.page_head_more>
    <@xy.radio list=dxkData value="${queryVo.equalItem['dxk'] }" name="equalItem[dxk]" position="search" label="单选按钮"/>
    <@xy.checkbox list=fxkData value=fxkArrays name="equalItem[fxk]" position="search" label="复选框"/>
    <@xy.calendar label="日期时间" value="${queryVo.greaterItem['rqsj'] }" name="greaterItem[rqsj]" id="rqsj" position="search" time=false placeholder="日期时间"/>
    <@xy.button_group label="用户" id="yhmc" placeholder="选择" value="${queryVo.equalItem['yhmc'] }" name="equalItem[yhmc]" position="search" onclick="openWindowForzj(this,'yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');"/>
    <@xy.button_group label="机构" id="jgmc" placeholder="选择" value="${queryVo.equalItem['jgmc'] }" name="equalItem[jgmc]" position="search" onclick="openWindowForzj(this,'jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) +PublicPageHelper.JG_TREE}','small','选择机构');"/>
    <@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="选择" value="${queryVo.equalItem['qy']}" name="equalItem[qy]" position="search"/>
</@xy.page_head_more>
<@xy.searchButton />
</@xy.page_head>
<@xy.page_content>
<@xy.content_title value="主子表父表[kf_zzb_fb]">
    <@xy.button type="add" onclick="forward(this)" url="${ctx}/base/kfpt/kfyl/zzb/addKf_zzb_fb"/>
    <@xy.button type="sort" onclick="openWindow(this);" url="/base/kfpt/kfyl/zzb/sortKf_zzb_fb"/>
    <!--excel导出-->
    <div class="btn-group">
        <a class="btn btn-manual" data-toggle="dropdown" data-hover="dropdown">
            <i class="iconfont icon-daochu"></i>导出
        </a>
        <ul class="dropdown-menu pull-right" id="dropUl">
        </ul>
    </div>
</@xy.content_title>
<@xy.content_body>
<div class="grid">
    <div class="thead">
        <ul>
            <li style="width:10%">序号</li>
            <li style="width:10%">下拉框</li>
            <li style="width:10%">下拉框多选</li>
            <li style="width:10%">复选框</li>
            <li style="width:10%">日期</li>
            <li style="width:10%">区域</li>
            <li style="width:10%">区域多选</li>
            <li style="width:10%">图片</li>
            <li style="width:10%">附件</li>
            <li style="width:10%">操作</li>
        </ul>
    </div>
    <div class="tbody">
<#list listKf_zzb_fb as kf_zzb_fb>
        <ul>
            <li style="width:10%"><@xy.insert value=kf_zzb_fb_index+1/></li>
            <li style="width:10%"><@xy.insert type="map" list=xlkData value=kf_zzb_fb.xlk/></li>
            <li style="width:10%"><@xy.insert type="multiple" list=xlkdxData value=kf_zzb_fb.xlkdx/></li>
            <li style="width:10%"><@xy.insert type="multiple" list=fxkData value=kf_zzb_fb.fxk/></li>
            <li style="width:10%"><@xy.insert value=kf_zzb_fb.rq type="calendar"/></li>
            <li style="width:10%"><@xy.insert type="code" lbbs="XZQY" value=kf_zzb_fb.qy/></li>
            <li style="width: 10%"><@xy.insert type="code_multiple" lbbs="XZQY" list=qydxData value=kf_zzb_fb.qydx/></li>
            <li style="width:10%"><@xy.download type="img" value=kf_zzb_fb.tp id=kf_zzb_fb.tp position="search"/></li>
            <li style="width:10%"><@xy.download value=kf_zzb_fb.fj id=kf_zzb_fb.fj position="search"/></li>
            <li style="width:10%" nowrap="nowrap">
                <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/zzb/editKf_zzb_fb" parameters="{'id':'${kf_zzb_fb.id}'}"/>
                <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/zzb/showKf_zzb_fb" parameters="{'id':'${kf_zzb_fb.id}'}" text="查看"/>
                <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);"  url="${ctx}/base/kfpt/kfyl/zzb/deleteKf_zzb_fb" parameters="{'id':'${kf_zzb_fb.id}'}" text="删除" ignoretrt=true />
            </li>
        </ul>
</#list>
    </div>
</div>
    <table id="exporttable"  style="display: none">
        <thead>
        <tr>
            <th data-column="xlk" data-visible=true data-toggleColumn="true">
                下拉框
            </th>
            <th data-column="xlkdx" data-visible=true data-toggleColumn="true">
                下拉框多选
            </th>
            <th data-column="fxk" data-visible=true data-toggleColumn="true">
                复选框
            </th>
            <th data-column="rq" data-visible=true data-toggleColumn="true">
                日期
            </th>
            <th data-column="qy" data-visible=true data-toggleColumn="true">
                区域
            </th>
            <th data-column="qydx" data-visible=true data-toggleColumn="true">
                区域多选
            </th>
            <th data-column="tp" data-visible=true data-toggleColumn="true">
                图片
            </th>
            <th data-column="fj" data-visible=true data-toggleColumn="true">
                附件
            </th>
        </tr>
        </thead>
        <tbody>
        <@xy.text value="" name="exportColumns" id="exportColumns" type="hidden"/>
        <a href="#" id="exportA" formid="autoForm" onclick="forward(this,{'target':'_blank','method':'post','exportExcel':true});" url="${ctx}/base/kfpt/kfyl/zzb/excel" style="display: none">导出</a>
        </tbody>
    </table>
<@xy.splittoolbar />
<@xy.foot_script/>
<script type="text/javascript">
    var buttonId;
    $(function () {
        window.addEventListener('message', function (e) {
            var datas = JSON.parse(e.data);
            if (datas.method == "sendRyValue") {
                $("#" + buttonId + "xz").val(datas.params.ryid);
                $("#" + buttonId + "mc").val(datas.params.rymc);
                shut(datas.params.windowName);
            }
            if (datas.method == "sendZzValue") {
                $("#" + buttonId + "xz").val(datas.params.zzid);
                $("#" + buttonId + "mc").val(datas.params.zzmc);
                shut(datas.params.windowName);
            }
        }, false);
    });
    function openWindowForzj(obj, buttonid, url,size,title) {
        buttonId = buttonid;
        openWindow({
            action: url,
            size:size,
            title:title
        })
    }

    //初始化导出excel列
    $(document).ready(function () {
        var html = [];
        $("#exporttable").find('th').each(function (i, column) {
            if ($(this).attr("data-toggleColumn")=="true") {
                html.push('\n<li><label class="checkbox checkbox-primary checkbox-inline"><input type="checkbox" id='+$(this).attr("data-column")+' value='+$(this).html()+' checked="checked"><label for="checkbox" >'+$(this).html()+'</label></label></li>');
            }else{
                html.push('\n<li><label class="checkbox checkbox-primary checkbox-inline"><input type="checkbox" id='+$(this).attr("data-column")+' value='+$(this).html()+'><label for="checkbox" >'+$(this).html()+'</label></label></li>');
            }
        });
        html.push('\n<li class="divider"></li>');
        html.push('<li><a onclick="exportThis(this)">导出列表内容</a></li>');
        $("#dropUl").append(html.join(''));
    });

    //导出excel
    function exportThis(obj) {
        $("#exportColumns").val("");
        var visibleColumnsExcel=new Array();
        var sxh=0;
        $("#dropUl").find('input[type="checkbox"]').each(function () {
            if ($(this).is(':checked')==true) {
                var thObj = new Object();
                thObj.column=$(this).attr("id");
                thObj.title=$(this).val();
                visibleColumnsExcel[sxh] = thObj;
                sxh++;
            }
        });
        $("#exportColumns").val(JSON.stringify(visibleColumnsExcel));
        $("#exportA").click();
    }
</script>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.form>
</@xy.html_body>
</@xy.html>
