# ModDataGetMappingInformationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cmid** | **int32** | Id of the data activity | 
**Importedpreset** | **string** | Preset to be imported | [default to "null"]

## Methods

### NewModDataGetMappingInformationRequest

`func NewModDataGetMappingInformationRequest(cmid int32, importedpreset string, ) *ModDataGetMappingInformationRequest`

NewModDataGetMappingInformationRequest instantiates a new ModDataGetMappingInformationRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataGetMappingInformationRequestWithDefaults

`func NewModDataGetMappingInformationRequestWithDefaults() *ModDataGetMappingInformationRequest`

NewModDataGetMappingInformationRequestWithDefaults instantiates a new ModDataGetMappingInformationRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCmid

`func (o *ModDataGetMappingInformationRequest) GetCmid() int32`

GetCmid returns the Cmid field if non-nil, zero value otherwise.

### GetCmidOk

`func (o *ModDataGetMappingInformationRequest) GetCmidOk() (*int32, bool)`

GetCmidOk returns a tuple with the Cmid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmid

`func (o *ModDataGetMappingInformationRequest) SetCmid(v int32)`

SetCmid sets Cmid field to given value.


### GetImportedpreset

`func (o *ModDataGetMappingInformationRequest) GetImportedpreset() string`

GetImportedpreset returns the Importedpreset field if non-nil, zero value otherwise.

### GetImportedpresetOk

`func (o *ModDataGetMappingInformationRequest) GetImportedpresetOk() (*string, bool)`

GetImportedpresetOk returns a tuple with the Importedpreset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImportedpreset

`func (o *ModDataGetMappingInformationRequest) SetImportedpreset(v string)`

SetImportedpreset sets Importedpreset field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


