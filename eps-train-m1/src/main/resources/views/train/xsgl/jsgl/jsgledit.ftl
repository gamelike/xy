<@xy.html>
    <@xy.html_head value="教师信息编辑">
    </@xy.html_head>
    <@xy.html_body>
        <@xy.nav/>
        <@xy.container>
            <@xy.page_content>
                <@xy.content_title value="教师信息编辑">
                </@xy.content_title>
                <@xy.content_body type="edit">
                    <@xy.form id="form">
                        <@xy.text label="姓名" type="text" value=xs_teacher.xm name="xm"
                            id="xm" position="edit" placeholder="姓名" required=true />
                        <@xy.radio label="性别" list=xbData value=xs_teacher.xb name="xb" position="edit" required=true />
                        <@xy.text label="联系方式" type="text" value=xs_teacher.lxfs name="lxfs"
                            id="lxfs" position="edit" placeholder="姓名" required=true />
                        <@xy.calendar label="出生日期" id="csrq" placeholder="出生日期" time=false
                            value=xs_teacher.csrq name="csrq" position="edit" required=true />
                        <@xy.select label="最高学历" headerValue="请选择学历" placeholder="请选择学历" list=zgxlData value=xs_teacher.zgxl
                            name="zgxl" id="zgxl" position="edit" required=true />
                        <@xy.textarea label="家庭住址" value=xs_teacher.jtzz name="jtzz" id="jtzz"
                            position="edit" placeholder="家庭住址" required=true />
                        <@xy.textarea label="备注" value=xs_teacher.bz name="bz" id="bz"
                            position="edit" placeholder="备注" required=false />
                        <@xy.content_submit>
                            <@xy.button url="${ctx}/train/xsgl/jsgl/zyf/saveXs_teacher" type="save_bottom" onclick="submitx(this,'form')"/>
                            <@xy.button type="back_bottom" onclick="back('${ctx}/train/xsgl/jsgl/zyf')"/>
                        </@xy.content_submit>
                        <@xy.text value=xs_teacher.id name="id" id="id" type="hidden"/>
                    </@xy.form>
                </@xy.content_body>
                <@xy.foot_script>
                    <@xy.scriptCurrent src="js/train/xsgl/jsgl/JsglValidate.js"/>
                </@xy.foot_script>
                <script type="text/javascript">
                    function submitx(obj, formid) {
                        $("#form").validate(validate);
                        if ($("#" + formid).validate(validate).form()) {
                            hold(obj, function (returnValue) {
                                popupOk(returnValue, function () {
                                    back("${ctx}/train/xsgl/jsgl/zyf");
                                }, function () {
                                    $("#" + formid).validate(validate).form();
                                })
                            })
                        }
                    }
                </script>
            </@xy.page_content>
            <@xy.page_footer>
            </@xy.page_footer>
        </@xy.container>
    </@xy.html_body>
</@xy.html>