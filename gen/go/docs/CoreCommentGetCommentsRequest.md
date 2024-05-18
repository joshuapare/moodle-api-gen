# CoreCommentGetCommentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Area** | Pointer to **string** | string comment area | [optional] [default to ""]
**Component** | **string** | component | 
**Contextlevel** | **string** | contextlevel system, course, user... | 
**Instanceid** | **int32** | the Instance id of item associated with the context level | [default to null]
**Itemid** | **int32** | associated id | 
**Page** | Pointer to **int32** | page number (0 based) | [optional] [default to 0]
**Sortdirection** | Pointer to **string** | Sort direction: ASC or DESC | [optional] [default to "DESC"]

## Methods

### NewCoreCommentGetCommentsRequest

`func NewCoreCommentGetCommentsRequest(component string, contextlevel string, instanceid int32, itemid int32, ) *CoreCommentGetCommentsRequest`

NewCoreCommentGetCommentsRequest instantiates a new CoreCommentGetCommentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCommentGetCommentsRequestWithDefaults

`func NewCoreCommentGetCommentsRequestWithDefaults() *CoreCommentGetCommentsRequest`

NewCoreCommentGetCommentsRequestWithDefaults instantiates a new CoreCommentGetCommentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArea

`func (o *CoreCommentGetCommentsRequest) GetArea() string`

GetArea returns the Area field if non-nil, zero value otherwise.

### GetAreaOk

`func (o *CoreCommentGetCommentsRequest) GetAreaOk() (*string, bool)`

GetAreaOk returns a tuple with the Area field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArea

`func (o *CoreCommentGetCommentsRequest) SetArea(v string)`

SetArea sets Area field to given value.

### HasArea

`func (o *CoreCommentGetCommentsRequest) HasArea() bool`

HasArea returns a boolean if a field has been set.

### GetComponent

`func (o *CoreCommentGetCommentsRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreCommentGetCommentsRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreCommentGetCommentsRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextlevel

`func (o *CoreCommentGetCommentsRequest) GetContextlevel() string`

GetContextlevel returns the Contextlevel field if non-nil, zero value otherwise.

### GetContextlevelOk

`func (o *CoreCommentGetCommentsRequest) GetContextlevelOk() (*string, bool)`

GetContextlevelOk returns a tuple with the Contextlevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextlevel

`func (o *CoreCommentGetCommentsRequest) SetContextlevel(v string)`

SetContextlevel sets Contextlevel field to given value.


### GetInstanceid

`func (o *CoreCommentGetCommentsRequest) GetInstanceid() int32`

GetInstanceid returns the Instanceid field if non-nil, zero value otherwise.

### GetInstanceidOk

`func (o *CoreCommentGetCommentsRequest) GetInstanceidOk() (*int32, bool)`

GetInstanceidOk returns a tuple with the Instanceid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceid

`func (o *CoreCommentGetCommentsRequest) SetInstanceid(v int32)`

SetInstanceid sets Instanceid field to given value.


### GetItemid

`func (o *CoreCommentGetCommentsRequest) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreCommentGetCommentsRequest) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreCommentGetCommentsRequest) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetPage

`func (o *CoreCommentGetCommentsRequest) GetPage() int32`

GetPage returns the Page field if non-nil, zero value otherwise.

### GetPageOk

`func (o *CoreCommentGetCommentsRequest) GetPageOk() (*int32, bool)`

GetPageOk returns a tuple with the Page field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPage

`func (o *CoreCommentGetCommentsRequest) SetPage(v int32)`

SetPage sets Page field to given value.

### HasPage

`func (o *CoreCommentGetCommentsRequest) HasPage() bool`

HasPage returns a boolean if a field has been set.

### GetSortdirection

`func (o *CoreCommentGetCommentsRequest) GetSortdirection() string`

GetSortdirection returns the Sortdirection field if non-nil, zero value otherwise.

### GetSortdirectionOk

`func (o *CoreCommentGetCommentsRequest) GetSortdirectionOk() (*string, bool)`

GetSortdirectionOk returns a tuple with the Sortdirection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdirection

`func (o *CoreCommentGetCommentsRequest) SetSortdirection(v string)`

SetSortdirection sets Sortdirection field to given value.

### HasSortdirection

`func (o *CoreCommentGetCommentsRequest) HasSortdirection() bool`

HasSortdirection returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


