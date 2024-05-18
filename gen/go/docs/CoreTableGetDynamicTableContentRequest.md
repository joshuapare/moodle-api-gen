# CoreTableGetDynamicTableContentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Component** | **string** | Component | 
**Filters** | Pointer to [**[]CoreTableGetDynamicTableContentRequestFiltersInner**](CoreTableGetDynamicTableContentRequestFiltersInner.md) |  | [optional] 
**Firstinitial** | **string** | The first initial to sort filter on | [default to "null"]
**Handler** | **string** | Handler | [default to "null"]
**Hiddencolumns** | **[]map[string]interface{}** |  | 
**Jointype** | **int32** | Type of join to join all filters together | [default to null]
**Lastinitial** | **string** | The last initial to sort filter on | [default to "null"]
**Pagenumber** | **int32** | The page number | [default to null]
**Pagesize** | **int32** | The number of records per page | [default to null]
**Resetpreferences** | **bool** | Whether the table preferences should be reset | [default to null]
**Sortdata** | Pointer to [**[]CoreTableGetDynamicTableContentRequestSortdataInner**](CoreTableGetDynamicTableContentRequestSortdataInner.md) |  | [optional] 
**Uniqueid** | **string** | Unique ID for the container | [default to "null"]

## Methods

### NewCoreTableGetDynamicTableContentRequest

`func NewCoreTableGetDynamicTableContentRequest(component string, firstinitial string, handler string, hiddencolumns []map[string]interface{}, jointype int32, lastinitial string, pagenumber int32, pagesize int32, resetpreferences bool, uniqueid string, ) *CoreTableGetDynamicTableContentRequest`

NewCoreTableGetDynamicTableContentRequest instantiates a new CoreTableGetDynamicTableContentRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreTableGetDynamicTableContentRequestWithDefaults

`func NewCoreTableGetDynamicTableContentRequestWithDefaults() *CoreTableGetDynamicTableContentRequest`

NewCoreTableGetDynamicTableContentRequestWithDefaults instantiates a new CoreTableGetDynamicTableContentRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetComponent

`func (o *CoreTableGetDynamicTableContentRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreTableGetDynamicTableContentRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreTableGetDynamicTableContentRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetFilters

`func (o *CoreTableGetDynamicTableContentRequest) GetFilters() []CoreTableGetDynamicTableContentRequestFiltersInner`

GetFilters returns the Filters field if non-nil, zero value otherwise.

### GetFiltersOk

`func (o *CoreTableGetDynamicTableContentRequest) GetFiltersOk() (*[]CoreTableGetDynamicTableContentRequestFiltersInner, bool)`

GetFiltersOk returns a tuple with the Filters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilters

`func (o *CoreTableGetDynamicTableContentRequest) SetFilters(v []CoreTableGetDynamicTableContentRequestFiltersInner)`

SetFilters sets Filters field to given value.

### HasFilters

`func (o *CoreTableGetDynamicTableContentRequest) HasFilters() bool`

HasFilters returns a boolean if a field has been set.

### GetFirstinitial

`func (o *CoreTableGetDynamicTableContentRequest) GetFirstinitial() string`

GetFirstinitial returns the Firstinitial field if non-nil, zero value otherwise.

### GetFirstinitialOk

`func (o *CoreTableGetDynamicTableContentRequest) GetFirstinitialOk() (*string, bool)`

GetFirstinitialOk returns a tuple with the Firstinitial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstinitial

`func (o *CoreTableGetDynamicTableContentRequest) SetFirstinitial(v string)`

SetFirstinitial sets Firstinitial field to given value.


### GetHandler

`func (o *CoreTableGetDynamicTableContentRequest) GetHandler() string`

GetHandler returns the Handler field if non-nil, zero value otherwise.

### GetHandlerOk

`func (o *CoreTableGetDynamicTableContentRequest) GetHandlerOk() (*string, bool)`

GetHandlerOk returns a tuple with the Handler field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHandler

`func (o *CoreTableGetDynamicTableContentRequest) SetHandler(v string)`

SetHandler sets Handler field to given value.


### GetHiddencolumns

`func (o *CoreTableGetDynamicTableContentRequest) GetHiddencolumns() []map[string]interface{}`

GetHiddencolumns returns the Hiddencolumns field if non-nil, zero value otherwise.

### GetHiddencolumnsOk

`func (o *CoreTableGetDynamicTableContentRequest) GetHiddencolumnsOk() (*[]map[string]interface{}, bool)`

GetHiddencolumnsOk returns a tuple with the Hiddencolumns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHiddencolumns

`func (o *CoreTableGetDynamicTableContentRequest) SetHiddencolumns(v []map[string]interface{})`

SetHiddencolumns sets Hiddencolumns field to given value.


### GetJointype

`func (o *CoreTableGetDynamicTableContentRequest) GetJointype() int32`

GetJointype returns the Jointype field if non-nil, zero value otherwise.

### GetJointypeOk

`func (o *CoreTableGetDynamicTableContentRequest) GetJointypeOk() (*int32, bool)`

GetJointypeOk returns a tuple with the Jointype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJointype

`func (o *CoreTableGetDynamicTableContentRequest) SetJointype(v int32)`

SetJointype sets Jointype field to given value.


### GetLastinitial

`func (o *CoreTableGetDynamicTableContentRequest) GetLastinitial() string`

GetLastinitial returns the Lastinitial field if non-nil, zero value otherwise.

### GetLastinitialOk

`func (o *CoreTableGetDynamicTableContentRequest) GetLastinitialOk() (*string, bool)`

GetLastinitialOk returns a tuple with the Lastinitial field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastinitial

`func (o *CoreTableGetDynamicTableContentRequest) SetLastinitial(v string)`

SetLastinitial sets Lastinitial field to given value.


### GetPagenumber

`func (o *CoreTableGetDynamicTableContentRequest) GetPagenumber() int32`

GetPagenumber returns the Pagenumber field if non-nil, zero value otherwise.

### GetPagenumberOk

`func (o *CoreTableGetDynamicTableContentRequest) GetPagenumberOk() (*int32, bool)`

GetPagenumberOk returns a tuple with the Pagenumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagenumber

`func (o *CoreTableGetDynamicTableContentRequest) SetPagenumber(v int32)`

SetPagenumber sets Pagenumber field to given value.


### GetPagesize

`func (o *CoreTableGetDynamicTableContentRequest) GetPagesize() int32`

GetPagesize returns the Pagesize field if non-nil, zero value otherwise.

### GetPagesizeOk

`func (o *CoreTableGetDynamicTableContentRequest) GetPagesizeOk() (*int32, bool)`

GetPagesizeOk returns a tuple with the Pagesize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPagesize

`func (o *CoreTableGetDynamicTableContentRequest) SetPagesize(v int32)`

SetPagesize sets Pagesize field to given value.


### GetResetpreferences

`func (o *CoreTableGetDynamicTableContentRequest) GetResetpreferences() bool`

GetResetpreferences returns the Resetpreferences field if non-nil, zero value otherwise.

### GetResetpreferencesOk

`func (o *CoreTableGetDynamicTableContentRequest) GetResetpreferencesOk() (*bool, bool)`

GetResetpreferencesOk returns a tuple with the Resetpreferences field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResetpreferences

`func (o *CoreTableGetDynamicTableContentRequest) SetResetpreferences(v bool)`

SetResetpreferences sets Resetpreferences field to given value.


### GetSortdata

`func (o *CoreTableGetDynamicTableContentRequest) GetSortdata() []CoreTableGetDynamicTableContentRequestSortdataInner`

GetSortdata returns the Sortdata field if non-nil, zero value otherwise.

### GetSortdataOk

`func (o *CoreTableGetDynamicTableContentRequest) GetSortdataOk() (*[]CoreTableGetDynamicTableContentRequestSortdataInner, bool)`

GetSortdataOk returns a tuple with the Sortdata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSortdata

`func (o *CoreTableGetDynamicTableContentRequest) SetSortdata(v []CoreTableGetDynamicTableContentRequestSortdataInner)`

SetSortdata sets Sortdata field to given value.

### HasSortdata

`func (o *CoreTableGetDynamicTableContentRequest) HasSortdata() bool`

HasSortdata returns a boolean if a field has been set.

### GetUniqueid

`func (o *CoreTableGetDynamicTableContentRequest) GetUniqueid() string`

GetUniqueid returns the Uniqueid field if non-nil, zero value otherwise.

### GetUniqueidOk

`func (o *CoreTableGetDynamicTableContentRequest) GetUniqueidOk() (*string, bool)`

GetUniqueidOk returns a tuple with the Uniqueid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUniqueid

`func (o *CoreTableGetDynamicTableContentRequest) SetUniqueid(v string)`

SetUniqueid sets Uniqueid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


