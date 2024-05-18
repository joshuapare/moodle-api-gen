# ModForumGetDiscussionPosts200ResponseRatinginfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canviewall** | Pointer to **bool** | Whether the user can view all the individual ratings. | [optional] 
**Canviewany** | Pointer to **bool** | Whether the user can view aggregate of ratings of others. | [optional] 
**Component** | **string** | Context name. | 
**Contextid** | **int32** | Context id. | 
**Ratingarea** | **string** | Rating area name. | 
**Ratings** | Pointer to [**[]ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner**](ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.md) |  | [optional] 
**Scales** | Pointer to [**[]ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner**](ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.md) |  | [optional] 

## Methods

### NewModForumGetDiscussionPosts200ResponseRatinginfo

`func NewModForumGetDiscussionPosts200ResponseRatinginfo(component string, contextid int32, ratingarea string, ) *ModForumGetDiscussionPosts200ResponseRatinginfo`

NewModForumGetDiscussionPosts200ResponseRatinginfo instantiates a new ModForumGetDiscussionPosts200ResponseRatinginfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumGetDiscussionPosts200ResponseRatinginfoWithDefaults

`func NewModForumGetDiscussionPosts200ResponseRatinginfoWithDefaults() *ModForumGetDiscussionPosts200ResponseRatinginfo`

NewModForumGetDiscussionPosts200ResponseRatinginfoWithDefaults instantiates a new ModForumGetDiscussionPosts200ResponseRatinginfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanviewall

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetCanviewall() bool`

GetCanviewall returns the Canviewall field if non-nil, zero value otherwise.

### GetCanviewallOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetCanviewallOk() (*bool, bool)`

GetCanviewallOk returns a tuple with the Canviewall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewall

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetCanviewall(v bool)`

SetCanviewall sets Canviewall field to given value.

### HasCanviewall

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) HasCanviewall() bool`

HasCanviewall returns a boolean if a field has been set.

### GetCanviewany

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetCanviewany() bool`

GetCanviewany returns the Canviewany field if non-nil, zero value otherwise.

### GetCanviewanyOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetCanviewanyOk() (*bool, bool)`

GetCanviewanyOk returns a tuple with the Canviewany field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanviewany

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetCanviewany(v bool)`

SetCanviewany sets Canviewany field to given value.

### HasCanviewany

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) HasCanviewany() bool`

HasCanviewany returns a boolean if a field has been set.

### GetComponent

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetRatingarea

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetRatingarea() string`

GetRatingarea returns the Ratingarea field if non-nil, zero value otherwise.

### GetRatingareaOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetRatingareaOk() (*string, bool)`

GetRatingareaOk returns a tuple with the Ratingarea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatingarea

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetRatingarea(v string)`

SetRatingarea sets Ratingarea field to given value.


### GetRatings

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetRatings() []ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner`

GetRatings returns the Ratings field if non-nil, zero value otherwise.

### GetRatingsOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetRatingsOk() (*[]ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner, bool)`

GetRatingsOk returns a tuple with the Ratings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRatings

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetRatings(v []ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner)`

SetRatings sets Ratings field to given value.

### HasRatings

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) HasRatings() bool`

HasRatings returns a boolean if a field has been set.

### GetScales

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetScales() []ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner`

GetScales returns the Scales field if non-nil, zero value otherwise.

### GetScalesOk

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) GetScalesOk() (*[]ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner, bool)`

GetScalesOk returns a tuple with the Scales field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScales

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) SetScales(v []ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner)`

SetScales sets Scales field to given value.

### HasScales

`func (o *ModForumGetDiscussionPosts200ResponseRatinginfo) HasScales() bool`

HasScales returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


