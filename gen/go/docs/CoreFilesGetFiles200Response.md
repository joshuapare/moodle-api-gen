# CoreFilesGetFiles200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Files** | [**[]CoreFilesGetFiles200ResponseFilesInner**](CoreFilesGetFiles200ResponseFilesInner.md) |  | 
**Parents** | [**[]CoreFilesGetFiles200ResponseParentsInner**](CoreFilesGetFiles200ResponseParentsInner.md) |  | 

## Methods

### NewCoreFilesGetFiles200Response

`func NewCoreFilesGetFiles200Response(files []CoreFilesGetFiles200ResponseFilesInner, parents []CoreFilesGetFiles200ResponseParentsInner, ) *CoreFilesGetFiles200Response`

NewCoreFilesGetFiles200Response instantiates a new CoreFilesGetFiles200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreFilesGetFiles200ResponseWithDefaults

`func NewCoreFilesGetFiles200ResponseWithDefaults() *CoreFilesGetFiles200Response`

NewCoreFilesGetFiles200ResponseWithDefaults instantiates a new CoreFilesGetFiles200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFiles

`func (o *CoreFilesGetFiles200Response) GetFiles() []CoreFilesGetFiles200ResponseFilesInner`

GetFiles returns the Files field if non-nil, zero value otherwise.

### GetFilesOk

`func (o *CoreFilesGetFiles200Response) GetFilesOk() (*[]CoreFilesGetFiles200ResponseFilesInner, bool)`

GetFilesOk returns a tuple with the Files field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiles

`func (o *CoreFilesGetFiles200Response) SetFiles(v []CoreFilesGetFiles200ResponseFilesInner)`

SetFiles sets Files field to given value.


### GetParents

`func (o *CoreFilesGetFiles200Response) GetParents() []CoreFilesGetFiles200ResponseParentsInner`

GetParents returns the Parents field if non-nil, zero value otherwise.

### GetParentsOk

`func (o *CoreFilesGetFiles200Response) GetParentsOk() (*[]CoreFilesGetFiles200ResponseParentsInner, bool)`

GetParentsOk returns a tuple with the Parents field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParents

`func (o *CoreFilesGetFiles200Response) SetParents(v []CoreFilesGetFiles200ResponseParentsInner)`

SetParents sets Parents field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


