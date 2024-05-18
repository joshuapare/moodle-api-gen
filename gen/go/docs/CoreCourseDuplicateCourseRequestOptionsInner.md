# CoreCourseDuplicateCourseRequestOptionsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The backup option name:                                             \&quot;activities\&quot; (int) Include course activites (default to 1 that is equal to yes),                                             \&quot;blocks\&quot; (int) Include course blocks (default to 1 that is equal to yes),                                             \&quot;filters\&quot; (int) Include course filters  (default to 1 that is equal to yes),                                             \&quot;users\&quot; (int) Include users (default to 0 that is equal to no),                                             \&quot;enrolments\&quot; (int) Include enrolment methods (default to 1 - restore only with users),                                             \&quot;role_assignments\&quot; (int) Include role assignments  (default to 0 that is equal to no),                                             \&quot;comments\&quot; (int) Include user comments  (default to 0 that is equal to no),                                             \&quot;userscompletion\&quot; (int) Include user course completion information  (default to 0 that is equal to no),                                             \&quot;logs\&quot; (int) Include course logs  (default to 0 that is equal to no),                                             \&quot;grade_histories\&quot; (int) Include histories  (default to 0 that is equal to no) | [optional] [default to "null"]
**Value** | Pointer to **string** | the value for the option 1 (yes) or 0 (no) | [optional] [default to "null"]

## Methods

### NewCoreCourseDuplicateCourseRequestOptionsInner

`func NewCoreCourseDuplicateCourseRequestOptionsInner() *CoreCourseDuplicateCourseRequestOptionsInner`

NewCoreCourseDuplicateCourseRequestOptionsInner instantiates a new CoreCourseDuplicateCourseRequestOptionsInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCoreCourseDuplicateCourseRequestOptionsInnerWithDefaults

`func NewCoreCourseDuplicateCourseRequestOptionsInnerWithDefaults() *CoreCourseDuplicateCourseRequestOptionsInner`

NewCoreCourseDuplicateCourseRequestOptionsInnerWithDefaults instantiates a new CoreCourseDuplicateCourseRequestOptionsInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetValue

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *CoreCourseDuplicateCourseRequestOptionsInner) HasValue() bool`

HasValue returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


