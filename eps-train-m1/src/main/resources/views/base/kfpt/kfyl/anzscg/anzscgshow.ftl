<@xy.html>
<@xy.html_head value="按钮增删查改[kf_anzscg]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
<@xy.container>
<@xy.page_content>
<@xy.content_title value="查看按钮增删查改[kf_anzscg]">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="formx" >
        <@xy.insert label="标识" value=kf_anzscg.bs position="edit"/>
        <@xy.insert label="名称" value=kf_anzscg.mc position="edit"/>
</table>
<@xy.content_submit>
        <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/anzscg')"/>
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

