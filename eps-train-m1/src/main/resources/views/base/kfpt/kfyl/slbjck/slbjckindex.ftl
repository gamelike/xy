<@xy.html>
<@xy.html_head value="双列编辑查看管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.form id="autoForm" position="search">
<@xy.container>
<@xy.page_head value="双列编辑查看" value_note="双列编辑查看管理">
<@xy.page_head_top>
    <@xy.text label="单行文本框" value="${queryVo.likeItem['danhwb'] }" name="likeItem[danhwb]" id="danhwb" type="text" position="search"/>
    <@xy.select list=xlkData  class="chosen-select-more form-control" value="${queryVo.equalItem['xlk'] }" name="equalItem[xlk]" position="search" label="下拉框" headerValue="请选择下拉框"/>
</@xy.page_head_top>
<@xy.page_head_more>
</@xy.page_head_more>
<@xy.searchButton />
</@xy.page_head>
<@xy.page_content>
<@xy.content_title value="双列编辑查看">
    <@xy.button type="add" onclick="forward(this)" url="${ctx}/base/kfpt/kfyl/slbjck/addKf_slbjck"/>
</@xy.content_title>
<@xy.content_body>
<div class="grid">
    <div class="thead">
        <ul>
            <li style="width:10%">单行文本框</li>
            <li style="width:10%">下拉框</li>
            <li style="width:15%">下拉框多选</li>
            <li style="width:10%">单选按钮</li>
            <li style="width:10%">复选框</li>
            <li style="width:10%">区域</li>
            <li style="width:15%">区域多选</li>
            <li style="width:10%">图片</li>
            <li style="width:10%">操作</li>
        </ul>
    </div>
    <div class="tbody">
    <#list listKf_slbjck as kf_slbjck>
        <ul>
            <li style="width:10%"><@xy.insert value=kf_slbjck.danhwb/></li>
            <li style="width:10%"><@xy.insert type="map" list=xlkData value=kf_slbjck.xlk/></li>
            <li style="width:15%"><@xy.insert type="multiple" list=xlkdxData value=kf_slbjck.xlkdx/></li>
            <li style="width:10%"><@xy.insert type="map" list=dxkData value=kf_slbjck.dxk/></li>
            <li style="width:10%"><@xy.insert type="multiple" list=fxkData value=kf_slbjck.fxk/></li>
            <li style="width:10%"><@xy.insert type="code" lbbs="XZQY" value=kf_slbjck.qy/></li>
            <li style="width: 15%"><@xy.insert type="code_multiple" lbbs="XZQY" list=qydxData value=kf_slbjck.qydx/></li>
            <li style="width:10%"><@xy.download type="img" value=kf_slbjck.tp id=kf_slbjck.tp position="search"/></li>
            <li style="width:10%">
              <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/slbjck/editKf_slbjck" parameters="{'id':'${kf_slbjck.id}'}"/>
              <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/slbjck/showKf_slbjck" parameters="{'id':'${kf_slbjck.id}'}" text="查看"/>
              <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);"  url="${ctx}/base/kfpt/kfyl/slbjck/deleteKf_slbjck" parameters="{'id':'${kf_slbjck.id}'}" text="删除" ignoretrt=true />
            </li>
        </ul>
    </#list>
    </div>
</div>
<@xy.splittoolbar />
<@xy.foot_script/>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.form>
</@xy.html_body>
</@xy.html>
