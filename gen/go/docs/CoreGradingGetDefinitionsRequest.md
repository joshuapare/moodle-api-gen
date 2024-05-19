# CoreGradingGetDefinitionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activeonly** | Pointer to **bool** | Only the active method | [optional] [default to 0]
**Areaname** | **string** | area name | [default to "null"]
**Cmids** | **[]map[string]interface{}** |  | 

## Methods

### NewCoreGradingGetDefinitionsRequest

`func NewCoreGradingGetDefinitionsRequest(areaname string, cmids []map[string]interface{}, ) *CoreGradingGetDefinitionsRequest`

NewCoreGradingGetDefinitionsRequest instantiates a new CoreGradingGetDefinitionsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradingGetDefinitionsRequestWithDefaults

`func NewCoreGradingGetDefinitionsRequestWithDefaults() *CoreGradingGetDefinitionsRequest`

NewCoreGradingGetDefinitionsRequestWithDefaults instantiates a new CoreGradingGetDefinitionsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActiveonly

`func (o *CoreGradingGetDefinitionsRequest) GetActiveonly() bool`

GetActiveonly returns the Activeonly field if non-nil, zero value otherwise.

### GetActiveonlyOk

`func (o *CoreGradingGetDefinitionsRequest) GetActiveonlyOk() (*bool, bool)`

GetActiveonlyOk returns a tuple with the Activeonly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActiveonly

`func (o *CoreGradingGetDefinitionsRequest) SetActiveonly(v bool)`

SetActiveonly sets Activeonly field to given value.

### HasActiveonly

`func (o *CoreGradingGetDefinitionsRequest) HasActiveonly() bool`

HasActiveonly returns a boolean if a field has been set.

### GetAreaname

`func (o *CoreGradingGetDefinitionsRequest) GetAreaname() string`

GetAreaname returns the Areaname field if non-nil, zero value otherwise.

### GetAreanameOk

`func (o *CoreGradingGetDefinitionsRequest) GetAreanameOk() (*string, bool)`

GetAreanameOk returns a tuple with the Areaname field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAreaname

`func (o *CoreGradingGetDefinitionsRequest) SetAreaname(v string)`

SetAreaname sets Areaname field to given value.


### GetCmids

`func (o *CoreGradingGetDefinitionsRequest) GetCmids() []map[string]interface{}`

GetCmids returns the Cmids field if non-nil, zero value otherwise.

### GetCmidsOk

`func (o *CoreGradingGetDefinitionsRequest) GetCmidsOk() (*[]map[string]interface{}, bool)`

GetCmidsOk returns a tuple with the Cmids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCmids

`func (o *CoreGradingGetDefinitionsRequest) SetCmids(v []map[string]interface{})`

SetCmids sets Cmids field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


