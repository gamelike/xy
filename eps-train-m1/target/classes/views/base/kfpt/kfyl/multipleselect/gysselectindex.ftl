<@xy.html>
<@xy.html_head value="招投标主体[jc_ztbzt]选择">
</@xy.html_head>
<@xy.html_body type="popup">
<@xy.form position="search">
<@xy.container type="popup">
<div style="position:fixed;right:20px;z-index:99;">
<@xy.page_head type="popup">
<@xy.page_head_top>
    <@xy.text label="主体名称" value="${queryVo.likeItem['ztmc'] }" name="likeItem[ztmc]" id="ztmc" type="text" position="search"/>
<#--<dl class="listindex" id="ybclist">
    <dt>已邀请供应商</dt>
    <dd></dd>
</dl>-->
<dl class="listindex" id="listindex">
    <dt>已选供应商</dt>
    <dd></dd>
</dl>
<div class="search-submit">
    <a href="#" class="btn btn-info" onclick="submitThis()">查询</a>
    <#-- <a href="#" class="btn btn-info btn-outline">重置</a>-->
</div>
<div class="search-term">
    <a href="#" class="btn btn-info" onclick="submitJc_ztbzt()">确定</a>
    <a href="#" class="btn btn-info btn-outline" onclick="shutCors()">关闭</a>
</div>
</@xy.page_head_top>
<@xy.searchButton />
</@xy.page_head>
</div>
<div style="margin-top:110px;z-index:9;">
<@xy.page_content type="popup">
<@xy.content_title value="招投标主体[jc_ztbzt]">
</@xy.content_title>
<@xy.content_body type="popup">
<div class="grid-sm">
    <div class="thead">
        <ul>
            <li style="width:10%">序号</li>
            <li style="width:20%">主体名称</li>
            <li style="width:15%">主体代码</li>
            <li style="width:15%">联系人</li>
            <li style="width:15%">联系人电话</li>
            <li style="width:10%">操作</li>
        </ul>
    </div>
    <div class="tbody">
    <#list listJc_ztbzt as jc_ztbzt>
        <ul>
            <li style="width:10%"><@xy.index jc_ztbzt_index/></li>
            <li style="width:20%"><@xy.insert value=jc_ztbzt.ztmc/></li>
            <li style="width:15%"><@xy.insert value=jc_ztbzt.ztdm/></li>
            <li style="width:15%"><@xy.insert value=jc_ztbzt.lxr/></li>
            <li style="width:15%"><@xy.insert value=jc_ztbzt.lxrdh/></li>
                <li style="width:10%">
                    <a href="javascript:" onclick="showyxtj('${jc_ztbzt.id}','${jc_ztbzt.ztmc}','${jc_ztbzt.lxr}','${jc_ztbzt.lxrdh}','${jc_ztbzt.dzyx}','${jc_ztbzt.jgbh}', this)" class="btn btn-action" >选择</a>
                </li>
        </ul>
    </#list>
    </div>
</div>
<@xy.text type="hidden" value=yxtjcontext name="yxtjcontext" id="yxtjcontext"/>
<@xy.text type="hidden" value=yxgysxx name="yxgysxx" id="yxgysxx"/>
<@xy.splittoolbar />
<@xy.content_submit>
</@xy.content_submit>
<@xy.foot_script/>
<script type="text/javascript">
    var params;
    var yx_content = '${yxtjcontext}';
    var yx_gysxx = '${yxgysxx}';
    $(function(){
        //页面刷新后保留已选条件
        $("#listindex dd").append(yx_content);
        var gysbhs =  yx_gysxx.split(",");
        if(gysbhs.length>0){
            for(var i = 0; i <gysbhs.length; i++){
                $("#"+gysbhs[i]).html("已选择");
            }
        }
        //页面初始化加载已邀请供应商信息
        ajaxDefault("${ctx}/authentication/base/kfpt/kfyl/multipleselect/showJc_ztbzt.json",  {"jc_ztbzt_ids": "${jc_ztbzt_ids}"}, function (returnValue) {
            if (returnValue != null) {
                var data = returnValue.data;
                var content = "";
                for (var i = 0; i < data.length; i++) {
                    var info = data[i];
                    content += "<div class='item'>"+info.ztmc+"</div>";
                }
                $("#ybclist dd").append(content);
            }
        });
    });
    function submitJc_ztbzt() {
        var infos = [];
        $('#listindex dd div').each(function () {
            var info = $(this).find("text").attr("value").split(",");
            dqinfo = {
                "id":info[0], "ztmc":info[1], "lxr":info[2], "lxrdh":info[3], "dzyx":info[4], "jgbh":info[5]            };
            //解析上个页面传过来的参数
            var param = "${paramdata}";
            var str1 = param.split(",");
            for(i=0;i<str1.length;i++){
                var str = str1[i].split("=");
                dqinfo[str[0]]=str[1];
            }
            infos.push(dqinfo);
        });
        params = {
            'gysList':JSON.stringify(infos),
            'windowName': window.name
        };
        sendMessageCrossDomain("sendjc_ztbztValue", params, getParentPop());
        shutCors();
    }

    function showyxtj(id,ztmc,lxr,lxrdh,dzyx,jgbh, obj){
        var infoxx = id+","+ztmc+","+lxr+","+lxrdh+","+dzyx+","+jgbh;
        var content = '<div class="item select"><text type="hidden" value='+infoxx+' /><a class="item-title">'+ztmc+'</a><a class="btn-del"><i class="icon iconfont icon-guanbi" gysbh='+id+' onclick="canclexz(this)"></i></a></div>';
        $("#listindex dd").append(content);
        yx_content += content;
        $("#yxtjcontext").val(yx_content);
        yx_gysxx += gysxh+",";
        $("#yxgysxx").val(yx_gysxx);
    }
    function canclexz(obj){
        var gysbh = $(obj).attr("gysbh");
        $("#"+gysbh).html("选择");
        $(obj).parent().parent().remove();
        $("#yxtjcontext").val($("#listindex dd").html());
        //重新组织供应商信息
        var thStr = gysbh+",";
        $("#yxgysxx").val($("#yxgysxx").val().replace(thStr,""));
    }
</script>
</@xy.content_body>
</@xy.page_content>
</div>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.form>
</@xy.html_body>
</@xy.html>
