package mx.tec.sabores.ui.navigation

object Route {
    const val HOME = "home"
    const val MY_REVIEWS = "myReviews"
    const val DETAIL = "detail/{restaurantId}"
    const val NEW_REVIEW = "review/{restaurantId}"
    const val EDIT_REVIEW = "edit/{reviewId}"

    const val ARG_RESTAURANT_ID = "restaurantId"
    const val ARG_REVIEW_ID = "reviewId"

    fun detail(id: Int) = "detail/$id"
    fun newReview(id: Int) = "review/$id"
    fun editReview(id: Int) = "edit/$id"
}
