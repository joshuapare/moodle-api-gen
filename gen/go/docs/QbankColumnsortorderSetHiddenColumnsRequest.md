# QbankColumnsortorderSetHiddenColumnsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columns** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Global** | Pointer to **bool** | Set global config setting, rather than user preference | [optional] [default to false]

## Methods

### NewQbankColumnsortorderSetHiddenColumnsRequest

`func NewQbankColumnsortorderSetHiddenColumnsRequest() *QbankColumnsortorderSetHiddenColumnsRequest`

NewQbankColumnsortorderSetHiddenColumnsRequest instantiates a new QbankColumnsortorderSetHiddenColumnsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQbankColumnsortorderSetHiddenColumnsRequestWithDefaults

`func NewQbankColumnsortorderSetHiddenColumnsRequestWithDefaults() *QbankColumnsortorderSetHiddenColumnsRequest`

NewQbankColumnsortorderSetHiddenColumnsRequestWithDefaults instantiates a new QbankColumnsortorderSetHiddenColumnsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColumns

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) GetColumns() []map[string]interface{}`

GetColumns returns the Columns field if non-nil, zero value otherwise.

### GetColumnsOk

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) GetColumnsOk() (*[]map[string]interface{}, bool)`

GetColumnsOk returns a tuple with the Columns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumns

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) SetColumns(v []map[string]interface{})`

SetColumns sets Columns field to given value.

### HasColumns

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) HasColumns() bool`

HasColumns returns a boolean if a field has been set.

### GetGlobal

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) GetGlobal() bool`

GetGlobal returns the Global field if non-nil, zero value otherwise.

### GetGlobalOk

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) GetGlobalOk() (*bool, bool)`

GetGlobalOk returns a tuple with the Global field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlobal

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) SetGlobal(v bool)`

SetGlobal sets Global field to given value.

### HasGlobal

`func (o *QbankColumnsortorderSetHiddenColumnsRequest) HasGlobal() bool`

HasGlobal returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


