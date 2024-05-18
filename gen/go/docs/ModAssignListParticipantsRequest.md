# ModAssignListParticipantsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Assignid** | **int32** | assign instance id | 
**Filter** | **string** | search string to filter the results | [default to "null"]
**Groupid** | **int32** | group id | 
**Includeenrolments** | Pointer to **bool** | Do return courses where the user is enrolled | [optional] [default to true]
**Limit** | Pointer to **int32** | maximum number of records to return | [optional] [default to 0]
**Onlyids** | Pointer to **bool** | Do not return all user fields | [optional] [default to false]
**Skip** | Pointer to **int32** | number of records to skip | [optional] [default to 0]
**Tablesort** | Pointer to **bool** | Apply current user table sorting preferences. | [optional] [default to false]

## Methods

### NewModAssignListParticipantsRequest

`func NewModAssignListParticipantsRequest(assignid int32, filter string, groupid int32, ) *ModAssignListParticipantsRequest`

NewModAssignListParticipantsRequest instantiates a new ModAssignListParticipantsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignListParticipantsRequestWithDefaults

`func NewModAssignListParticipantsRequestWithDefaults() *ModAssignListParticipantsRequest`

NewModAssignListParticipantsRequestWithDefaults instantiates a new ModAssignListParticipantsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAssignid

`func (o *ModAssignListParticipantsRequest) GetAssignid() int32`

GetAssignid returns the Assignid field if non-nil, zero value otherwise.

### GetAssignidOk

`func (o *ModAssignListParticipantsRequest) GetAssignidOk() (*int32, bool)`

GetAssignidOk returns a tuple with the Assignid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssignid

`func (o *ModAssignListParticipantsRequest) SetAssignid(v int32)`

SetAssignid sets Assignid field to given value.


### GetFilter

`func (o *ModAssignListParticipantsRequest) GetFilter() string`

GetFilter returns the Filter field if non-nil, zero value otherwise.

### GetFilterOk

`func (o *ModAssignListParticipantsRequest) GetFilterOk() (*string, bool)`

GetFilterOk returns a tuple with the Filter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilter

`func (o *ModAssignListParticipantsRequest) SetFilter(v string)`

SetFilter sets Filter field to given value.


### GetGroupid

`func (o *ModAssignListParticipantsRequest) GetGroupid() int32`

GetGroupid returns the Groupid field if non-nil, zero value otherwise.

### GetGroupidOk

`func (o *ModAssignListParticipantsRequest) GetGroupidOk() (*int32, bool)`

GetGroupidOk returns a tuple with the Groupid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupid

`func (o *ModAssignListParticipantsRequest) SetGroupid(v int32)`

SetGroupid sets Groupid field to given value.


### GetIncludeenrolments

`func (o *ModAssignListParticipantsRequest) GetIncludeenrolments() bool`

GetIncludeenrolments returns the Includeenrolments field if non-nil, zero value otherwise.

### GetIncludeenrolmentsOk

`func (o *ModAssignListParticipantsRequest) GetIncludeenrolmentsOk() (*bool, bool)`

GetIncludeenrolmentsOk returns a tuple with the Includeenrolments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeenrolments

`func (o *ModAssignListParticipantsRequest) SetIncludeenrolments(v bool)`

SetIncludeenrolments sets Includeenrolments field to given value.

### HasIncludeenrolments

`func (o *ModAssignListParticipantsRequest) HasIncludeenrolments() bool`

HasIncludeenrolments returns a boolean if a field has been set.

### GetLimit

`func (o *ModAssignListParticipantsRequest) GetLimit() int32`

GetLimit returns the Limit field if non-nil, zero value otherwise.

### GetLimitOk

`func (o *ModAssignListParticipantsRequest) GetLimitOk() (*int32, bool)`

GetLimitOk returns a tuple with the Limit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimit

`func (o *ModAssignListParticipantsRequest) SetLimit(v int32)`

SetLimit sets Limit field to given value.

### HasLimit

`func (o *ModAssignListParticipantsRequest) HasLimit() bool`

HasLimit returns a boolean if a field has been set.

### GetOnlyids

`func (o *ModAssignListParticipantsRequest) GetOnlyids() bool`

GetOnlyids returns the Onlyids field if non-nil, zero value otherwise.

### GetOnlyidsOk

`func (o *ModAssignListParticipantsRequest) GetOnlyidsOk() (*bool, bool)`

GetOnlyidsOk returns a tuple with the Onlyids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnlyids

`func (o *ModAssignListParticipantsRequest) SetOnlyids(v bool)`

SetOnlyids sets Onlyids field to given value.

### HasOnlyids

`func (o *ModAssignListParticipantsRequest) HasOnlyids() bool`

HasOnlyids returns a boolean if a field has been set.

### GetSkip

`func (o *ModAssignListParticipantsRequest) GetSkip() int32`

GetSkip returns the Skip field if non-nil, zero value otherwise.

### GetSkipOk

`func (o *ModAssignListParticipantsRequest) GetSkipOk() (*int32, bool)`

GetSkipOk returns a tuple with the Skip field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkip

`func (o *ModAssignListParticipantsRequest) SetSkip(v int32)`

SetSkip sets Skip field to given value.

### HasSkip

`func (o *ModAssignListParticipantsRequest) HasSkip() bool`

HasSkip returns a boolean if a field has been set.

### GetTablesort

`func (o *ModAssignListParticipantsRequest) GetTablesort() bool`

GetTablesort returns the Tablesort field if non-nil, zero value otherwise.

### GetTablesortOk

`func (o *ModAssignListParticipantsRequest) GetTablesortOk() (*bool, bool)`

GetTablesortOk returns a tuple with the Tablesort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTablesort

`func (o *ModAssignListParticipantsRequest) SetTablesort(v bool)`

SetTablesort sets Tablesort field to given value.

### HasTablesort

`func (o *ModAssignListParticipantsRequest) HasTablesort() bool`

HasTablesort returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


