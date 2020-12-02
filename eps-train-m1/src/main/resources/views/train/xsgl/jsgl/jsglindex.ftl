<@xy.html>
    <@xy.html_head value="教师管理平台"></@xy.html_head>
    <@xy.html_body>
        <@xy.nav />
        <@xy.form id="autoForm" position="search">
        <@xy.container>
            <@xy.page_head value="搜索条件">
                    <@xy.text label="教师名称" value="${queryVo.likeItem['xm']}" name="likeItem[xm]"
                        id="xm" type="text" position="search"/>
                    <@xy.select list=zgxlData value="${queryVo.equalItem['zgxl']}" name="equalItem[zgxl]"
                        label="最高学历" position="search"/>
                    <@xy.calendar label="出生年月" value="${queryVo.greaterItem['csrq']}" name="queryVo.greaterItem['csrq']"
                        id="csrq" position="search" time=false placeholder="出生日期"/>
                <@xy.searchButton />
            </@xy.page_head>
        <@xy.page_content>
            <@xy.content_title value="教师信息">
                <@xy.button type="add" onclick="forward(this)" url="${ctx}/train/xsgl/jsgl/zyf/addXs_teacher"/>
            </@xy.content_title>
        <@xy.content_body>
        <div class="grid">
            <div class="thead">
                <ul>
                    <li style="width:10%">序号</li>
                    <li style="width:10%">姓名</li>
                    <li style="width:15%">性别</li>
                    <li style="width:10%">联系方式</li>
                    <li style="width:10%">最高学历</li>
                    <li style="width:10%">出生日期</li>
                    <li style="width:15%">操作</li>
                </ul>
            </div>
            <div class="tbody" id="jsgl">
                <#list listXs_teacher as xs_teacher>
                    <ul>
                        <li style="width:10%"><span class="xh"></span></li>
                        <li style="width:10%"><@xy.insert value=xs_teacher.xm/></li>
                        <li style="width:15%"><@xy.insert value=xs_teacher.xb type="map" list=xbData /></li>
                        <li style="width:10%"><@xy.insert value=xs_teacher.lxfs/></li>
                        <li style="width:10%"><@xy.insert type="map" list=zgxlData value=xs_teacher.zgxl/></li>
                        <li style="width:10%"><@xy.insert value=xs_teacher.csrq type="calendar"/></li>
                        <li style="width:15%">
                            <@xy.button type="edit_line" onclick="forward(this);"
                                url="${ctx}/train/xsgl/jsgl/zyf/editXs_teacher" parameters="{'id':'${xs_teacher.id}'}"/>
                            <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);"
                                url="${ctx}/train/xsgl/jsgl/zyf/deleteXs_teacher" parameters="{'id':'${xs_teacher.id}'}" text="删除" ignoretrt=true />
                        </li>
                    </ul>
                </#list>
            </div>
        </div>
            <@xy.splittoolbar />
            <@xy.foot_script/>
            <script type="text/javascript">
                $(function sortxh(){
                    $("#jsgl").find("span[class='xh']").each(function (index) {
                        $(this).html(index+1);
                    });
                })
            </script>
        </@xy.content_body>
            </@xy.page_content>
            <@xy.page_footer>
            </@xy.page_footer>
        </@xy.container>
        </@xy.form>
    </@xy.html_body>
</@xy.html>