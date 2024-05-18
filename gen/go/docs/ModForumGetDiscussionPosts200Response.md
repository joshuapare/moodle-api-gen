# ModForumGetDiscussionPosts200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Courseid** | **int32** | The forum course id | [default to null]
**Forumid** | **int32** | The forum id | [default to null]
**Posts** | [**[]ModForumGetDiscussionPosts200ResponsePostsInner**](ModForumGetDiscussionPosts200ResponsePostsInner.md) |  | 
**Ratinginfo** | Pointer to [**ModForumGetDiscussionPosts200ResponseRatinginfo**](ModForumGetDiscussionPosts200ResponseRatinginfo.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModForumGetDiscussionPosts200Response

`func NewModForumGetDiscussionPosts200Response(courseid int32, forumid int32, posts []ModForumGetDiscussionPosts200ResponsePostsInner, ) *ModForumGetDiscussionPosts200Response`

NewModForumGetDiscussionPosts200Response instantiates a new ModForumGetDiscussionPosts200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPosts200ResponseWithDefaults

`func NewModForumGetDiscussionPosts200ResponseWithDefaults() *ModForumGetDiscussionPosts200Response`

NewModForumGetDiscussionPosts200ResponseWithDefaults instantiates a new ModForumGetDiscussionPosts200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCourseid

`func (o *ModForumGetDiscussionPosts200Response) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *ModForumGetDiscussionPosts200Response) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *ModForumGetDiscussionPosts200Response) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetForumid

`func (o *ModForumGetDiscussionPosts200Response) GetForumid() int32`

GetForumid returns the Forumid field if non-nil, zero value otherwise.

### GetForumidOk

`func (o *ModForumGetDiscussionPosts200Response) GetForumidOk() (*int32, bool)`

GetForumidOk returns a tuple with the Forumid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForumid

`func (o *ModForumGetDiscussionPosts200Response) SetForumid(v int32)`

SetForumid sets Forumid field to given value.


### GetPosts

`func (o *ModForumGetDiscussionPosts200Response) GetPosts() []ModForumGetDiscussionPosts200ResponsePostsInner`

GetPosts returns the Posts field if non-nil, zero value otherwise.

### GetPostsOk

`func (o *ModForumGetDiscussionPosts200Response) GetPostsOk() (*[]ModForumGetDiscussionPosts200ResponsePostsInner, bool)`

GetPostsOk returns a tuple with the Posts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPosts

`func (o *ModForumGetDiscussionPosts200Response) SetPosts(v []ModForumGetDiscussionPosts200ResponsePostsInner)`

SetPosts sets Posts field to given value.


### GetRatinginfo

`func (o *ModForumGetDiscussionPosts200Response) GetRatinginfo() ModForumGetDiscussionPosts200ResponseRatinginfo`

GetRatinginfo returns the Ratinginfo field if non-nil, zero value otherwise.

### GetRatinginfoOk

`func (o *ModForumGetDiscussionPosts200Response) GetRatinginfoOk() (*ModForumGetDiscussionPosts200ResponseRatinginfo, bool)`

GetRatinginfoOk returns a tuple with the Ratinginfo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatinginfo

`func (o *ModForumGetDiscussionPosts200Response) SetRatinginfo(v ModForumGetDiscussionPosts200ResponseRatinginfo)`

SetRatinginfo sets Ratinginfo field to given value.

### HasRatinginfo

`func (o *ModForumGetDiscussionPosts200Response) HasRatinginfo() bool`

HasRatinginfo returns a boolean if a field has been set.

### GetWarnings

`func (o *ModForumGetDiscussionPosts200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModForumGetDiscussionPosts200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModForumGetDiscussionPosts200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModForumGetDiscussionPosts200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


