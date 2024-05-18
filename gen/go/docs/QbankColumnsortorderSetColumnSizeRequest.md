# QbankColumnsortorderSetColumnSizeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Global** | Pointer to **bool** | Set global config setting, rather than user preference | [optional] [default to false]
**Sizes** | Pointer to **string** | Size for each column, as a JSON string representing [column &#x3D;&gt; size] | [optional] [default to "null"]

## Methods

### NewQbankColumnsortorderSetColumnSizeRequest

`func NewQbankColumnsortorderSetColumnSizeRequest() *QbankColumnsortorderSetColumnSizeRequest`

NewQbankColumnsortorderSetColumnSizeRequest instantiates a new QbankColumnsortorderSetColumnSizeRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewQbankColumnsortorderSetColumnSizeRequestWithDefaults

`func NewQbankColumnsortorderSetColumnSizeRequestWithDefaults() *QbankColumnsortorderSetColumnSizeRequest`

NewQbankColumnsortorderSetColumnSizeRequestWithDefaults instantiates a new QbankColumnsortorderSetColumnSizeRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGlobal

`func (o *QbankColumnsortorderSetColumnSizeRequest) GetGlobal() bool`

GetGlobal returns the Global field if non-nil, zero value otherwise.

### GetGlobalOk

`func (o *QbankColumnsortorderSetColumnSizeRequest) GetGlobalOk() (*bool, bool)`

GetGlobalOk returns a tuple with the Global field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlobal

`func (o *QbankColumnsortorderSetColumnSizeRequest) SetGlobal(v bool)`

SetGlobal sets Global field to given value.

### HasGlobal

`func (o *QbankColumnsortorderSetColumnSizeRequest) HasGlobal() bool`

HasGlobal returns a boolean if a field has been set.

### GetSizes

`func (o *QbankColumnsortorderSetColumnSizeRequest) GetSizes() string`

GetSizes returns the Sizes field if non-nil, zero value otherwise.

### GetSizesOk

`func (o *QbankColumnsortorderSetColumnSizeRequest) GetSizesOk() (*string, bool)`

GetSizesOk returns a tuple with the Sizes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSizes

`func (o *QbankColumnsortorderSetColumnSizeRequest) SetSizes(v string)`

SetSizes sets Sizes field to given value.

### HasSizes

`func (o *QbankColumnsortorderSetColumnSizeRequest) HasSizes() bool`

HasSizes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


