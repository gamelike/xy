<@xy.html>
<@xy.html_head value="双列编辑查看管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="查看双列编辑查看">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="formx">
<@xy.sub type="main-left">
     <@xy.insert label="单行文本框" value=kf_slbjck.danhwb position="edit_two"/>
     <@xy.insert label="多行文本框" value=kf_slbjck.duohwb position="edit_two"/>
     <@xy.insert label="下拉框" type="map" list=xlkData value=kf_slbjck.xlk position="edit_two"/>
     <@xy.insert label="下拉框多选" type="multiple" list=xlkdxData value=kf_slbjck.xlkdx position="edit_two"/>
     <@xy.insert label="单选按钮" type="map" list=dxkData value=kf_slbjck.dxk position="edit_two"/>
     <@xy.insert label="复选框" type="multiple" list=fxkData value=kf_slbjck.fxk position="edit_two"/>
     <@xy.insert label="日期" value=kf_slbjck.rq type="calendar" position="edit_two"/>
</@xy.sub>
<@xy.sub type="main-right">
    <@xy.insert label="日期时间" value=kf_slbjck.rqsj type="calendar" position="edit_two"/>
    <@xy.insert label="用户" value=kf_slbjck.yhmc position="edit_two"/>
    <@xy.insert label="机构" value=kf_slbjck.jgmc position="edit_two"/>
    <@xy.insert label="区域" type="code" lbbs="XZQY" value=kf_slbjck.qy position="edit_two"/>
    <@xy.insert label="区域多选" type="code_multiple" lbbs="XZQY" list=qydxData value=kf_slbjck.qydx position="edit_two"/>
    <@xy.download label="图片" type="img" value=kf_slbjck.tp id=kf_slbjck.tp position="edit_two"/>
    <@xy.download label="附件" value=kf_slbjck.fj id=kf_slbjck.fj position="edit_two"/>
</@xy.sub>
<@xy.content_submit>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/slbjck')"/>
</@xy.content_submit>
</@xy.form>
<@xy.foot_script >
</@xy.foot_script>
</@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.html_body>
</@xy.html>

