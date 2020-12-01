<@xy.html>
    <@xy.html_head value="学生信息管理">
    </@xy.html_head>
    <@xy.html_body>
        <@xy.nav />
        <@xy.container>
            <@xy.page_content>
                <@xy.content_title value="学生信息编辑">
                </@xy.content_title>
                <@xy.content_body type="edit">
                    <@xy.form id="form" >
                        <@xy.text label="姓名" type="text" value=xs_student.xm name="xm"
                        id="xm" position="edit" placeholder="姓名" required=true />
                        <@xy.radio label="性别" list=xbData value=xs_student.xb name="xb" position="edit" required=true />
                        <@xy.text label="学号" type="text" value=xs_student.xh name="xh"
                        id="xh" position="edit" placeholder="学号" required=true />
                        <@xy.text label="联系方式" type="text" value=xs_teacher.lxfs name="lxfs"
                        id="lxfs" position="edit" placeholder="联系方式" required=true />
                        <@xy.calendar label="出生日期" id="csrq" placeholder="出生日期" time=false
                        value=xs_student.csrq name="csrq" position="edit" required=true />
                        <@xy.calendar label="入校日期" id="rxrq" placeholder="入校日期" time=false
                        value=xs_student.rxrq name="rxrq" position="edit" required=true />
                        <@xy.textarea label="家庭住址" value=xs_student.jtzz name="jtzz" id="jtzz"
                        position="edit" placeholder="家庭住址" required=true />
                        <@xy.upload label="头像" id="fj" name="fj" value=xs_student.fj
                            max_count="1" max_file_size="200mb" required=true />
                        <@xy.textarea label="备注" value=xs_student.bz name="bz" id="bz"
                        position="edit" placeholder="备注" required=false />

                        <@xy.content_submit>
                            <@xy.button url="${ctx}/train/xsgl/xsgl/saveXs_student_detail" type="save_bottom" onclick="submitx(this,'form')"/>
                            <@xy.button type="back_bottom" onclick="back('${ctx}/train/xsgl/xsgl')"/>
                        </@xy.content_submit>
                        <@xy.text value=xs_student.id name="id" id="id" type="hidden"/>
                        <@xy.text value=xs_student.njbh name="njbh" id="njbh" type="hidden"/>
                    </@xy.form>
                    <@xy.foot_script >
                        <@xy.scriptCurrent src="js/train/xsgl/xsgl/xsglValidate.js"/>
                    </@xy.foot_script>
                    <script type="text/javascript">
                        function submitx(obj, formid) {
                            $("#form").validate(validate);
                            if ($("#" + formid).validate(validate).form()) {
                                hold(obj, function (returnValue) {
                                    popupOk(returnValue, function () {
                                        back("${ctx}/train/xsgl/xsgl");
                                    }, function () {
                                        $("#" + formid).validate(validate).form();
                                    })
                                })
                            }
                        }
                    </script>
                </@xy.content_body>
            </@xy.page_content>
            <@xy.page_footer>
            </@xy.page_footer>
        </@xy.container>
    </@xy.html_body>
</@xy.html>

