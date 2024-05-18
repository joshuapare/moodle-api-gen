# CoreReportbuilderColumnsSortToggleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columnid** | **int32** | Column ID | 
**Direction** | Pointer to **int32** | Sort direction | [optional] [default to 4]
**Enabled** | **bool** | Sort enabled | [default to null]
**Reportid** | **int32** | Report ID | 

## Methods

### NewCoreReportbuilderColumnsSortToggleRequest

`func NewCoreReportbuilderColumnsSortToggleRequest(columnid int32, enabled bool, reportid int32, ) *CoreReportbuilderColumnsSortToggleRequest`

NewCoreReportbuilderColumnsSortToggleRequest instantiates a new CoreReportbuilderColumnsSortToggleRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreReportbuilderColumnsSortToggleRequestWithDefaults

`func NewCoreReportbuilderColumnsSortToggleRequestWithDefaults() *CoreReportbuilderColumnsSortToggleRequest`

NewCoreReportbuilderColumnsSortToggleRequestWithDefaults instantiates a new CoreReportbuilderColumnsSortToggleRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColumnid

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetColumnid() int32`

GetColumnid returns the Columnid field if non-nil, zero value otherwise.

### GetColumnidOk

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetColumnidOk() (*int32, bool)`

GetColumnidOk returns a tuple with the Columnid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColumnid

`func (o *CoreReportbuilderColumnsSortToggleRequest) SetColumnid(v int32)`

SetColumnid sets Columnid field to given value.


### GetDirection

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetDirection() int32`

GetDirection returns the Direction field if non-nil, zero value otherwise.

### GetDirectionOk

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetDirectionOk() (*int32, bool)`

GetDirectionOk returns a tuple with the Direction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDirection

`func (o *CoreReportbuilderColumnsSortToggleRequest) SetDirection(v int32)`

SetDirection sets Direction field to given value.

### HasDirection

`func (o *CoreReportbuilderColumnsSortToggleRequest) HasDirection() bool`

HasDirection returns a boolean if a field has been set.

### GetEnabled

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetEnabled() bool`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetEnabledOk() (*bool, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *CoreReportbuilderColumnsSortToggleRequest) SetEnabled(v bool)`

SetEnabled sets Enabled field to given value.


### GetReportid

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetReportid() int32`

GetReportid returns the Reportid field if non-nil, zero value otherwise.

### GetReportidOk

`func (o *CoreReportbuilderColumnsSortToggleRequest) GetReportidOk() (*int32, bool)`

GetReportidOk returns a tuple with the Reportid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReportid

`func (o *CoreReportbuilderColumnsSortToggleRequest) SetReportid(v int32)`

SetReportid sets Reportid field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


