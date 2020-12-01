<@xy.html>
<@xy.html_head value="单表增删查改[kf_dbzscg]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.container type="sjbq">
<@xy.page_content>
<@xy.content_title value="查看单表增删查改[kf_dbzscg]">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="formx" >
        <@xy.insert label="单行文本框" value=kf_dbzscg.danhwb position="edit"/>
        <@xy.insert label="多行文本框" value=kf_dbzscg.duohwb position="edit"/>
        <@xy.insert label="下拉框" type="map" list=xlkData value=kf_dbzscg.xlk position="edit"/>
        <@xy.insert label="下拉框多选" type="multiple" list=xlkdxData value=kf_dbzscg.xlkdx position="edit"/>
        <@xy.insert label="单选按钮" type="map" list=dxkData value=kf_dbzscg.dxk position="edit"/>
        <@xy.insert label="复选框" type="multiple" list=fxkData value=kf_dbzscg.fxk position="edit"/>
        <@xy.insert label="日期" value=kf_dbzscg.rq type="calendar" position="edit"/>
        <@xy.insert label="日期时间" value=kf_dbzscg.rqsj type="calendar" position="edit"/>
        <@xy.insert label="用户" value=kf_dbzscg.yhmc position="edit"/>
        <@xy.insert label="机构" value=kf_dbzscg.jgmc position="edit"/>
        <@xy.insert label="区域" type="code" lbbs="XZQY" value=kf_dbzscg.qy position="edit"/>
        <@xy.insert label="区域多选" type="code_multiple" lbbs="XZQY" list=qydxData value=kf_dbzscg.qydx position="edit"/>
        <@xy.download label="图片" type="img" value=kf_dbzscg.tp id=kf_dbzscg.tp position="edit"/>
        <@xy.download label="附件" value=kf_dbzscg.fj id=kf_dbzscg.fj position="edit"/>
        <@xy.insert label="备注" value=kf_dbzscg.beiz position="edit"/>
</table>
<@xy.content_submit>
        <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/dbzscg')"/>
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

