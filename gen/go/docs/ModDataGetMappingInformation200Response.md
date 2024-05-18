# ModDataGetMappingInformation200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | Pointer to [**ModDataGetMappingInformation200ResponseData**](ModDataGetMappingInformation200ResponseData.md) |  | [optional] 
**Warnings** | Pointer to [**[]AuthEmailSignupUser200ResponseWarningsInner**](AuthEmailSignupUser200ResponseWarningsInner.md) |  | [optional] 

## Methods

### NewModDataGetMappingInformation200Response

`func NewModDataGetMappingInformation200Response() *ModDataGetMappingInformation200Response`

NewModDataGetMappingInformation200Response instantiates a new ModDataGetMappingInformation200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetMappingInformation200ResponseWithDefaults

`func NewModDataGetMappingInformation200ResponseWithDefaults() *ModDataGetMappingInformation200Response`

NewModDataGetMappingInformation200ResponseWithDefaults instantiates a new ModDataGetMappingInformation200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetData

`func (o *ModDataGetMappingInformation200Response) GetData() ModDataGetMappingInformation200ResponseData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ModDataGetMappingInformation200Response) GetDataOk() (*ModDataGetMappingInformation200ResponseData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ModDataGetMappingInformation200Response) SetData(v ModDataGetMappingInformation200ResponseData)`

SetData sets Data field to given value.

### HasData

`func (o *ModDataGetMappingInformation200Response) HasData() bool`

HasData returns a boolean if a field has been set.

### GetWarnings

`func (o *ModDataGetMappingInformation200Response) GetWarnings() []AuthEmailSignupUser200ResponseWarningsInner`

GetWarnings returns the Warnings field if non-nil, zero value otherwise.

### GetWarningsOk

`func (o *ModDataGetMappingInformation200Response) GetWarningsOk() (*[]AuthEmailSignupUser200ResponseWarningsInner, bool)`

GetWarningsOk returns a tuple with the Warnings field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWarnings

`func (o *ModDataGetMappingInformation200Response) SetWarnings(v []AuthEmailSignupUser200ResponseWarningsInner)`

SetWarnings sets Warnings field to given value.

### HasWarnings

`func (o *ModDataGetMappingInformation200Response) HasWarnings() bool`

HasWarnings returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


