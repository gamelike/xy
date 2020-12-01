<@xy.html>
<@xy.html_head value="树管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="查看树">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="formx">
        <@xy.insert label="单行文本框" value=gg_tree_detail.danhwb position="edit"/>
        <@xy.insert label="多行文本框" value=gg_tree_detail.duohwb position="edit"/>
        <@xy.insert label="单选框" type="map" list=dxkData value=gg_tree_detail.dxk position="edit"/>
        <@xy.insert label="复选框" type="multiple" list=fxkData value=gg_tree_detail.fxk position="edit"/>
        <@xy.insert label="下拉框" type="map" list=xlkData value=gg_tree_detail.xlk position="edit"/>
        <@xy.insert label="人员" value=gg_tree_detail.rymc position="edit" />
        <@xy.insert label="机构" value=gg_tree_detail.jgmc position="edit" />
        <@xy.insert label="区域" type="code" lbbs="XZQY" value=gg_tree_detail.qy position="edit"/>
        <@xy.insert label="区域多选" type="code_multiple" lbbs="XZQY" list=qydxData value=gg_tree_detail.qydx position="edit"/>
        <@xy.download label="附件" value=gg_tree_detail.fj id=gg_tree_detail.fj position="edit"/>
</table>
<@xy.content_submit>
<@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/treeform')"/>
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

