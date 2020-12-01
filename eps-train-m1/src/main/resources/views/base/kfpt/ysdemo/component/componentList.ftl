<@xy.html>
<@xy.html_head value="系统组件样式">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_head>
    <@xy.page_head_top>
        <@xy.select_line label="状态" list=sjMap type="multiple" value="${queryVo.includeItem['zt']}" id="zt" name="includeItem[zt]" position="search"/><br/><br/>
        源码：<@xy.insert type="text" value='<@xy.select_line label="状态" list=sjMap type="multiple" value="${queryVo.includeItem["zt"]}" id="zt" name="includeItem[zt]" position="search"/>' position="search"/><br/><br/>
        select_line组件备注：type="single"表示只能单选，type="multiple"表示可以多选，isshowall=true表示显示全部，isshowall=false表示不显示全部<br/><br/>
        <@xy.calendar_group label="注册时间" value1="" value2="" name1="greaterItem[cjsj]" name2="lessItem[cjsj]" id1="startTime" id2="endTime" position="search" time=false placeholder1="注册时间" placeholder2="注册时间"  suffixname1="defalutSuffixItem[cjsj]" suffixvalue1="000000"  suffixname2="defalutSuffixItem[cjsj_0]" suffixvalue2="235959"/><br/><br/>
        源码：<@xy.insert type="text" value='<@xy.calendar_group label="注册时间" value1="${queryVo.greaterItem["cjsj"]}" value2="${queryVo.lessItem["cjsj"]}" name1="greaterItem[cjsj]" name2="lessItem[cjsj]" id1="startTime" id2="endTime" position="search" time=false placeholder1="注册时间" placeholder2="注册时间"  suffixname1="defalutSuffixItem[cjsj]" suffixvalue1="000000"  suffixname2="defalutSuffixItem[cjsj_0]" suffixvalue2="235959"/>' position="search"/><br/><br/>
        双日期查询组件备注：日期查询页面上统一展示8位，数据库也存8位的不需要suffixname1、suffixvalue1、suffixname2、suffixvalue2属性，数据库存14位的需要自动补齐<br/><br/>
    </@xy.page_head_top>
    <@xy.page_head_more>
    </@xy.page_head_more>
    <@xy.searchButton />
