# CoreTagGetTagCollections200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Collections** | [**[]CoreTagGetTagCollections200ResponseCollectionsInner**](CoreTagGetTagCollections200ResponseCollectionsInner.md) |  | 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewCoreTagGetTagCollections200Response

`func NewCoreTagGetTagCollections200Response(collections []CoreTagGetTagCollections200ResponseCollectionsInner, ) *CoreTagGetTagCollections200Response`

NewCoreTagGetTagCollections200Response instantiates a new CoreTagGetTagCollections200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTagGetTagCollections200ResponseWithDefaults

`func NewCoreTagGetTagCollections200ResponseWithDefaults() *CoreTagGetTagCollections200Response`

NewCoreTagGetTagCollections200ResponseWithDefaults instantiates a new CoreTagGetTagCollections200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCollections

`func (o *CoreTagGetTagCollections200Response) GetCollections() []CoreTagGetTagCollections200ResponseCollectionsInner`

GetCollections returns the Collections field if non-nil, zero value otherwise.

### GetCollectionsOk

`func (o *CoreTagGetTagCollections200Response) GetCollectionsOk() (*[]CoreTagGetTagCollections200ResponseCollectionsInner, bool)`

GetCollectionsOk returns a tuple with the Collections field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollections

`func (o *CoreTagGetTagCollections200Response) SetCollections(v []CoreTagGetTagCollections200ResponseCollectionsInner)`

SetCollections sets Collections field to given value.


### GetWarnings

`func (o *CoreTagGetTagCollections200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *CoreTagGetTagCollections200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *CoreTagGetTagCollections200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *CoreTagGetTagCollections200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


