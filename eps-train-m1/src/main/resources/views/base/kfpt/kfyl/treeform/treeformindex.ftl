<@xy.html>
<@xy.html_head value="树管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.form id="autoForm" position="search">
<@xy.container>
<@xy.page_head value="树" value_note="树管理">
<!-- 主页查询 开始 -->
<@xy.page_head_top>
<@xy.text value="${queryVo.equalItem['treeid']}" name="equalItem[treeid]" id="treeid" position="search" type="hidden"/>
<@xy.text value=gg_tree_id name="gg_tree_id"  id="gg_tree_id" type="hidden"/>
</@xy.page_head_top>
<!-- 主页查询 结束 -->
<!-- 更多查询 开始 -->
<@xy.page_head_more>
</@xy.page_head_more>
<!-- 更多查询 结束 -->
<@xy.searchButton id="search" />
</@xy.page_head>
<@xy.page_content>
<@xy.content_title value="树">
    <@xy.button type="add" onclick="return checkval('${gg_tree_id}',this);" url="${ctx}/base/kfpt/kfyl/treeform/addGg_tree_detail" parameters="{'treeid':'${gg_tree_id}'}"/>
</@xy.content_title>
<div class="layout">
    <div class="layout-side">
        <div class="sidebar">
            <div class="sidebar-left">
                <h4>目录分类</h4>
            </div>
            <div class="sidebar-right"></div>
        </div>
        <div class="zTreeDemoBackground left">
            <ul id="treeformTree" class="ztree"></ul>
        </div>
    </div>
<div class="grid">
    <div class="thead">
        <ul>
            <li style="width:10%">单行文本框</li>
            <li style="width:10%">多行文本框</li>
            <li style="width:10%">单选框</li>
            <li style="width:10%">复选框</li>
            <li style="width:10%">下拉框</li>
            <li style="width:10%">人员名称</li>
            <li style="width:10%">机构名称</li>
            <li style="width:10%">区域多选</li>
            <li style="width:10%">附件</li>
            <li style="width:10%">操作</li>
        </ul>
    </div>
    <div class="tbody">
<#list listGg_tree_detail as gg_tree_detail>
        <ul>
            <li style="width:10%"><@xy.insert value=gg_tree_detail.danhwb/></li>
            <li style="width:10%"><@xy.insert value=gg_tree_detail.duohwb/></li>
            <li style="width:10%"><@xy.insert type="map" list=dxkData value=gg_tree_detail.dxk/></li>
            <li style="width:10%"><@xy.insert type="multiple" list=fxkData value=gg_tree_detail.fxk/></li>
            <li style="width:10%"><@xy.insert type="map" list=xlkData value=gg_tree_detail.xlk/></li>
            <li style="width:10%"><@xy.insert value=gg_tree_detail.rymc/></li>
            <li style="width:10%"><@xy.insert value=gg_tree_detail.jgmc/></li>
            <li style="width: 10%"><@xy.insert type="code_multiple" lbbs="XZQY" list=qydxData value=gg_tree_detail.qydx/></li>
            <li style="width:10%"><@xy.download value=gg_tree_detail.fj id=gg_tree_detail.fj position="search"/></li>
            <li style="width:10%">
              <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/treeform/editGg_tree_detail" parameters="{'id':'${gg_tree_detail.id}'}" ignoretrt=true/>
              <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/treeform/showGg_tree_detail" parameters="{'id':'${gg_tree_detail.id}'}" text="查看" ignoretrt=true/>
              <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);" url="${ctx}/base/kfpt/kfyl/treeform/deleteGg_tree_detail" parameters="{'id':'${gg_tree_detail.id}'}" text="删除" ignoretrt=true/>
            </li>
        </ul>
</#list>
    </div>
</div>
</div>
<@xy.splittoolbar />
</@xy.page_content>
<@xy.foot_script >
</@xy.foot_script>
    <script type="text/javascript">
        var setting = {
            data: {
                simpleData: {
                    enable: true,
                    idKey: "id",
                    pIdKey: "pid",
                    addDiyDom: addSubstringDom
                },
                key: {
                    name: "pid",
                    id: "id"
                }
            },
            callback: {
                onClick: zTreeOnClick
            }
        };
        var zNodes =${treeformTree};
        $(document).ready(function () {
            $.fn.zTree.init($("#treeformTree"), setting, zNodes);
            // 显示选中的树节点
            var treeObj = $.fn.zTree.getZTreeObj("treeformTree");
            treeObj.expandAll(true);
        });

        function zTreeOnClick(event, treeId, treeNode) {
            $("#treeid").val(treeNode.id);
            $("#gg_tree_id").val(treeNode.id);
            $("#search").click();
        }

        function checkval(id,obj){
            if(id==null||id==''){
                alert("请先点击左侧树节点！");
                return false;
            }else{
                forward(obj);
                return true;
            }
        }
    </script>
<@xy.page_footer>
</@xy.page_footer>
</@xy.container>
</@xy.form>
</@xy.html_body>
</@xy.html>
