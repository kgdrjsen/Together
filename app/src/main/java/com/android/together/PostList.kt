package com.android.together

object PostList {
    var postList = mutableListOf<Post>(
        Post("수원쪽에서 풋살 같이하실 두 분 구합니다~ ", "실력에 상관없이 재밌고 매너있게 차실 분 구합니다~! 누구든지 연락주세요~","수원역 1번출구","5일 오후 12시 ~ 오후 2시", R.drawable.post_image1),
        Post("알고리즘 기초부터 같이 공부 할 분들 찾습니다!!!", "알고리즘 기초부터 탄탄히 다져나갈 분들 찾습니다!! 3명정도 구해보려고 합니다! 장소와 시간은 추후에 다 같이 결정할 생각입니다! 같이 끈기있게 공부하실 분든 연락주세요!!", "미정", "미정", R.drawable.post_image3),
        Post("안드로이드 토이 프로젝트 같이 진행하실 서버분 구합니다!!", "안드로이드 토이 프로젝트를 아이디어부터 배포까지 같이 달려보실 서버분 구합니다!!", "온라인 회의", "미정", R.drawable.post_image2),
        Post("수원역에서 풋살 같이하실 분 구합니다~ ", "실력에 상관없이 재밌고 매너있게 차실 분 구합니다~! 누구든지 연락주세요~", "수원역 1번출구", "22일 오후 6시 ~ 오후 8시", R.drawable.post_image3)
    )
}

data class Post(
    val postTitle: String,
    val postContent: String,
    val postLocation: String,
    val postDate: String,
    val postImage: Int
)