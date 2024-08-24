<template>
  <el-row>
    <el-col :span="8" :key="o">
      <el-card :body-style="{ padding: '0px' }">
        <span class="content-text">本项目为南开大学软件学院2024研究生实训第二周作业</span>
        <br>
        <span class="content-text">用户管理系统</span>
        <br>
        <span class="content-text">王锜琛 2120240809</span>
      </el-card>
    </el-col>
  </el-row>
</template>

<style>
.time {
  font-size: 13px;
  color: #999;
}

.bottom {
  margin-top: 13px;
  line-height: 12px;
}

.button {
  padding: 0;
  float: right;
}

.image {
  width: 100%;
  display: block;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both;
}

.content-text {
  text-align: center;
  font-size: 20px;
}
</style>

<script>
export default {
  data() {
    return {
      currentDate: new Date(),
    };
  },
};
</script>
