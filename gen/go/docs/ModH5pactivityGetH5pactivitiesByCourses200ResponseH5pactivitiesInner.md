# ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Contenthash** | Pointer to **string** | Sha1 hash of file content. | [optional] [default to "null"]
**Context** | Pointer to **int32** | context | [optional] [default to null]
**Course** | Pointer to **int32** | Course id this h5p activity is part of. | [optional] [default to null]
**Coursemodule** | Pointer to **int32** | coursemodule | [optional] 
**Deployedfile** | Pointer to [**ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile**](ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md) |  | [optional] 
**Displayoptions** | Pointer to **int32** | H5P Button display options. | [optional] [default to 0]
**Enabletracking** | Pointer to **int32** | Enable xAPI tracking. | [optional] [default to 1]
**Grade** | Pointer to **int32** | The maximum grade for submission. | [optional] [default to 0]
**Grademethod** | Pointer to **int32** | Which H5P attempt is used for grading. | [optional] [default to 1]
**Id** | Pointer to **int32** | The primary key of the record. | [optional] 
**Intro** | Pointer to **string** | H5P activity description. | [optional] [default to ""]
**Introfiles** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Introformat** | Pointer to **int32** | intro format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) | [optional] [default to 0]
**Name** | Pointer to **string** | The name of the activity module instance. | [optional] [default to "null"]
**Package** | Pointer to [**[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner**](CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md) |  | [optional] 
**Timecreated** | Pointer to **int32** | Timestamp of when the instance was added to the course. | [optional] [default to null]
**Timemodified** | Pointer to **int32** | Timestamp of when the instance was last modified. | [optional] [default to null]

## Methods

### NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner

`func NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner() *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner`

NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner instantiates a new ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerWithDefaults

`func NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerWithDefaults() *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner`

NewModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerWithDefaults instantiates a new ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContenthash

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContenthash() string`

GetContenthash returns the Contenthash field if non-nil, zero value otherwise.

### GetContenthashOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContenthashOk() (*string, bool)`

GetContenthashOk returns a tuple with the Contenthash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContenthash

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetContenthash(v string)`

SetContenthash sets Contenthash field to given value.

### HasContenthash

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasContenthash() bool`

HasContenthash returns a boolean if a field has been set.

### GetContext

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContext() int32`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetContextOk() (*int32, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetContext(v int32)`

SetContext sets Context field to given value.

### HasContext

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasContext() bool`

HasContext returns a boolean if a field has been set.

### GetCourse

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCourse() int32`

GetCourse returns the Course field if non-nil, zero value otherwise.

### GetCourseOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCourseOk() (*int32, bool)`

GetCourseOk returns a tuple with the Course field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCourse

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetCourse(v int32)`

SetCourse sets Course field to given value.

### HasCourse

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasCourse() bool`

HasCourse returns a boolean if a field has been set.

### GetCoursemodule

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCoursemodule() int32`

GetCoursemodule returns the Coursemodule field if non-nil, zero value otherwise.

### GetCoursemoduleOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetCoursemoduleOk() (*int32, bool)`

GetCoursemoduleOk returns a tuple with the Coursemodule field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCoursemodule

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetCoursemodule(v int32)`

SetCoursemodule sets Coursemodule field to given value.

### HasCoursemodule

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasCoursemodule() bool`

HasCoursemodule returns a boolean if a field has been set.

### GetDeployedfile

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDeployedfile() ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile`

GetDeployedfile returns the Deployedfile field if non-nil, zero value otherwise.

### GetDeployedfileOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDeployedfileOk() (*ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile, bool)`

GetDeployedfileOk returns a tuple with the Deployedfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeployedfile

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetDeployedfile(v ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile)`

SetDeployedfile sets Deployedfile field to given value.

### HasDeployedfile

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasDeployedfile() bool`

HasDeployedfile returns a boolean if a field has been set.

### GetDisplayoptions

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDisplayoptions() int32`

GetDisplayoptions returns the Displayoptions field if non-nil, zero value otherwise.

### GetDisplayoptionsOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetDisplayoptionsOk() (*int32, bool)`

GetDisplayoptionsOk returns a tuple with the Displayoptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayoptions

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetDisplayoptions(v int32)`

SetDisplayoptions sets Displayoptions field to given value.

### HasDisplayoptions

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasDisplayoptions() bool`

HasDisplayoptions returns a boolean if a field has been set.

### GetEnabletracking

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetEnabletracking() int32`

GetEnabletracking returns the Enabletracking field if non-nil, zero value otherwise.

### GetEnabletrackingOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetEnabletrackingOk() (*int32, bool)`

GetEnabletrackingOk returns a tuple with the Enabletracking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabletracking

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetEnabletracking(v int32)`

SetEnabletracking sets Enabletracking field to given value.

### HasEnabletracking

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasEnabletracking() bool`

HasEnabletracking returns a boolean if a field has been set.

### GetGrade

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrade() int32`

GetGrade returns the Grade field if non-nil, zero value otherwise.

### GetGradeOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGradeOk() (*int32, bool)`

GetGradeOk returns a tuple with the Grade field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrade

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetGrade(v int32)`

SetGrade sets Grade field to given value.

### HasGrade

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasGrade() bool`

HasGrade returns a boolean if a field has been set.

### GetGrademethod

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrademethod() int32`

GetGrademethod returns the Grademethod field if non-nil, zero value otherwise.

### GetGrademethodOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetGrademethodOk() (*int32, bool)`

GetGrademethodOk returns a tuple with the Grademethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGrademethod

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetGrademethod(v int32)`

SetGrademethod sets Grademethod field to given value.

### HasGrademethod

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasGrademethod() bool`

HasGrademethod returns a boolean if a field has been set.

### GetId

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasId() bool`

HasId returns a boolean if a field has been set.

### GetIntro

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntro() string`

GetIntro returns the Intro field if non-nil, zero value otherwise.

### GetIntroOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroOk() (*string, bool)`

GetIntroOk returns a tuple with the Intro field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntro

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntro(v string)`

SetIntro sets Intro field to given value.

### HasIntro

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntro() bool`

HasIntro returns a boolean if a field has been set.

### GetIntrofiles

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntrofiles() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetIntrofiles returns the Introfiles field if non-nil, zero value otherwise.

### GetIntrofilesOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntrofilesOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetIntrofilesOk returns a tuple with the Introfiles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntrofiles

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntrofiles(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetIntrofiles sets Introfiles field to given value.

### HasIntrofiles

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntrofiles() bool`

HasIntrofiles returns a boolean if a field has been set.

### GetIntroformat

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroformat() int32`

GetIntroformat returns the Introformat field if non-nil, zero value otherwise.

### GetIntroformatOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetIntroformatOk() (*int32, bool)`

GetIntroformatOk returns a tuple with the Introformat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntroformat

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetIntroformat(v int32)`

SetIntroformat sets Introformat field to given value.

### HasIntroformat

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasIntroformat() bool`

HasIntroformat returns a boolean if a field has been set.

### GetName

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetPackage

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetPackage() []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner`

GetPackage returns the Package field if non-nil, zero value otherwise.

### GetPackageOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetPackageOk() (*[]CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner, bool)`

GetPackageOk returns a tuple with the Package field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackage

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetPackage(v []CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner)`

SetPackage sets Package field to given value.

### HasPackage

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasPackage() bool`

HasPackage returns a boolean if a field has been set.

### GetTimecreated

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimecreated() int32`

GetTimecreated returns the Timecreated field if non-nil, zero value otherwise.

### GetTimecreatedOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimecreatedOk() (*int32, bool)`

GetTimecreatedOk returns a tuple with the Timecreated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimecreated

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetTimecreated(v int32)`

SetTimecreated sets Timecreated field to given value.

### HasTimecreated

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasTimecreated() bool`

HasTimecreated returns a boolean if a field has been set.

### GetTimemodified

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimemodified() int32`

GetTimemodified returns the Timemodified field if non-nil, zero value otherwise.

### GetTimemodifiedOk

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) GetTimemodifiedOk() (*int32, bool)`

GetTimemodifiedOk returns a tuple with the Timemodified field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimemodified

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) SetTimemodified(v int32)`

SetTimemodified sets Timemodified field to given value.

### HasTimemodified

`func (o *ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner) HasTimemodified() bool`

HasTimemodified returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


