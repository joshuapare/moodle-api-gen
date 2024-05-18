# ModDataDeleteSavedPresetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Dataid** | **int32** | Id of the data activity | [default to null]
**Presetnames** | **[]map[string]interface{}** |  | 

## Methods

### NewModDataDeleteSavedPresetRequest

`func NewModDataDeleteSavedPresetRequest(dataid int32, presetnames []map[string]interface{}, ) *ModDataDeleteSavedPresetRequest`

NewModDataDeleteSavedPresetRequest instantiates a new ModDataDeleteSavedPresetRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModDataDeleteSavedPresetRequestWithDefaults

`func NewModDataDeleteSavedPresetRequestWithDefaults() *ModDataDeleteSavedPresetRequest`

NewModDataDeleteSavedPresetRequestWithDefaults instantiates a new ModDataDeleteSavedPresetRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDataid

`func (o *ModDataDeleteSavedPresetRequest) GetDataid() int32`

GetDataid returns the Dataid field if non-nil, zero value otherwise.

### GetDataidOk

`func (o *ModDataDeleteSavedPresetRequest) GetDataidOk() (*int32, bool)`

GetDataidOk returns a tuple with the Dataid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataid

`func (o *ModDataDeleteSavedPresetRequest) SetDataid(v int32)`

SetDataid sets Dataid field to given value.


### GetPresetnames

`func (o *ModDataDeleteSavedPresetRequest) GetPresetnames() []map[string]interface{}`

GetPresetnames returns the Presetnames field if non-nil, zero value otherwise.

### GetPresetnamesOk

`func (o *ModDataDeleteSavedPresetRequest) GetPresetnamesOk() (*[]map[string]interface{}, bool)`

GetPresetnamesOk returns a tuple with the Presetnames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresetnames

`func (o *ModDataDeleteSavedPresetRequest) SetPresetnames(v []map[string]interface{})`

SetPresetnames sets Presetnames field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