</@xy.page_head>
<@xy.page_content>
    <@xy.content_title value="个性组件样式">
    </@xy.content_title>
    <@xy.content_body type="edit">
        <@xy.form id="form2">
            <@xy.input_select_group label="注册资本" value1="" value2="" value3="" name1="zczb" name2="zbdw" name3="bz" id1="zczb" id2="zbdw" id3="bz" placeholder1="注册资本"  headerValue1="请选择币种单位" headerValue2="请选择币种" list1=sjMap list2=sjMap position="edit"/>
            <@xy.insert label="源码" type="text" value='<@xy.input_select_group label="注册资本" value1="" value2="" value3="" name1="zczb" name2="zbdw" name3="bz" id1="zczb" id2="zbdw" id3="bz" placeholder1="注册资本"  headerValue1="请选择币种单位" headerValue2="请选择币种" list1=sjMap list2=sjMap position="edit"/>' position="edit"/>
            <@xy.calendar_group label="有效期"value1="" value2="" position="edit"  time="false" id1="fzrq" name1="fzrq" id2="sxrq" name2="sxrq"/>
            <@xy.insert label="源码" type="text" value='<@xy.calendar_group label="有效期"value1="" value2="" position="edit"  time="false" id1="fzrq" name1="fzrq" id2="sxrq" name2="sxrq"/>' position="edit"/>
            <@xy.text label="中标金额" type="text" value="" name="danhwb" id="danhwb" position="edit" placeholder="中标金额" endtext="万元"/>
            <@xy.insert label="源码" type="text" value='<@xy.text label="" type="text" value="" name="danhwb" id="danhwb" position="edit" placeholder="中标金额" endtext="万元"/>' position="edit"/>
        </@xy.form>
    </@xy.content_body>
    <@xy.content_title value="通用组件样式">
    </@xy.content_title>
    <@xy.content_body type="edit">
        <@xy.form id="form3">
        <@xy.text label="单行文本框" type="text" value="" name="danhwb" id="danhwb" position="edit" placeholder="单行文本框">
            <span style="color:crimson;size: letter">
            <@xy.insert label="源码" type="text" value='<@xy.text label="" type="text" value="" name="danhwb" id="danhwb" position="edit" placeholder="单行文本框"/>' position="blank"/>
            </span>
        </@xy.text>
        <@xy.textarea label="多行文本框" value="" name="duohwb" id="duohwb" position="edit" placeholder="多行文本框">
            <span style="color:crimson;size: letter">
            <@xy.insert label="源码" type="text" value='<@xy.textarea label="" value="" name="duohwb" id="duohwb" position="edit" placeholder="多行文本框"/>' position="blank"/>
            </span>
        </@xy.textarea>
        <@xy.select label="单选下拉框"  headerValue="请选择" list=sjMap value="xlk" name="xlk" id="" position="edit" placeholder="下拉框">
             <span style="color:crimson;size: letter">
                <@xy.insert label="源码" type="text" value='<@xy.select label="单选下拉框" headerValue="请选择" list=sjMap value="" name="xlk" id="xlk" position="blank" placeholder="单选下拉框"/>' position="blank"/>
             </span>
        </@xy.select>
        <@xy.select label="多选下拉框" multiple="multiple" list=sjMap value="xlkdx" name="xlkdx" id="" position="edit" placeholder="下拉框">
           <span style="color:crimson;size: letter">
              <@xy.insert label="源码" type="text" value='<@xy.select label="多选下拉框" multiple="multiple" headerValue="请选择" list="sjMap" value="" name="xlkdx" id="xlkdx" position="edit" placeholder="多选下拉框"/>' position="blank"/>
           </span>
        </@xy.select>
        <@xy.radio label="单选按钮" list=sjMap value="" name="dxk" position="edit">
           <span style="color:crimson;size: letter">
           <br/> <@xy.insert label="源码" type="text" value='<@xy.radio label="单选按钮" list=sjMap value="" name="dxk" position="edit"/>' position="blank"/>
           </span>
        </@xy.radio>
        <@xy.checkbox label="复选框" list=sjMap value=sjList name="fxk" position="edit">
        <span style="color:crimson;size: letter">
         <br/><@xy.insert label="源码" type="text" value='<@xy.checkbox label="复选框" list=sjMap value="sjList" name="fxk" position="edit"/>' position="blank"/>
        </span>
        </@xy.checkbox>
        <@xy.calendar label="日期" time=false value="" name="rq" id="rq" position="edit">
          <span style="color:crimson;size: letter">
            <@xy.insert label="源码" type="text" value='<@xy.calendar label="日期" time=false value="" id="rq" name="rq" position="edit"/>' position="blank"/>
        </span>
        </@xy.calendar>
        <@xy.calendar label="日期时间" value="" name="rqsj" id="rqsj" position="edit">
          <span style="color:crimson;size: letter">
        <@xy.insert label="源码" type="text" value='<@xy.calendar label="日期时间" value="" id="rqsj" name="rqsj" position="edit"/>' position="blank"/>
          </span>
        </@xy.calendar>
        <@xy.button_group label="button_group" id="yhmc" name="yhmc" value="" placeholder="button_group" position="edit" onclick="openWindowForzj(this,'yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');">
        </@xy.button_group>
        <@xy.text value="" id="yhxz" name="yh" type="hidden"/>
        <@xy.textarea label="源码" name="button_group" id="button_group" maxlength="1333" autoheight=true value='<@xy.button_group label="button_group" id="yhmc" name="yhmc" value="" placeholder="button_group" position="edit" onclick="openWindowForzj(this,"yh","{ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}","nomal");"/>
    <@xy.text value="" id="yhxz" name="yh" type="hidden"/>
    <script type="text/javascript">
        $(function () {
            window.addEventListener("message", function (e) {
                var datas = JSON.parse(e.data);
                if (datas.method == "sendRyValue") {
                    $("#" + buttonId + "xz").val(datas.params.ryid);
                    $("#" + buttonId + "mc").val(datas.params.rymc);
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
    </script>' position="edit"/>
        <@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="区域选择" value="" name="qy" position="edit" >
            <span style="color:crimson;size: letter">
           <@xy.insert label="源码" type="text" value='<@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="区域选择" value="" name="qy" position="edit"/>' position="blank"/>
          </span>
        </@xy.code>
        <@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" placeholder="区域多选选择" value= name="qydx" position="edit">
            <span style="color:crimson;size: letter">
               <@xy.insert label="源码" type="text" value='<@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" placeholder="区域多选" value= name="qydx" position="edit"/>' position="blank"/>
            </span>
        </@xy.code>
        <@xy.upload label="图片" type="img" id="tp" name="tp" value="" max_count="1" max_file_size="200mb" >
              <span style="color:crimson;size: letter">
                  <@xy.insert label="源码" type="text" value='<@xy.upload label="图片" type="img" id="tp" name="tp" value="" max_count="1" max_file_size="200mb"/>' position="blank"/>
              </span>
        </@xy.upload>
        <@xy.upload label="附件" id="fj" name="fj" value="" max_count="1" required=true max_file_size="200mb" >
              <span style="color:crimson;size: letter">
                  <@xy.insert label="源码" type="text" value='<@xy.upload label="附件" id="fj" name="fj" value="" max_count="1" max_file_size="200mb"/>' position="blank"/>
              </span>
        </@xy.upload>
        <@xy.input_suggest label="可输入可选择组件" value="" class="form-control" name="input_suggest" id="input_suggest" position="edit" placeholder="可输入可选择组件"/>
        <@xy.textarea label="源码" name="tablecode" id="tablecode" maxlength="1333" autoheight=true value='<@xy.input_suggest label="可输入可选择组件" value="" class="form-control" name="input_suggest" id="input_suggest" position="edit" placeholder="可输入可选择组件"/>>
<@xy.script src="js/plugins/suggest/bootstrap-suggest.min.js"/>
<script type="text/javascript">
    $(function () {
       $("#input_suggest").bsSuggest({
                url: "${ctx}/base/kfpt/ysdemo/button/tablecodeAjax"
            });
    });
</script>' position="edit"/>
    </@xy.form>
    </@xy.content_body>
<@xy.foot_script >
    <@xy.script src="js/plugins/suggest/bootstrap-suggest.min.js"/>
</@xy.foot_script>
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
        }, false);
        $("#input_suggest").bsSuggest({
            url: "${ctx}/base/kfpt/ysdemo/button/tablecodeAjax",
            idField: 'id',
            keyField: 'name'
        });
    });

    function openWindowForzj(obj, buttonid, url,size,title) {
        buttonId = buttonid;
        openWindow({
            action: url,
            size:size,
            title:title
        })
    }
</script>
<@xy.page_footer>
</@xy.page_footer>
</@xy.page_content>
</@xy.container>
</@xy.html_body>
</@xy.html>
