const base = {
    get() {
        return {
            url : "http://localhost:8080/wuliuguanlixitong/",
            name: "wuliuguanlixitong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wuliuguanlixitong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "物流信息管理系统"
        } 
    }
}
export default base
