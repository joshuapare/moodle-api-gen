# ModAssignGetAssignmentsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Capabilities** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Courseids** | Pointer to **[]map[string]interface{}** |  | [optional] 
**Includenotenrolledcourses** | Pointer to **bool** | whether to return courses that the user can see                                                                     even if is not enroled in. This requires the parameter courseids                                                                     to not be empty. | [optional] [default to false]

## Methods

### NewModAssignGetAssignmentsRequest

`func NewModAssignGetAssignmentsRequest() *ModAssignGetAssignmentsRequest`

NewModAssignGetAssignmentsRequest instantiates a new ModAssignGetAssignmentsRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModAssignGetAssignmentsRequestWithDefaults

`func NewModAssignGetAssignmentsRequestWithDefaults() *ModAssignGetAssignmentsRequest`

NewModAssignGetAssignmentsRequestWithDefaults instantiates a new ModAssignGetAssignmentsRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCapabilities

`func (o *ModAssignGetAssignmentsRequest) GetCapabilities() []map[string]interface{}`

GetCapabilities returns the Capabilities field if non-nil, zero value otherwise.

### GetCapabilitiesOk

`func (o *ModAssignGetAssignmentsRequest) GetCapabilitiesOk() (*[]map[string]interface{}, bool)`

GetCapabilitiesOk returns a tuple with the Capabilities field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapabilities

`func (o *ModAssignGetAssignmentsRequest) SetCapabilities(v []map[string]interface{})`

SetCapabilities sets Capabilities field to given value.

### HasCapabilities

`func (o *ModAssignGetAssignmentsRequest) HasCapabilities() bool`

HasCapabilities returns a boolean if a field has been set.

### GetCourseids

`func (o *ModAssignGetAssignmentsRequest) GetCourseids() []map[string]interface{}`

GetCourseids returns the Courseids field if non-nil, zero value otherwise.

### GetCourseidsOk

`func (o *ModAssignGetAssignmentsRequest) GetCourseidsOk() (*[]map[string]interface{}, bool)`

GetCourseidsOk returns a tuple with the Courseids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourseids

`func (o *ModAssignGetAssignmentsRequest) SetCourseids(v []map[string]interface{})`

SetCourseids sets Courseids field to given value.

### HasCourseids

`func (o *ModAssignGetAssignmentsRequest) HasCourseids() bool`

HasCourseids returns a boolean if a field has been set.

### GetIncludenotenrolledcourses

`func (o *ModAssignGetAssignmentsRequest) GetIncludenotenrolledcourses() bool`

GetIncludenotenrolledcourses returns the Includenotenrolledcourses field if non-nil, zero value otherwise.

### GetIncludenotenrolledcoursesOk

`func (o *ModAssignGetAssignmentsRequest) GetIncludenotenrolledcoursesOk() (*bool, bool)`

GetIncludenotenrolledcoursesOk returns a tuple with the Includenotenrolledcourses field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludenotenrolledcourses

`func (o *ModAssignGetAssignmentsRequest) SetIncludenotenrolledcourses(v bool)`

SetIncludenotenrolledcourses sets Includenotenrolledcourses field to given value.

### HasIncludenotenrolledcourses

`func (o *ModAssignGetAssignmentsRequest) HasIncludenotenrolledcourses() bool`

HasIncludenotenrolledcourses returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


