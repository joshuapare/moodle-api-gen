# ModForumPrepareDraftAreaForPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Area** | **string** | Area to prepare: attachment or post. | [default to "null"]
**Draftitemid** | Pointer to **int32** | The draft item id to use. 0 to generate one. | [optional] [default to 0]
**Filestokeep** | Pointer to [**[]ModForumPrepareDraftAreaForPostRequestFilestokeepInner**](ModForumPrepareDraftAreaForPostRequestFilestokeepInner.md) |  | [optional] 
**Postid** | **int32** | Post to prepare the draft area for. | [default to null]

## Methods

### NewModForumPrepareDraftAreaForPostRequest

`func NewModForumPrepareDraftAreaForPostRequest(area string, postid int32, ) *ModForumPrepareDraftAreaForPostRequest`

NewModForumPrepareDraftAreaForPostRequest instantiates a new ModForumPrepareDraftAreaForPostRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModForumPrepareDraftAreaForPostRequestWithDefaults

`func NewModForumPrepareDraftAreaForPostRequestWithDefaults() *ModForumPrepareDraftAreaForPostRequest`

NewModForumPrepareDraftAreaForPostRequestWithDefaults instantiates a new ModForumPrepareDraftAreaForPostRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArea

`func (o *ModForumPrepareDraftAreaForPostRequest) GetArea() string`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *ModForumPrepareDraftAreaForPostRequest) GetAreaOk() (*string, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *ModForumPrepareDraftAreaForPostRequest) SetArea(v string)`

SetArea sets Area field to given value.


### GetDraftitemid

`func (o *ModForumPrepareDraftAreaForPostRequest) GetDraftitemid() int32`

GetDraftitemid returns the Draftitemid field if non-nil, zero value otherwise.

### GetDraftitemidOk

`func (o *ModForumPrepareDraftAreaForPostRequest) GetDraftitemidOk() (*int32, bool)`

GetDraftitemidOk returns a tuple with the Draftitemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDraftitemid

`func (o *ModForumPrepareDraftAreaForPostRequest) SetDraftitemid(v int32)`

SetDraftitemid sets Draftitemid field to given value.

### HasDraftitemid

`func (o *ModForumPrepareDraftAreaForPostRequest) HasDraftitemid() bool`

HasDraftitemid returns a boolean if a field has been set.

### GetFilestokeep

`func (o *ModForumPrepareDraftAreaForPostRequest) GetFilestokeep() []ModForumPrepareDraftAreaForPostRequestFilestokeepInner`

GetFilestokeep returns the Filestokeep field if non-nil, zero value otherwise.

### GetFilestokeepOk

`func (o *ModForumPrepareDraftAreaForPostRequest) GetFilestokeepOk() (*[]ModForumPrepareDraftAreaForPostRequestFilestokeepInner, bool)`

GetFilestokeepOk returns a tuple with the Filestokeep field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilestokeep

`func (o *ModForumPrepareDraftAreaForPostRequest) SetFilestokeep(v []ModForumPrepareDraftAreaForPostRequestFilestokeepInner)`

SetFilestokeep sets Filestokeep field to given value.

### HasFilestokeep

`func (o *ModForumPrepareDraftAreaForPostRequest) HasFilestokeep() bool`

HasFilestokeep returns a boolean if a field has been set.

### GetPostid

`func (o *ModForumPrepareDraftAreaForPostRequest) GetPostid() int32`

GetPostid returns the Postid field if non-nil, zero value otherwise.

### GetPostidOk

`func (o *ModForumPrepareDraftAreaForPostRequest) GetPostidOk() (*int32, bool)`

GetPostidOk returns a tuple with the Postid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPostid

`func (o *ModForumPrepareDraftAreaForPostRequest) SetPostid(v int32)`

SetPostid sets Postid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


