# CoreGradesUpdateGradesRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Activityid** | **int32** | The activity ID | [default to null]
**Component** | **string** | A component, for example mod_forum or mod_quiz | [default to "null"]
**Courseid** | **int32** | id of course | 
**Grades** | Pointer to [**[]CoreGradesUpdateGradesRequestGradesInner**](CoreGradesUpdateGradesRequestGradesInner.md) |  | [optional] 
**Itemdetails** | Pointer to [**CoreGradesUpdateGradesRequestItemdetails**](CoreGradesUpdateGradesRequestItemdetails.md) |  | [optional] 
**Itemnumber** | **int32** | grade item ID number for modules that have multiple grades. Typically this is 0. | [default to null]
**Source** | **string** | The source of the grade update | [default to "null"]

## Methods

### NewCoreGradesUpdateGradesRequest

`func NewCoreGradesUpdateGradesRequest(activityid int32, component string, courseid int32, itemnumber int32, source string, ) *CoreGradesUpdateGradesRequest`

NewCoreGradesUpdateGradesRequest instantiates a new CoreGradesUpdateGradesRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreGradesUpdateGradesRequestWithDefaults

`func NewCoreGradesUpdateGradesRequestWithDefaults() *CoreGradesUpdateGradesRequest`

NewCoreGradesUpdateGradesRequestWithDefaults instantiates a new CoreGradesUpdateGradesRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetActivityid

`func (o *CoreGradesUpdateGradesRequest) GetActivityid() int32`

GetActivityid returns the Activityid field if non-nil, zero value otherwise.

### GetActivityidOk

`func (o *CoreGradesUpdateGradesRequest) GetActivityidOk() (*int32, bool)`

GetActivityidOk returns a tuple with the Activityid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetActivityid

`func (o *CoreGradesUpdateGradesRequest) SetActivityid(v int32)`

SetActivityid sets Activityid field to given value.


### GetComponent

`func (o *CoreGradesUpdateGradesRequest) GetComponent() string`

GetComponent returns the Component field if non-nil, zero value otherwise.

### GetComponentOk

`func (o *CoreGradesUpdateGradesRequest) GetComponentOk() (*string, bool)`

GetComponentOk returns a tuple with the Component field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComponent

`func (o *CoreGradesUpdateGradesRequest) SetComponent(v string)`

SetComponent sets Component field to given value.


### GetCourseid

`func (o *CoreGradesUpdateGradesRequest) GetCourseid() int32`

GetCourseid returns the Courseid field if non-nil, zero value otherwise.

### GetCourseidOk

`func (o *CoreGradesUpdateGradesRequest) GetCourseidOk() (*int32, bool)`

GetCourseidOk returns a tuple with the Courseid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseid

`func (o *CoreGradesUpdateGradesRequest) SetCourseid(v int32)`

SetCourseid sets Courseid field to given value.


### GetGrades

`func (o *CoreGradesUpdateGradesRequest) GetGrades() []CoreGradesUpdateGradesRequestGradesInner`

GetGrades returns the Grades field if non-nil, zero value otherwise.

### GetGradesOk

`func (o *CoreGradesUpdateGradesRequest) GetGradesOk() (*[]CoreGradesUpdateGradesRequestGradesInner, bool)`

GetGradesOk returns a tuple with the Grades field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrades

`func (o *CoreGradesUpdateGradesRequest) SetGrades(v []CoreGradesUpdateGradesRequestGradesInner)`

SetGrades sets Grades field to given value.

### HasGrades

`func (o *CoreGradesUpdateGradesRequest) HasGrades() bool`

HasGrades returns a boolean if a field has been set.

### GetItemdetails

`func (o *CoreGradesUpdateGradesRequest) GetItemdetails() CoreGradesUpdateGradesRequestItemdetails`

GetItemdetails returns the Itemdetails field if non-nil, zero value otherwise.

### GetItemdetailsOk

`func (o *CoreGradesUpdateGradesRequest) GetItemdetailsOk() (*CoreGradesUpdateGradesRequestItemdetails, bool)`

GetItemdetailsOk returns a tuple with the Itemdetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemdetails

`func (o *CoreGradesUpdateGradesRequest) SetItemdetails(v CoreGradesUpdateGradesRequestItemdetails)`

SetItemdetails sets Itemdetails field to given value.

### HasItemdetails

`func (o *CoreGradesUpdateGradesRequest) HasItemdetails() bool`

HasItemdetails returns a boolean if a field has been set.

### GetItemnumber

`func (o *CoreGradesUpdateGradesRequest) GetItemnumber() int32`

GetItemnumber returns the Itemnumber field if non-nil, zero value otherwise.

### GetItemnumberOk

`func (o *CoreGradesUpdateGradesRequest) GetItemnumberOk() (*int32, bool)`

GetItemnumberOk returns a tuple with the Itemnumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemnumber

`func (o *CoreGradesUpdateGradesRequest) SetItemnumber(v int32)`

SetItemnumber sets Itemnumber field to given value.


### GetSource

`func (o *CoreGradesUpdateGradesRequest) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *CoreGradesUpdateGradesRequest) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *CoreGradesUpdateGradesRequest) SetSource(v string)`

SetSource sets Source field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


