# CoreFilesGetUnusedDraftItemid200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | File area component. | [default to "null"]
**Contextid** | **int32** | File area context. | [default to null]
**Filearea** | **string** | File area name. | [default to "null"]
**Itemid** | **int32** | File are item id. | [default to null]
**Userid** | **int32** | File area user id. | [default to null]
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreFilesGetUnusedDraftItemid200Response

`func NewCoreFilesGetUnusedDraftItemid200Response(component string, contextid int32, filearea string, itemid int32, userid int32, ) *CoreFilesGetUnusedDraftItemid200Response`

NewCoreFilesGetUnusedDraftItemid200Response instantiates a new CoreFilesGetUnusedDraftItemid200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesGetUnusedDraftItemid200ResponseWithDefaults

`func NewCoreFilesGetUnusedDraftItemid200ResponseWithDefaults() *CoreFilesGetUnusedDraftItemid200Response`

NewCoreFilesGetUnusedDraftItemid200ResponseWithDefaults instantiates a new CoreFilesGetUnusedDraftItemid200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetContextid

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetContextid() int32`

GetContextid returns the Contextid field if non-nil, zero value otherwise.

### GetContextidOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetContextidOk() (*int32, bool)`

GetContextidOk returns a tuple with the Contextid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContextid

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetContextid(v int32)`

SetContextid sets Contextid field to given value.


### GetFilearea

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetFilearea() string`

GetFilearea returns the Filearea field if non-nil, zero value otherwise.

### GetFileareaOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetFileareaOk() (*string, bool)`

GetFileareaOk returns a tuple with the Filearea field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilearea

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetFilearea(v string)`

SetFilearea sets Filearea field to given value.


### GetItemid

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetItemid() int32`

GetItemid returns the Itemid field if non-nil, zero value otherwise.

### GetItemidOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetItemidOk() (*int32, bool)`

GetItemidOk returns a tuple with the Itemid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemid

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetItemid(v int32)`

SetItemid sets Itemid field to given value.


### GetUserid

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetUserid() int32`

GetUserid returns the Userid field if non-nil, zero value otherwise.

### GetUseridOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetUseridOk() (*int32, bool)`

GetUseridOk returns a tuple with the Userid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserid

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetUserid(v int32)`

SetUserid sets Userid field to given value.


### GetWarnings

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreFilesGetUnusedDraftItemid200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreFilesGetUnusedDraftItemid200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreFilesGetUnusedDraftItemid200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


