<@xy.html>
  <@xy.html_head value="树[kf_tree]管理">
    <@xy.css href="css/plugins/zTree_v3-master/css/zTreeDiy.css"/>
  </@xy.html_head>
  <@xy.html_body>
  <@xy.nav/>
    <@xy.form id="jsForm" position="search">
      <@xy.container>
        <@xy.page_content>
        <@xy.content_title value="树[kf_tree]列表">
        <@xy.button type="add" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/tree/addKf_tree"/>
        <@xy.button type="sort" onclick="openWindow(this);" url="/base/kfpt/kfyl/tree/sortKf_treeRoot"/>
        </@xy.content_title>
          <@xy.content_body type="edit">
          <ul id="treeid" class="ztree"></ul>
            <@xy.foot_script >
            </@xy.foot_script>
          <script type="text/javascript">
              var zTreeNodes;
              var setting = {
                  view: {
                      showLine: false,
                      showIcon: false,
                      addDiyDom: addDiyDom
                  },
                  data: {
                      simpleData: {
                          enable: true,
                          idKey: "id",
                          pIdKey: "pid"
                      },
                      key: {
                          name: "bt"
                      }
                  }
              };
              var zNodes =${kf_treeTree};
              $(document).ready(function () {
                  $.fn.zTree.init($("#treeid"), setting, zNodes);
                  //添加表头
                  var li_head = ' <li class="ztreehead">' +
                 '<div class="diy" style="text-align: center;width: 20%">标题</div>'+
                 '<div class="diy" style="text-align: center;width: 20%">标识</div>'+
                 '<div class="diy" style="text-align: center;width:60%">操作</div></li>';
                  var rows = $("#treeid").find('li');
                  if (rows.length > 0) {
                      rows.eq(0).before(li_head)
                  } else {
                      $("#treeid").append(li_head);
                      $("#treeid").append('<li ><div style="text-align: center">无符合条件数据</div></li>')
                  }
                  //展开所有节点
                  var treeObj = $.fn.zTree.getZTreeObj("treeid");
                  treeObj.expandAll(true);
              });

              function addDiyDom(treeId, treeNode) {
                  var spaceWidth = 15;
                  var liObj = $("#" + treeNode.tId);
                  var aObj = $("#" + treeNode.tId + "_a");
                  var switchObj = $("#" + treeNode.tId + "_switch");
                  var icoObj = $("#" + treeNode.tId + "_ico");
                  var spanObj = $("#" + treeNode.tId + "_span");
                  aObj.attr('title', '');
                  aObj.append('<div class="diy swich" style="width:20%"></div>');
                  var div = $(liObj).find('div').eq(0);
                  switchObj.remove();
                  spanObj.remove();
                  icoObj.remove();
                  div.append(switchObj);
                  div.append(spanObj);
                  var spaceStr = "<span style='height:1px;display: inline-block;width:" + (spaceWidth * treeNode.level) + "px'></span>";
                  switchObj.before(spaceStr);
                  var editStr = '';
                  var xjadd = "{'id':'','pid':'" + treeNode.id + "','lj':'" + treeNode.lj + "'}";
                  var editS = "{'id':'" + treeNode.id + "'}";
                  var px = "openWindow(this);";
                  editStr += '<div class="diy" style="text-align: center;width:60%"><@xy.button  type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/tree/editKf_tree" parameters="'+xjadd+'"  text="下级增加" ignoretrt=true/>&nbsp;'
                          + '<@xy.button type="view_line" onclick="'+px+'"  url="/base/kfpt/kfyl/tree/sortKf_tree" parameters="'+editS+'" text="下级排序" ignoretrt=true/>&nbsp;'
                          + '<@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/base/kfpt/kfyl/tree/editKf_tree" parameters="'+editS+'"  text="修改" ignoretrt=true/>&nbsp;'
                          + '<@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE);" url="${ctx}/base/kfpt/kfyl/tree/deleteKf_tree" parameters="'+editS+'" text="删除" ignoretrt=true/>&nbsp;';
                  aObj.append(editStr);
              }
          </script>
          </@xy.content_body>
        </@xy.page_content>
        <@xy.page_footer>
        </@xy.page_footer>
      </@xy.container>
    </@xy.form>
  </@xy.html_body>
</@xy.html>
