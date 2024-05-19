# CoreCommentGetComments200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Canpost** | Pointer to **bool** | Whether the user can post in this comment area. | [optional] [default to null]
**Comments** | [**[]CoreCommentGetComments200ResponseCommentsInner**](CoreCommentGetComments200ResponseCommentsInner.md) |  | 
**Count** | Pointer to **int32** | Total number of comments. | [optional] [default to null]
**Perpage** | Pointer to **int32** | Number of comments per page. | [optional] [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreCommentGetComments200Response

`func NewCoreCommentGetComments200Response(comments []CoreCommentGetComments200ResponseCommentsInner, ) *CoreCommentGetComments200Response`

NewCoreCommentGetComments200Response instantiates a new CoreCommentGetComments200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCommentGetComments200ResponseWithDefaults

`func NewCoreCommentGetComments200ResponseWithDefaults() *CoreCommentGetComments200Response`

NewCoreCommentGetComments200ResponseWithDefaults instantiates a new CoreCommentGetComments200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCanpost

`func (o *CoreCommentGetComments200Response) GetCanpost() bool`

GetCanpost returns the Canpost field if non-nil, zero value otherwise.

### GetCanpostOk

`func (o *CoreCommentGetComments200Response) GetCanpostOk() (*bool, bool)`

GetCanpostOk returns a tuple with the Canpost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanpost

`func (o *CoreCommentGetComments200Response) SetCanpost(v bool)`

SetCanpost sets Canpost field to given value.

### HasCanpost

`func (o *CoreCommentGetComments200Response) HasCanpost() bool`

HasCanpost returns a boolean if a field has been set.

### GetComments

`func (o *CoreCommentGetComments200Response) GetComments() []CoreCommentGetComments200ResponseCommentsInner`

GetComments returns the Comments field if non-nil, zero value otherwise.

### GetCommentsOk

`func (o *CoreCommentGetComments200Response) GetCommentsOk() (*[]CoreCommentGetComments200ResponseCommentsInner, bool)`

GetCommentsOk returns a tuple with the Comments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComments

`func (o *CoreCommentGetComments200Response) SetComments(v []CoreCommentGetComments200ResponseCommentsInner)`

SetComments sets Comments field to given value.


### GetCount

`func (o *CoreCommentGetComments200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *CoreCommentGetComments200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *CoreCommentGetComments200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *CoreCommentGetComments200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetPerpage

`func (o *CoreCommentGetComments200Response) GetPerpage() int32`

GetPerpage returns the Perpage field if non-nil, zero value otherwise.

### GetPerpageOk

`func (o *CoreCommentGetComments200Response) GetPerpageOk() (*int32, bool)`

GetPerpageOk returns a tuple with the Perpage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPerpage

`func (o *CoreCommentGetComments200Response) SetPerpage(v int32)`

SetPerpage sets Perpage field to given value.

### HasPerpage

`func (o *CoreCommentGetComments200Response) HasPerpage() bool`

HasPerpage returns a boolean if a field has been set.

### GetWarnings

`func (o *CoreCommentGetComments200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreCommentGetComments200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreCommentGetComments200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreCommentGetComments200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


