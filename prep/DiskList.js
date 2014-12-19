
function diskDiv(disk){
    return $("<div>")
        .attr("class","disk1")
        .append(diskTittle(disk.name))
        .append(diskImg(disk.img))
        .append(diskDesc(disk.desc))
        .append(diskDel(disk.name))
         .append(disEdi(disk.name))
        .append(diskAddCart(disk.name))

}
function con(disks){
    $("#container").empty();
    var diskDivs= _.map(disks,function(disk){
        return diskDiv(disk);

    })
    _.each(diskDivs,function(div){
        $("#container").append(div)
    })
}
function diskTittle(tittle){
    return $("<h3>").html(tittle);

}
function diskImg(img){
    return $("<img>").attr("src",img);

}
function diskDesc(desc){
    return $("<p>").html(desc);
}
//function diskDel(diskName){
  //  return $("<Button>").attr("onclick",function(disName){
    //    var result = _.filter(disks,function(disk){
      //      return disk.name.indexOf(diskName)==-1;
        //})
        //disks=result;
        //con(result);
    //}).html("删除");
//}
function diskDel(diskName){
    return $("<Button>").attr("onclick","deleteDisk('"+diskName+"')").html("删除");
}
function disEdi(diskName){
    return $("<Button>").attr("onclick","editDisk('"+diskName+"')").html("修改");
}
function diskAddCart(diskName){
    return $("<Button>").attr("onclick","addDisk('"+diskName+"')").html("加入购物车");
}
function addDisk(diskName){
    var result = _.filter(disks,function(disk){
        return disk.name.indexOf(diskName)!=-1;
    })
    cartDisks=result;


}
function deleteDisk(diskName){
    var result = _.filter(disks,function(disk){
        return disk.name.indexOf(diskName)==-1;
    })
    disks=result;
    con(result);
}
function editDisk(diskName){
    var result = _.filter(disks,function(disk){
        return disk.name.indexOf(diskName)==-1;
    })
    var editOne = {name:$("#editName").val(),
        img:$("#editImg").val(),
        Desc:$("#editDesc").val()
    }
    disks=result;

    disks.push(editOne);
    con(result);
}
function add(){
    var newProduct = {name:$("#productName").val(),
        img:$("#productImg").val(),
        Desc:$("#productDesc").val()

    }
    console.log(newProduct);
    disks.push(newProduct);
    con(disks);
}
function search(){
    var searchOne=$("#search").val();
    var result=_.filter(disks,function(disk){
        return disk.name.indexOf(searchOne)!=-1;
    })
    con(result);
}
$(document).ready(function(){
    con(disks);

})