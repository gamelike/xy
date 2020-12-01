<@xy.html>
<@xy.html_head value="系统按钮样式">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_head>
    <@xy.page_head_top>
        <@xy.text label="单行文本框" value="${queryVo.likeItem['danhwb'] }" name="likeItem[danhwb]" id="danhwb" type="text" position="search"/>
        <@xy.calendar label="日期" value="${queryVo.greaterItem['rq'] }" name="greaterItem[rq]" id="rq" position="search" time=false placeholder="日期"/>
    </@xy.page_head_top>
    <@xy.page_head_more>
    </@xy.page_head_more>
    <@xy.searchButton />
</@xy.page_head>
<@xy.form id="formx" position="search">
<@xy.page_content>
<@xy.content_title value="列表右上角按钮样式">
</@xy.content_title>
    <@xy.content_body type="edit">
        <@xy.insert value='<@xy.button type="add"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="add"/></@xy.insert>
        <@xy.insert value='<@xy.button type="show"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="show"/></@xy.insert>
        <@xy.insert value='<@xy.button type="view"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="view"/></@xy.insert>
        <@xy.insert value='<@xy.button type="edit"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="edit"/></@xy.insert>
        <@xy.insert value='<@xy.button type="delete"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="delete"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="refresh"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="refresh"/></@xy.insert>
        <@xy.insert value='<@xy.button type="choose"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="choose"/></@xy.insert>
        <@xy.insert value='<@xy.button type="save"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="save"/></@xy.insert>
        <@xy.insert value='<@xy.button type="back"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="back"/></@xy.insert>
        <@xy.insert value='<@xy.button type="return"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="return"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="confirm"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="confirm"/></@xy.insert>
        <@xy.insert value='<@xy.button type="cancel"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="cancel"/></@xy.insert>
        <@xy.insert value='<@xy.button type="submit"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="submit"/></@xy.insert>
        <@xy.insert value='<@xy.button type="search"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="search"/></@xy.insert>
        <@xy.insert value='<@xy.button type="sort"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="sort"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="config"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="config"/></@xy.insert>
        <@xy.insert value='<@xy.button type="statis"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="statis"/></@xy.insert>
        <@xy.insert value='<@xy.button type="log"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="log"/></@xy.insert>
        <@xy.insert value='<@xy.button type="upload"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="upload"/></@xy.insert>
        <@xy.insert value='<@xy.button type="download"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="download"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="import"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="import"/></@xy.insert>
        <@xy.insert value='<@xy.button type="export"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="export"/></@xy.insert>
        <@xy.insert value='<@xy.button type="revoke"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="revoke"/></@xy.insert>
        <@xy.insert value='<@xy.button type="start"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="start"/></@xy.insert>
        <@xy.insert value='<@xy.button type="pause"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="pause"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="stop"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="stop"/></@xy.insert>
        <@xy.insert value='<@xy.button type="copy"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="copy"/></@xy.insert>
        <@xy.insert value='<@xy.button type="build"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="build"/></@xy.insert>
        <@xy.insert value='<@xy.button type="preview"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="preview"/></@xy.insert><br/><br/>
    </@xy.content_body>
    <@xy.content_title value="行尾单条数据操作的小按钮">
    </@xy.content_title>
    <@xy.content_body type="edit">
        <@xy.insert value='<@xy.button type="add_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="add_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="show_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="show_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="view_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="view_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="edit_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="edit_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="delete_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="delete_line"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="refresh_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="refresh_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="start_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="start_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="pause_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="pause_line"/></@xy.insert>
        <@xy.insert value='<@xy.button type="stop_line"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="stop_line"/></@xy.insert><br/><br/>
    </@xy.content_body>
    <@xy.content_title value="页面底部保存按钮">
    </@xy.content_title>
    <@xy.content_body type="edit">
        <@xy.insert value='<@xy.button type="save_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="save_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="back_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="back_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="return_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="return_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="confirm_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="confirm_bottom"/></@xy.insert><br/><br/>
        <@xy.insert value='<@xy.button type="cancel_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="cancel_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="submit_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="submit_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="next_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="next_bottom"/></@xy.insert>
        <@xy.insert value='<@xy.button type="last_bottom"/>'>&nbsp;&nbsp;&nbsp;<@xy.button type="last_bottom"/></@xy.insert><br/><br/>
    </@xy.content_body>
</@xy.page_content>
<@xy.page_footer>
</@xy.page_footer>
<@xy.foot_script>
</@xy.foot_script>
</@xy.form>
</@xy.container>
</@xy.html_body>
</@xy.html>
