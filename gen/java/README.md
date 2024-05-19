<br>
<div align="center">
  <img src="https://moodle.com/wp-content/uploads/2024/02/Moodlelogo.svg" alt="Moodle" width="300">
  <h1 align="center" style="padding-top: 20px;">
    Moodle | Java Client
  </h1>
</div>

<br>

<div align="center">
  <img alt="GitHub Release" src="https://img.shields.io/github/v/release/joshuapare/moodle-api-gen?include_prereleases&style=flat-square&color=f98012">
  <img alt="GitHub License" src="https://img.shields.io/github/license/joshuapare/moodle-api-gen?style=flat-square">
  <img alt="Built with Go" src="https://img.shields.io/badge/built_with-Go-007D9C.svg?style=flat-square">
</div>

<br>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-B125EA?style=for-the-badge&logo=java&logoColor=white" />
</p>
 

Java Client for Moodle, generated from the relevant OpenAPI spec from the [moodle-api-gen](https://www.github.com/joshuapare/moodle-api-gen) project.

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.joshuapare</groupId>
  <artifactId>moodle-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'moodle-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'moodle-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.joshuapare:moodle-client:0.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/moodle-client-0.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.joshuapare.ApiClient;
import com.joshuapare.ApiException;
import com.joshuapare.Configuration;
import com.joshuapare.auth.*;
import com.joshuapare.models.*;
import com.joshuapare.moodleclient.AuthEmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://localhost/webservice/restful/server.php");
    
    // Configure API key authorization: apiKey
    ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
    apiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKey.setApiKeyPrefix("Token");

    AuthEmailApi apiInstance = new AuthEmailApi(defaultClient);
    try {
      AuthEmailGetSignupSettings200Response result = apiInstance.authEmailGetSignupSettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthEmailApi#authEmailGetSignupSettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/webservice/restful/server.php*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthEmailApi* | [**authEmailGetSignupSettings**](docs/AuthEmailApi.md#authEmailGetSignupSettings) | **POST** /auth_email_get_signup_settings | Get the signup required settings and profile fields.
*AuthEmailApi* | [**authEmailSignupUser**](docs/AuthEmailApi.md#authEmailSignupUser) | **POST** /auth_email_signup_user | Adds a new user (pendingto be confirmed) in the site.
*BlockAccessreviewApi* | [**blockAccessreviewGetModuleData**](docs/BlockAccessreviewApi.md#blockAccessreviewGetModuleData) | **POST** /block_accessreview_get_module_data | Gets error data for course modules.
*BlockAccessreviewApi* | [**blockAccessreviewGetSectionData**](docs/BlockAccessreviewApi.md#blockAccessreviewGetSectionData) | **POST** /block_accessreview_get_section_data | Gets error data for course sections.
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAllocateLicenses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAllocateLicenses) | **POST** /block_iomad_company_admin_allocate_licenses | Allocate course licenses to a user
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAssignCourses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignCourses) | **POST** /block_iomad_company_admin_assign_courses | Assign a course to a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminAssignUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminAssignUsers) | **POST** /block_iomad_company_admin_assign_users | Assign users to a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCapabilityDeleteTemplate**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCapabilityDeleteTemplate) | **POST** /block_iomad_company_admin_capability_delete_template | Delete Iomad capabilities template
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCheckToken**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCheckToken) | **POST** /block_iomad_company_admin_check_token | Check SSO token
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCreateCompanies**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateCompanies) | **POST** /block_iomad_company_admin_create_companies | Create new Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminCreateLicenses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminCreateLicenses) | **POST** /block_iomad_company_admin_create_licenses | Create company licenses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminDeleteLicenses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminDeleteLicenses) | **POST** /block_iomad_company_admin_delete_licenses | Delete company licenses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEditCompanies**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditCompanies) | **POST** /block_iomad_company_admin_edit_companies | Edit Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEditLicenses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEditLicenses) | **POST** /block_iomad_company_admin_edit_licenses | Edit company license settings
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminEnrolUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminEnrolUsers) | **POST** /block_iomad_company_admin_enrol_users | Assign users onto courses
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCompanies**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanies) | **POST** /block_iomad_company_admin_get_companies | Get all Iomad companies
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCompanyCourses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCompanyCourses) | **POST** /block_iomad_company_admin_get_company_courses | Get Iomad company course allocations
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetCourseInfo**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetCourseInfo) | **POST** /block_iomad_company_admin_get_course_info | Get Iomad course settings
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetDepartmentUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartmentUsers) | **POST** /block_iomad_company_admin_get_department_users | Get users within a department
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetDepartments**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetDepartments) | **POST** /block_iomad_company_admin_get_departments | Get all company departments
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetLicenseFromId**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseFromId) | **POST** /block_iomad_company_admin_get_license_from_id | Get licence data give the ID
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminGetLicenseInfo**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminGetLicenseInfo) | **POST** /block_iomad_company_admin_get_license_info | Get company license information
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminMoveUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminMoveUsers) | **POST** /block_iomad_company_admin_move_users | Move users between departments
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminRestrictCapability**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminRestrictCapability) | **POST** /block_iomad_company_admin_restrict_capability | set/reset Iomad capability
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminSyncUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminSyncUsers) | **POST** /block_iomad_company_admin_sync_users | Call update users to sync to external system
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnallocateLicenses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnallocateLicenses) | **POST** /block_iomad_company_admin_unallocate_licenses | Remove course licenses from users
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnassignCourses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignCourses) | **POST** /block_iomad_company_admin_unassign_courses | Unassign a course from a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUnassignUsers**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUnassignUsers) | **POST** /block_iomad_company_admin_unassign_users | Unassign users from a company
*BlockIomadCompanyAdminApi* | [**blockIomadCompanyAdminUpdateCourses**](docs/BlockIomadCompanyAdminApi.md#blockIomadCompanyAdminUpdateCourses) | **POST** /block_iomad_company_admin_update_courses | Update Iomad course settings
*BlockRecentlyaccesseditemsApi* | [**blockRecentlyaccesseditemsGetRecentItems**](docs/BlockRecentlyaccesseditemsApi.md#blockRecentlyaccesseditemsGetRecentItems) | **POST** /block_recentlyaccesseditems_get_recent_items | List of items a user has accessed most recently.
*BlockStarredcoursesApi* | [**blockStarredcoursesGetStarredCourses**](docs/BlockStarredcoursesApi.md#blockStarredcoursesGetStarredCourses) | **POST** /block_starredcourses_get_starred_courses | Get users starred courses.
*EnrolGuestApi* | [**enrolGuestGetInstanceInfo**](docs/EnrolGuestApi.md#enrolGuestGetInstanceInfo) | **POST** /enrol_guest_get_instance_info | Return guest enrolment instance information.
*EnrolGuestApi* | [**enrolGuestValidatePassword**](docs/EnrolGuestApi.md#enrolGuestValidatePassword) | **POST** /enrol_guest_validate_password | Perform password validation.
*EnrolLicenseApi* | [**enrolLicenseEnrolUser**](docs/EnrolLicenseApi.md#enrolLicenseEnrolUser) | **POST** /enrol_license_enrol_user | License enrol the current user in the given course.
*EnrolLicenseApi* | [**enrolLicenseGetInstanceInfo**](docs/EnrolLicenseApi.md#enrolLicenseGetInstanceInfo) | **POST** /enrol_license_get_instance_info | License enrolment instance information.
*EnrolManualApi* | [**enrolManualEnrolUsers**](docs/EnrolManualApi.md#enrolManualEnrolUsers) | **POST** /enrol_manual_enrol_users | Manual enrol users
*EnrolManualApi* | [**enrolManualUnenrolUsers**](docs/EnrolManualApi.md#enrolManualUnenrolUsers) | **POST** /enrol_manual_unenrol_users | Manual unenrol users
*EnrolMetaApi* | [**enrolMetaAddInstances**](docs/EnrolMetaApi.md#enrolMetaAddInstances) | **POST** /enrol_meta_add_instances | Add meta enrolment instances
*EnrolMetaApi* | [**enrolMetaDeleteInstances**](docs/EnrolMetaApi.md#enrolMetaDeleteInstances) | **POST** /enrol_meta_delete_instances | Delete meta enrolment instances
*EnrolSelfApi* | [**enrolSelfEnrolUser**](docs/EnrolSelfApi.md#enrolSelfEnrolUser) | **POST** /enrol_self_enrol_user | Self enrol the current user in the given course.
*EnrolSelfApi* | [**enrolSelfGetInstanceInfo**](docs/EnrolSelfApi.md#enrolSelfGetInstanceInfo) | **POST** /enrol_self_get_instance_info | self enrolment instance information.
*GradereportGraderApi* | [**gradereportGraderGetUsersInReport**](docs/GradereportGraderApi.md#gradereportGraderGetUsersInReport) | **POST** /gradereport_grader_get_users_in_report | Returns the dataset of users within the report
*GradereportOverviewApi* | [**gradereportOverviewGetCourseGrades**](docs/GradereportOverviewApi.md#gradereportOverviewGetCourseGrades) | **POST** /gradereport_overview_get_course_grades | Get the given user courses final grades
*GradereportOverviewApi* | [**gradereportOverviewViewGradeReport**](docs/GradereportOverviewApi.md#gradereportOverviewViewGradeReport) | **POST** /gradereport_overview_view_grade_report | Trigger the report view event
*GradereportSingleviewApi* | [**gradereportSingleviewGetGradeItemsForSearchWidget**](docs/GradereportSingleviewApi.md#gradereportSingleviewGetGradeItemsForSearchWidget) | **POST** /gradereport_singleview_get_grade_items_for_search_widget | Get the gradeitem/(s) for a course
*GradereportUserApi* | [**gradereportUserGetAccessInformation**](docs/GradereportUserApi.md#gradereportUserGetAccessInformation) | **POST** /gradereport_user_get_access_information | Returns user access information for the user grade report.
*GradereportUserApi* | [**gradereportUserGetGradeItems**](docs/GradereportUserApi.md#gradereportUserGetGradeItems) | **POST** /gradereport_user_get_grade_items | Returns the complete list of grade items for users in a course
*GradereportUserApi* | [**gradereportUserGetGradesTable**](docs/GradereportUserApi.md#gradereportUserGetGradesTable) | **POST** /gradereport_user_get_grades_table | Get the user/s report grades table for a course
*GradereportUserApi* | [**gradereportUserViewGradeReport**](docs/GradereportUserApi.md#gradereportUserViewGradeReport) | **POST** /gradereport_user_view_grade_report | Trigger the report view event
*GradingformGuideApi* | [**gradingformGuideGraderGradingpanelFetch**](docs/GradingformGuideApi.md#gradingformGuideGraderGradingpanelFetch) | **POST** /gradingform_guide_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
*GradingformGuideApi* | [**gradingformGuideGraderGradingpanelStore**](docs/GradingformGuideApi.md#gradingformGuideGraderGradingpanelStore) | **POST** /gradingform_guide_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.
*GradingformRubricApi* | [**gradingformRubricGraderGradingpanelFetch**](docs/GradingformRubricApi.md#gradingformRubricGraderGradingpanelFetch) | **POST** /gradingform_rubric_grader_gradingpanel_fetch | Fetch the data required to display the grader grading panel, creating the grade item if required
*GradingformRubricApi* | [**gradingformRubricGraderGradingpanelStore**](docs/GradingformRubricApi.md#gradingformRubricGraderGradingpanelStore) | **POST** /gradingform_rubric_grader_gradingpanel_store | Store the grading data for a user from the grader grading panel.
*LocalIomadLearningpathApi* | [**localIomadLearningpathActivate**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathActivate) | **POST** /local_iomad_learningpath_activate | Activates / deactivates learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathAddcourses**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathAddcourses) | **POST** /local_iomad_learningpath_addcourses | Add courses to learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathAddusers**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathAddusers) | **POST** /local_iomad_learningpath_addusers | Add users to learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathCopypath**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathCopypath) | **POST** /local_iomad_learningpath_copypath | Copy a learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathDeletepath**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathDeletepath) | **POST** /local_iomad_learningpath_deletepath | Completely delete a learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetcourses**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathGetcourses) | **POST** /local_iomad_learningpath_getcourses | Read list of courses for given learning
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetprospectivecourses**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectivecourses) | **POST** /local_iomad_learningpath_getprospectivecourses | Read set of filtered courses for given company
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetprospectiveusers**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathGetprospectiveusers) | **POST** /local_iomad_learningpath_getprospectiveusers | Get set of filtered users for given company
*LocalIomadLearningpathApi* | [**localIomadLearningpathGetusers**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathGetusers) | **POST** /local_iomad_learningpath_getusers | Get users assigned to path
*LocalIomadLearningpathApi* | [**localIomadLearningpathOrdercourses**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathOrdercourses) | **POST** /local_iomad_learningpath_ordercourses | Set sequence of courses in learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathRemovecourses**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathRemovecourses) | **POST** /local_iomad_learningpath_removecourses | Remove courses from learning path
*LocalIomadLearningpathApi* | [**localIomadLearningpathRemoveusers**](docs/LocalIomadLearningpathApi.md#localIomadLearningpathRemoveusers) | **POST** /local_iomad_learningpath_removeusers | Remove users from learning path
*MediaVideojsApi* | [**mediaVideojsGetLanguage**](docs/MediaVideojsApi.md#mediaVideojsGetLanguage) | **POST** /media_videojs_get_language | get language.
*MessageAirnotifierApi* | [**messageAirnotifierAreNotificationPreferencesConfigured**](docs/MessageAirnotifierApi.md#messageAirnotifierAreNotificationPreferencesConfigured) | **POST** /message_airnotifier_are_notification_preferences_configured | Check if the users have notification preferences configured yet
*MessageAirnotifierApi* | [**messageAirnotifierEnableDevice**](docs/MessageAirnotifierApi.md#messageAirnotifierEnableDevice) | **POST** /message_airnotifier_enable_device | Enables or disables a registered user device so it can receive Push notifications
*MessageAirnotifierApi* | [**messageAirnotifierGetUserDevices**](docs/MessageAirnotifierApi.md#messageAirnotifierGetUserDevices) | **POST** /message_airnotifier_get_user_devices | Return the list of mobile devices that are registered in Moodle for the given user
*MessageAirnotifierApi* | [**messageAirnotifierIsSystemConfigured**](docs/MessageAirnotifierApi.md#messageAirnotifierIsSystemConfigured) | **POST** /message_airnotifier_is_system_configured | Check whether the airnotifier settings have been configured
*MessagePopupApi* | [**messagePopupGetPopupNotifications**](docs/MessagePopupApi.md#messagePopupGetPopupNotifications) | **POST** /message_popup_get_popup_notifications | Retrieve a list of popup notifications for a user
*MessagePopupApi* | [**messagePopupGetUnreadPopupNotificationCount**](docs/MessagePopupApi.md#messagePopupGetUnreadPopupNotificationCount) | **POST** /message_popup_get_unread_popup_notification_count | Retrieve the count of unread popup notifications for a given user
*ModAssignApi* | [**modAssignCopyPreviousAttempt**](docs/ModAssignApi.md#modAssignCopyPreviousAttempt) | **POST** /mod_assign_copy_previous_attempt | Copy a students previous attempt to a new attempt.
*ModAssignApi* | [**modAssignGetAssignments**](docs/ModAssignApi.md#modAssignGetAssignments) | **POST** /mod_assign_get_assignments | Returns the courses and assignments for the users capability
*ModAssignApi* | [**modAssignGetGrades**](docs/ModAssignApi.md#modAssignGetGrades) | **POST** /mod_assign_get_grades | Returns grades from the assignment
*ModAssignApi* | [**modAssignGetParticipant**](docs/ModAssignApi.md#modAssignGetParticipant) | **POST** /mod_assign_get_participant | Get a participant for an assignment, with some summary info about their submissions.
*ModAssignApi* | [**modAssignGetSubmissionStatus**](docs/ModAssignApi.md#modAssignGetSubmissionStatus) | **POST** /mod_assign_get_submission_status | Returns information about an assignment submission status for a given user.
*ModAssignApi* | [**modAssignGetSubmissions**](docs/ModAssignApi.md#modAssignGetSubmissions) | **POST** /mod_assign_get_submissions | Returns the submissions for assignments
*ModAssignApi* | [**modAssignGetUserFlags**](docs/ModAssignApi.md#modAssignGetUserFlags) | **POST** /mod_assign_get_user_flags | Returns the user flags for assignments
*ModAssignApi* | [**modAssignGetUserMappings**](docs/ModAssignApi.md#modAssignGetUserMappings) | **POST** /mod_assign_get_user_mappings | Returns the blind marking mappings for assignments
*ModAssignApi* | [**modAssignListParticipants**](docs/ModAssignApi.md#modAssignListParticipants) | **POST** /mod_assign_list_participants | List the participants for a single assignment, with some summary info about their submissions.
*ModAssignApi* | [**modAssignLockSubmissions**](docs/ModAssignApi.md#modAssignLockSubmissions) | **POST** /mod_assign_lock_submissions | Prevent students from making changes to a list of submissions
*ModAssignApi* | [**modAssignRevealIdentities**](docs/ModAssignApi.md#modAssignRevealIdentities) | **POST** /mod_assign_reveal_identities | Reveal the identities for a blind marking assignment
*ModAssignApi* | [**modAssignRevertSubmissionsToDraft**](docs/ModAssignApi.md#modAssignRevertSubmissionsToDraft) | **POST** /mod_assign_revert_submissions_to_draft | Reverts the list of submissions to draft status
*ModAssignApi* | [**modAssignSaveGrade**](docs/ModAssignApi.md#modAssignSaveGrade) | **POST** /mod_assign_save_grade | Save a grade update for a single student.
*ModAssignApi* | [**modAssignSaveGrades**](docs/ModAssignApi.md#modAssignSaveGrades) | **POST** /mod_assign_save_grades | Save multiple grade updates for an assignment.
*ModAssignApi* | [**modAssignSaveSubmission**](docs/ModAssignApi.md#modAssignSaveSubmission) | **POST** /mod_assign_save_submission | Update the current students submission
*ModAssignApi* | [**modAssignSaveUserExtensions**](docs/ModAssignApi.md#modAssignSaveUserExtensions) | **POST** /mod_assign_save_user_extensions | Save a list of assignment extensions
*ModAssignApi* | [**modAssignSetUserFlags**](docs/ModAssignApi.md#modAssignSetUserFlags) | **POST** /mod_assign_set_user_flags | Creates or updates user flags
*ModAssignApi* | [**modAssignStartSubmission**](docs/ModAssignApi.md#modAssignStartSubmission) | **POST** /mod_assign_start_submission | Start a submission for user if assignment has a time limit.
*ModAssignApi* | [**modAssignSubmitForGrading**](docs/ModAssignApi.md#modAssignSubmitForGrading) | **POST** /mod_assign_submit_for_grading | Submit the current students assignment for grading
*ModAssignApi* | [**modAssignSubmitGradingForm**](docs/ModAssignApi.md#modAssignSubmitGradingForm) | **POST** /mod_assign_submit_grading_form | Submit the grading form data via ajax
*ModAssignApi* | [**modAssignUnlockSubmissions**](docs/ModAssignApi.md#modAssignUnlockSubmissions) | **POST** /mod_assign_unlock_submissions | Allow students to make changes to a list of submissions
*ModAssignApi* | [**modAssignViewAssign**](docs/ModAssignApi.md#modAssignViewAssign) | **POST** /mod_assign_view_assign | Update the module completion status.
*ModAssignApi* | [**modAssignViewGradingTable**](docs/ModAssignApi.md#modAssignViewGradingTable) | **POST** /mod_assign_view_grading_table | Trigger the grading_table_viewed event.
*ModAssignApi* | [**modAssignViewSubmissionStatus**](docs/ModAssignApi.md#modAssignViewSubmissionStatus) | **POST** /mod_assign_view_submission_status | Trigger the submission status viewed event.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnCanJoin**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnCanJoin) | **POST** /mod_bigbluebuttonbn_can_join | Returns information if the current user can join or not.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnCompletionValidate**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnCompletionValidate) | **POST** /mod_bigbluebuttonbn_completion_validate | Validate completion
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnEndMeeting**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnEndMeeting) | **POST** /mod_bigbluebuttonbn_end_meeting | End a meeting
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetBigbluebuttonbnsByCourses**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetBigbluebuttonbnsByCourses) | **POST** /mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses | Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetJoinUrl**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetJoinUrl) | **POST** /mod_bigbluebuttonbn_get_join_url | Get the join URL for the meeting and create if it does not exist.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetRecordings**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordings) | **POST** /mod_bigbluebuttonbn_get_recordings | Returns a list of recordings ready to be processed by a datatable.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnGetRecordingsToImport**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnGetRecordingsToImport) | **POST** /mod_bigbluebuttonbn_get_recordings_to_import | Returns a list of recordings ready to import to be processed by a datatable.
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnMeetingInfo**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnMeetingInfo) | **POST** /mod_bigbluebuttonbn_meeting_info | Get displayable information on the meeting
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnUpdateRecording**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnUpdateRecording) | **POST** /mod_bigbluebuttonbn_update_recording | Update a single recording
*ModBigbluebuttonbnApi* | [**modBigbluebuttonbnViewBigbluebuttonbn**](docs/ModBigbluebuttonbnApi.md#modBigbluebuttonbnViewBigbluebuttonbn) | **POST** /mod_bigbluebuttonbn_view_bigbluebuttonbn | Trigger the course module viewed event and update the module completion status.
*ModBookApi* | [**modBookGetBooksByCourses**](docs/ModBookApi.md#modBookGetBooksByCourses) | **POST** /mod_book_get_books_by_courses | Returns a list of book instances in a provided set of courses,                             if no courses are provided then all the book instances the user has access to will be returned.
*ModBookApi* | [**modBookViewBook**](docs/ModBookApi.md#modBookViewBook) | **POST** /mod_book_view_book | Simulate the view.php web interface book: trigger events, completion, etc...
*ModChatApi* | [**modChatGetChatLatestMessages**](docs/ModChatApi.md#modChatGetChatLatestMessages) | **POST** /mod_chat_get_chat_latest_messages | Get the latest messages from the given chat session.
*ModChatApi* | [**modChatGetChatUsers**](docs/ModChatApi.md#modChatGetChatUsers) | **POST** /mod_chat_get_chat_users | Get the list of users in the given chat session.
*ModChatApi* | [**modChatGetChatsByCourses**](docs/ModChatApi.md#modChatGetChatsByCourses) | **POST** /mod_chat_get_chats_by_courses | Returns a list of chat instances in a provided set of courses,                             if no courses are provided then all the chat instances the user has access to will be returned.
*ModChatApi* | [**modChatGetSessionMessages**](docs/ModChatApi.md#modChatGetSessionMessages) | **POST** /mod_chat_get_session_messages | Retrieves messages of the given chat session.
*ModChatApi* | [**modChatGetSessions**](docs/ModChatApi.md#modChatGetSessions) | **POST** /mod_chat_get_sessions | Retrieves chat sessions for a given chat.
*ModChatApi* | [**modChatLoginUser**](docs/ModChatApi.md#modChatLoginUser) | **POST** /mod_chat_login_user | Log a user into a chat room in the given chat.
*ModChatApi* | [**modChatSendChatMessage**](docs/ModChatApi.md#modChatSendChatMessage) | **POST** /mod_chat_send_chat_message | Send a message on the given chat session.
*ModChatApi* | [**modChatViewChat**](docs/ModChatApi.md#modChatViewChat) | **POST** /mod_chat_view_chat | Trigger the course module viewed event and update the module completion status.
*ModChatApi* | [**modChatViewSessions**](docs/ModChatApi.md#modChatViewSessions) | **POST** /mod_chat_view_sessions | Trigger the chat session viewed event.
*ModChoiceApi* | [**modChoiceDeleteChoiceResponses**](docs/ModChoiceApi.md#modChoiceDeleteChoiceResponses) | **POST** /mod_choice_delete_choice_responses | Delete the given submitted responses in a choice
*ModChoiceApi* | [**modChoiceGetChoiceOptions**](docs/ModChoiceApi.md#modChoiceGetChoiceOptions) | **POST** /mod_choice_get_choice_options | Retrieve options for a specific choice.
*ModChoiceApi* | [**modChoiceGetChoiceResults**](docs/ModChoiceApi.md#modChoiceGetChoiceResults) | **POST** /mod_choice_get_choice_results | Retrieve users results for a given choice.
*ModChoiceApi* | [**modChoiceGetChoicesByCourses**](docs/ModChoiceApi.md#modChoiceGetChoicesByCourses) | **POST** /mod_choice_get_choices_by_courses | Returns a list of choice instances in a provided set of courses,                             if no courses are provided then all the choice instances the user has access to will be returned.
*ModChoiceApi* | [**modChoiceSubmitChoiceResponse**](docs/ModChoiceApi.md#modChoiceSubmitChoiceResponse) | **POST** /mod_choice_submit_choice_response | Submit responses to a specific choice item.
*ModChoiceApi* | [**modChoiceViewChoice**](docs/ModChoiceApi.md#modChoiceViewChoice) | **POST** /mod_choice_view_choice | Trigger the course module viewed event and update the module completion status.
*ModDataApi* | [**modDataAddEntry**](docs/ModDataApi.md#modDataAddEntry) | **POST** /mod_data_add_entry | Adds a new entry.
*ModDataApi* | [**modDataApproveEntry**](docs/ModDataApi.md#modDataApproveEntry) | **POST** /mod_data_approve_entry | Approves or unapproves an entry.
*ModDataApi* | [**modDataDeleteEntry**](docs/ModDataApi.md#modDataDeleteEntry) | **POST** /mod_data_delete_entry | Deletes an entry.
*ModDataApi* | [**modDataDeleteSavedPreset**](docs/ModDataApi.md#modDataDeleteSavedPreset) | **POST** /mod_data_delete_saved_preset | Delete site user preset.
*ModDataApi* | [**modDataGetDataAccessInformation**](docs/ModDataApi.md#modDataGetDataAccessInformation) | **POST** /mod_data_get_data_access_information | Return access information for a given database.
*ModDataApi* | [**modDataGetDatabasesByCourses**](docs/ModDataApi.md#modDataGetDatabasesByCourses) | **POST** /mod_data_get_databases_by_courses | Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
*ModDataApi* | [**modDataGetEntries**](docs/ModDataApi.md#modDataGetEntries) | **POST** /mod_data_get_entries | Return the complete list of entries of the given database.
*ModDataApi* | [**modDataGetEntry**](docs/ModDataApi.md#modDataGetEntry) | **POST** /mod_data_get_entry | Return one entry record from the database, including contents optionally.
*ModDataApi* | [**modDataGetFields**](docs/ModDataApi.md#modDataGetFields) | **POST** /mod_data_get_fields | Return the list of configured fields for the given database.
*ModDataApi* | [**modDataGetMappingInformation**](docs/ModDataApi.md#modDataGetMappingInformation) | **POST** /mod_data_get_mapping_information | Get importing information
*ModDataApi* | [**modDataSearchEntries**](docs/ModDataApi.md#modDataSearchEntries) | **POST** /mod_data_search_entries | Search for entries in the given database.
*ModDataApi* | [**modDataUpdateEntry**](docs/ModDataApi.md#modDataUpdateEntry) | **POST** /mod_data_update_entry | Updates an existing entry.
*ModDataApi* | [**modDataViewDatabase**](docs/ModDataApi.md#modDataViewDatabase) | **POST** /mod_data_view_database | Simulate the view.php web interface data: trigger events, completion, etc...
*ModFeedbackApi* | [**modFeedbackGetAnalysis**](docs/ModFeedbackApi.md#modFeedbackGetAnalysis) | **POST** /mod_feedback_get_analysis | Retrieves the feedback analysis.
*ModFeedbackApi* | [**modFeedbackGetCurrentCompletedTmp**](docs/ModFeedbackApi.md#modFeedbackGetCurrentCompletedTmp) | **POST** /mod_feedback_get_current_completed_tmp | Returns the temporary completion record for the current user.
*ModFeedbackApi* | [**modFeedbackGetFeedbackAccessInformation**](docs/ModFeedbackApi.md#modFeedbackGetFeedbackAccessInformation) | **POST** /mod_feedback_get_feedback_access_information | Return access information for a given feedback.
*ModFeedbackApi* | [**modFeedbackGetFeedbacksByCourses**](docs/ModFeedbackApi.md#modFeedbackGetFeedbacksByCourses) | **POST** /mod_feedback_get_feedbacks_by_courses | Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
*ModFeedbackApi* | [**modFeedbackGetFinishedResponses**](docs/ModFeedbackApi.md#modFeedbackGetFinishedResponses) | **POST** /mod_feedback_get_finished_responses | Retrieves responses from the last finished attempt.
*ModFeedbackApi* | [**modFeedbackGetItems**](docs/ModFeedbackApi.md#modFeedbackGetItems) | **POST** /mod_feedback_get_items | Returns the items (questions) in the given feedback.
*ModFeedbackApi* | [**modFeedbackGetLastCompleted**](docs/ModFeedbackApi.md#modFeedbackGetLastCompleted) | **POST** /mod_feedback_get_last_completed | Retrieves the last completion record for the current user.
*ModFeedbackApi* | [**modFeedbackGetNonRespondents**](docs/ModFeedbackApi.md#modFeedbackGetNonRespondents) | **POST** /mod_feedback_get_non_respondents | Retrieves a list of students who didn&#39;t submit the feedback.
*ModFeedbackApi* | [**modFeedbackGetPageItems**](docs/ModFeedbackApi.md#modFeedbackGetPageItems) | **POST** /mod_feedback_get_page_items | Get a single feedback page items.
*ModFeedbackApi* | [**modFeedbackGetResponsesAnalysis**](docs/ModFeedbackApi.md#modFeedbackGetResponsesAnalysis) | **POST** /mod_feedback_get_responses_analysis | Return the feedback user responses analysis.
*ModFeedbackApi* | [**modFeedbackGetUnfinishedResponses**](docs/ModFeedbackApi.md#modFeedbackGetUnfinishedResponses) | **POST** /mod_feedback_get_unfinished_responses | Retrieves responses from the current unfinished attempt.
*ModFeedbackApi* | [**modFeedbackLaunchFeedback**](docs/ModFeedbackApi.md#modFeedbackLaunchFeedback) | **POST** /mod_feedback_launch_feedback | Starts or continues a feedback submission.
*ModFeedbackApi* | [**modFeedbackProcessPage**](docs/ModFeedbackApi.md#modFeedbackProcessPage) | **POST** /mod_feedback_process_page | Process a jump between pages.
*ModFeedbackApi* | [**modFeedbackViewFeedback**](docs/ModFeedbackApi.md#modFeedbackViewFeedback) | **POST** /mod_feedback_view_feedback | Trigger the course module viewed event and update the module completion status.
*ModFolderApi* | [**modFolderGetFoldersByCourses**](docs/ModFolderApi.md#modFolderGetFoldersByCourses) | **POST** /mod_folder_get_folders_by_courses | Returns a list of folders in a provided list of courses, if no list is provided all folders that                             the user can view will be returned. Please note that this WS is not returning the folder contents.
*ModFolderApi* | [**modFolderViewFolder**](docs/ModFolderApi.md#modFolderViewFolder) | **POST** /mod_folder_view_folder | Simulate the view.php web interface folder: trigger events, completion, etc...
*ModForumApi* | [**modForumAddDiscussion**](docs/ModForumApi.md#modForumAddDiscussion) | **POST** /mod_forum_add_discussion | Add a new discussion into an existing forum.
*ModForumApi* | [**modForumAddDiscussionPost**](docs/ModForumApi.md#modForumAddDiscussionPost) | **POST** /mod_forum_add_discussion_post | Create new posts into an existing discussion.
*ModForumApi* | [**modForumCanAddDiscussion**](docs/ModForumApi.md#modForumCanAddDiscussion) | **POST** /mod_forum_can_add_discussion | Check if the current user can add discussions in the given forum (and optionally for the given group).
*ModForumApi* | [**modForumDeletePost**](docs/ModForumApi.md#modForumDeletePost) | **POST** /mod_forum_delete_post | Deletes a post or a discussion completely when the post is the discussion topic.
*ModForumApi* | [**modForumGetDiscussionPost**](docs/ModForumApi.md#modForumGetDiscussionPost) | **POST** /mod_forum_get_discussion_post | Get a particular discussion post.
*ModForumApi* | [**modForumGetDiscussionPosts**](docs/ModForumApi.md#modForumGetDiscussionPosts) | **POST** /mod_forum_get_discussion_posts | Returns a list of forum posts for a discussion.
*ModForumApi* | [**modForumGetDiscussionPostsByUserid**](docs/ModForumApi.md#modForumGetDiscussionPostsByUserid) | **POST** /mod_forum_get_discussion_posts_by_userid | Returns a list of forum posts for a discussion for a user.
*ModForumApi* | [**modForumGetForumAccessInformation**](docs/ModForumApi.md#modForumGetForumAccessInformation) | **POST** /mod_forum_get_forum_access_information | Return capabilities information for a given forum.
*ModForumApi* | [**modForumGetForumDiscussions**](docs/ModForumApi.md#modForumGetForumDiscussions) | **POST** /mod_forum_get_forum_discussions | Returns a list of forum discussions optionally sorted and paginated.
*ModForumApi* | [**modForumGetForumDiscussionsPaginated**](docs/ModForumApi.md#modForumGetForumDiscussionsPaginated) | **POST** /mod_forum_get_forum_discussions_paginated | ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
*ModForumApi* | [**modForumGetForumsByCourses**](docs/ModForumApi.md#modForumGetForumsByCourses) | **POST** /mod_forum_get_forums_by_courses | Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
*ModForumApi* | [**modForumPrepareDraftAreaForPost**](docs/ModForumApi.md#modForumPrepareDraftAreaForPost) | **POST** /mod_forum_prepare_draft_area_for_post | Prepares a draft area for editing a post.
*ModForumApi* | [**modForumSetLockState**](docs/ModForumApi.md#modForumSetLockState) | **POST** /mod_forum_set_lock_state | Set the lock state for the discussion
*ModForumApi* | [**modForumSetPinState**](docs/ModForumApi.md#modForumSetPinState) | **POST** /mod_forum_set_pin_state | Set the pin state
*ModForumApi* | [**modForumSetSubscriptionState**](docs/ModForumApi.md#modForumSetSubscriptionState) | **POST** /mod_forum_set_subscription_state | Set the subscription state
*ModForumApi* | [**modForumToggleFavouriteState**](docs/ModForumApi.md#modForumToggleFavouriteState) | **POST** /mod_forum_toggle_favourite_state | Toggle the favourite state
*ModForumApi* | [**modForumUpdateDiscussionPost**](docs/ModForumApi.md#modForumUpdateDiscussionPost) | **POST** /mod_forum_update_discussion_post | Updates a post or a discussion topic post.
*ModForumApi* | [**modForumViewForum**](docs/ModForumApi.md#modForumViewForum) | **POST** /mod_forum_view_forum | Trigger the course module viewed event and update the module completion status.
*ModForumApi* | [**modForumViewForumDiscussion**](docs/ModForumApi.md#modForumViewForumDiscussion) | **POST** /mod_forum_view_forum_discussion | Trigger the forum discussion viewed event.
*ModGlossaryApi* | [**modGlossaryAddEntry**](docs/ModGlossaryApi.md#modGlossaryAddEntry) | **POST** /mod_glossary_add_entry | Add a new entry to a given glossary
*ModGlossaryApi* | [**modGlossaryDeleteEntry**](docs/ModGlossaryApi.md#modGlossaryDeleteEntry) | **POST** /mod_glossary_delete_entry | Delete the given entry from the glossary.
*ModGlossaryApi* | [**modGlossaryGetAuthors**](docs/ModGlossaryApi.md#modGlossaryGetAuthors) | **POST** /mod_glossary_get_authors | Get the authors.
*ModGlossaryApi* | [**modGlossaryGetCategories**](docs/ModGlossaryApi.md#modGlossaryGetCategories) | **POST** /mod_glossary_get_categories | Get the categories.
*ModGlossaryApi* | [**modGlossaryGetEntriesByAuthor**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByAuthor) | **POST** /mod_glossary_get_entries_by_author | Browse entries by author.
*ModGlossaryApi* | [**modGlossaryGetEntriesByAuthorId**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByAuthorId) | **POST** /mod_glossary_get_entries_by_author_id | Browse entries by author ID.
*ModGlossaryApi* | [**modGlossaryGetEntriesByCategory**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByCategory) | **POST** /mod_glossary_get_entries_by_category | Browse entries by category.
*ModGlossaryApi* | [**modGlossaryGetEntriesByDate**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByDate) | **POST** /mod_glossary_get_entries_by_date | Browse entries by date.
*ModGlossaryApi* | [**modGlossaryGetEntriesByLetter**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByLetter) | **POST** /mod_glossary_get_entries_by_letter | Browse entries by letter.
*ModGlossaryApi* | [**modGlossaryGetEntriesBySearch**](docs/ModGlossaryApi.md#modGlossaryGetEntriesBySearch) | **POST** /mod_glossary_get_entries_by_search | Browse entries by search query.
*ModGlossaryApi* | [**modGlossaryGetEntriesByTerm**](docs/ModGlossaryApi.md#modGlossaryGetEntriesByTerm) | **POST** /mod_glossary_get_entries_by_term | Browse entries by term (concept or alias).
*ModGlossaryApi* | [**modGlossaryGetEntriesToApprove**](docs/ModGlossaryApi.md#modGlossaryGetEntriesToApprove) | **POST** /mod_glossary_get_entries_to_approve | Browse entries to be approved.
*ModGlossaryApi* | [**modGlossaryGetEntryById**](docs/ModGlossaryApi.md#modGlossaryGetEntryById) | **POST** /mod_glossary_get_entry_by_id | Get an entry by ID
*ModGlossaryApi* | [**modGlossaryGetGlossariesByCourses**](docs/ModGlossaryApi.md#modGlossaryGetGlossariesByCourses) | **POST** /mod_glossary_get_glossaries_by_courses | Retrieve a list of glossaries from several courses.
*ModGlossaryApi* | [**modGlossaryPrepareEntryForEdition**](docs/ModGlossaryApi.md#modGlossaryPrepareEntryForEdition) | **POST** /mod_glossary_prepare_entry_for_edition | Prepares the given entry for edition returning draft item areas and file areas information.
*ModGlossaryApi* | [**modGlossaryUpdateEntry**](docs/ModGlossaryApi.md#modGlossaryUpdateEntry) | **POST** /mod_glossary_update_entry | Updates the given glossary entry.
*ModGlossaryApi* | [**modGlossaryViewEntry**](docs/ModGlossaryApi.md#modGlossaryViewEntry) | **POST** /mod_glossary_view_entry | Notify a glossary entry as being viewed.
*ModGlossaryApi* | [**modGlossaryViewGlossary**](docs/ModGlossaryApi.md#modGlossaryViewGlossary) | **POST** /mod_glossary_view_glossary | Notify the glossary as being viewed.
*ModH5pactivityApi* | [**modH5pactivityGetAttempts**](docs/ModH5pactivityApi.md#modH5pactivityGetAttempts) | **POST** /mod_h5pactivity_get_attempts | Return the information needed to list a user attempts.
*ModH5pactivityApi* | [**modH5pactivityGetH5pactivitiesByCourses**](docs/ModH5pactivityApi.md#modH5pactivityGetH5pactivitiesByCourses) | **POST** /mod_h5pactivity_get_h5pactivities_by_courses | Returns a list of h5p activities in a list of             provided courses, if no list is provided all h5p activities             that the user can view will be returned.
*ModH5pactivityApi* | [**modH5pactivityGetH5pactivityAccessInformation**](docs/ModH5pactivityApi.md#modH5pactivityGetH5pactivityAccessInformation) | **POST** /mod_h5pactivity_get_h5pactivity_access_information | Return access information for a given h5p activity.
*ModH5pactivityApi* | [**modH5pactivityGetResults**](docs/ModH5pactivityApi.md#modH5pactivityGetResults) | **POST** /mod_h5pactivity_get_results | Return the information needed to list a user attempt results.
*ModH5pactivityApi* | [**modH5pactivityGetUserAttempts**](docs/ModH5pactivityApi.md#modH5pactivityGetUserAttempts) | **POST** /mod_h5pactivity_get_user_attempts | Return the information needed to list all enrolled user attempts.
*ModH5pactivityApi* | [**modH5pactivityLogReportViewed**](docs/ModH5pactivityApi.md#modH5pactivityLogReportViewed) | **POST** /mod_h5pactivity_log_report_viewed | Log that the h5pactivity was viewed.
*ModH5pactivityApi* | [**modH5pactivityViewH5pactivity**](docs/ModH5pactivityApi.md#modH5pactivityViewH5pactivity) | **POST** /mod_h5pactivity_view_h5pactivity | Trigger the course module viewed event and update the module completion status.
*ModImscpApi* | [**modImscpGetImscpsByCourses**](docs/ModImscpApi.md#modImscpGetImscpsByCourses) | **POST** /mod_imscp_get_imscps_by_courses | Returns a list of IMSCP instances in a provided set of courses,                             if no courses are provided then all the IMSCP instances the user has access to will be returned.
*ModImscpApi* | [**modImscpViewImscp**](docs/ModImscpApi.md#modImscpViewImscp) | **POST** /mod_imscp_view_imscp | Simulate the view.php web interface imscp: trigger events, completion, etc...
*ModIomadcertificateApi* | [**modIomadcertificateGetIomadcertificatesByCourses**](docs/ModIomadcertificateApi.md#modIomadcertificateGetIomadcertificatesByCourses) | **POST** /mod_iomadcertificate_get_iomadcertificates_by_courses | Returns a list of iomadcertificate instances in a provided set of courses, if                             no courses are provided then all the iomadcertificate instances the user has access to will be returned.
*ModIomadcertificateApi* | [**modIomadcertificateGetIssuedIomadcertificates**](docs/ModIomadcertificateApi.md#modIomadcertificateGetIssuedIomadcertificates) | **POST** /mod_iomadcertificate_get_issued_iomadcertificates | Get the list of issued iomadcertificates for the current user.
*ModIomadcertificateApi* | [**modIomadcertificateIssueIomadcertificate**](docs/ModIomadcertificateApi.md#modIomadcertificateIssueIomadcertificate) | **POST** /mod_iomadcertificate_issue_iomadcertificate | Create new iomadcertificate record, or return existing record for the current user.
*ModIomadcertificateApi* | [**modIomadcertificateViewIomadcertificate**](docs/ModIomadcertificateApi.md#modIomadcertificateViewIomadcertificate) | **POST** /mod_iomadcertificate_view_iomadcertificate | Trigger the course module viewed event and update the module completion status.
*ModLabelApi* | [**modLabelGetLabelsByCourses**](docs/ModLabelApi.md#modLabelGetLabelsByCourses) | **POST** /mod_label_get_labels_by_courses | Returns a list of labels in a provided list of courses, if no list is provided all labels that the user                             can view will be returned.
*ModLessonApi* | [**modLessonFinishAttempt**](docs/ModLessonApi.md#modLessonFinishAttempt) | **POST** /mod_lesson_finish_attempt | Finishes the current attempt.
*ModLessonApi* | [**modLessonGetAttemptsOverview**](docs/ModLessonApi.md#modLessonGetAttemptsOverview) | **POST** /mod_lesson_get_attempts_overview | Get a list of all the attempts made by users in a lesson.
*ModLessonApi* | [**modLessonGetContentPagesViewed**](docs/ModLessonApi.md#modLessonGetContentPagesViewed) | **POST** /mod_lesson_get_content_pages_viewed | Return the list of content pages viewed by a user during a lesson attempt.
*ModLessonApi* | [**modLessonGetLesson**](docs/ModLessonApi.md#modLessonGetLesson) | **POST** /mod_lesson_get_lesson | Return information of a given lesson.
*ModLessonApi* | [**modLessonGetLessonAccessInformation**](docs/ModLessonApi.md#modLessonGetLessonAccessInformation) | **POST** /mod_lesson_get_lesson_access_information | Return access information for a given lesson.
*ModLessonApi* | [**modLessonGetLessonsByCourses**](docs/ModLessonApi.md#modLessonGetLessonsByCourses) | **POST** /mod_lesson_get_lessons_by_courses | Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
*ModLessonApi* | [**modLessonGetPageData**](docs/ModLessonApi.md#modLessonGetPageData) | **POST** /mod_lesson_get_page_data | Return information of a given page, including its contents.
*ModLessonApi* | [**modLessonGetPages**](docs/ModLessonApi.md#modLessonGetPages) | **POST** /mod_lesson_get_pages | Return the list of pages in a lesson (based on the user permissions).
*ModLessonApi* | [**modLessonGetPagesPossibleJumps**](docs/ModLessonApi.md#modLessonGetPagesPossibleJumps) | **POST** /mod_lesson_get_pages_possible_jumps | Return all the possible jumps for the pages in a given lesson.
*ModLessonApi* | [**modLessonGetQuestionsAttempts**](docs/ModLessonApi.md#modLessonGetQuestionsAttempts) | **POST** /mod_lesson_get_questions_attempts | Return the list of questions attempts in a given lesson.
*ModLessonApi* | [**modLessonGetUserAttempt**](docs/ModLessonApi.md#modLessonGetUserAttempt) | **POST** /mod_lesson_get_user_attempt | Return information about the given user attempt (including answers).
*ModLessonApi* | [**modLessonGetUserAttemptGrade**](docs/ModLessonApi.md#modLessonGetUserAttemptGrade) | **POST** /mod_lesson_get_user_attempt_grade | Return grade information in the attempt for a given user.
*ModLessonApi* | [**modLessonGetUserGrade**](docs/ModLessonApi.md#modLessonGetUserGrade) | **POST** /mod_lesson_get_user_grade | Return the final grade in the lesson for the given user.
*ModLessonApi* | [**modLessonGetUserTimers**](docs/ModLessonApi.md#modLessonGetUserTimers) | **POST** /mod_lesson_get_user_timers | Return the timers in the current lesson for the given user.
*ModLessonApi* | [**modLessonLaunchAttempt**](docs/ModLessonApi.md#modLessonLaunchAttempt) | **POST** /mod_lesson_launch_attempt | Starts a new attempt or continues an existing one.
*ModLessonApi* | [**modLessonProcessPage**](docs/ModLessonApi.md#modLessonProcessPage) | **POST** /mod_lesson_process_page | Processes page responses.
*ModLessonApi* | [**modLessonViewLesson**](docs/ModLessonApi.md#modLessonViewLesson) | **POST** /mod_lesson_view_lesson | Trigger the course module viewed event and update the module completion status.
*ModLtiApi* | [**modLtiCreateToolProxy**](docs/ModLtiApi.md#modLtiCreateToolProxy) | **POST** /mod_lti_create_tool_proxy | Create a tool proxy
*ModLtiApi* | [**modLtiCreateToolType**](docs/ModLtiApi.md#modLtiCreateToolType) | **POST** /mod_lti_create_tool_type | Create a tool type
*ModLtiApi* | [**modLtiDeleteCourseToolType**](docs/ModLtiApi.md#modLtiDeleteCourseToolType) | **POST** /mod_lti_delete_course_tool_type | Delete a course tool type
*ModLtiApi* | [**modLtiDeleteToolProxy**](docs/ModLtiApi.md#modLtiDeleteToolProxy) | **POST** /mod_lti_delete_tool_proxy | Delete a tool proxy
*ModLtiApi* | [**modLtiDeleteToolType**](docs/ModLtiApi.md#modLtiDeleteToolType) | **POST** /mod_lti_delete_tool_type | Delete a tool type
*ModLtiApi* | [**modLtiGetLtisByCourses**](docs/ModLtiApi.md#modLtiGetLtisByCourses) | **POST** /mod_lti_get_ltis_by_courses | Returns a list of external tool instances in a provided set of courses, if                             no courses are provided then all the external tool instances the user has access to will be returned.
*ModLtiApi* | [**modLtiGetToolLaunchData**](docs/ModLtiApi.md#modLtiGetToolLaunchData) | **POST** /mod_lti_get_tool_launch_data | Return the launch data for a given external tool.
*ModLtiApi* | [**modLtiGetToolProxies**](docs/ModLtiApi.md#modLtiGetToolProxies) | **POST** /mod_lti_get_tool_proxies | Get a list of the tool proxies
*ModLtiApi* | [**modLtiGetToolProxyRegistrationRequest**](docs/ModLtiApi.md#modLtiGetToolProxyRegistrationRequest) | **POST** /mod_lti_get_tool_proxy_registration_request | Get a registration request for a tool proxy
*ModLtiApi* | [**modLtiGetToolTypes**](docs/ModLtiApi.md#modLtiGetToolTypes) | **POST** /mod_lti_get_tool_types | Get a list of the tool types
*ModLtiApi* | [**modLtiGetToolTypesAndProxies**](docs/ModLtiApi.md#modLtiGetToolTypesAndProxies) | **POST** /mod_lti_get_tool_types_and_proxies | Get a list of the tool types and tool proxies
*ModLtiApi* | [**modLtiGetToolTypesAndProxiesCount**](docs/ModLtiApi.md#modLtiGetToolTypesAndProxiesCount) | **POST** /mod_lti_get_tool_types_and_proxies_count | Get total number of the tool types and tool proxies
*ModLtiApi* | [**modLtiIsCartridge**](docs/ModLtiApi.md#modLtiIsCartridge) | **POST** /mod_lti_is_cartridge | Determine if the given url is for a cartridge
*ModLtiApi* | [**modLtiToggleShowinactivitychooser**](docs/ModLtiApi.md#modLtiToggleShowinactivitychooser) | **POST** /mod_lti_toggle_showinactivitychooser | Toggle showinactivitychooser for a tool type in a course
*ModLtiApi* | [**modLtiUpdateToolType**](docs/ModLtiApi.md#modLtiUpdateToolType) | **POST** /mod_lti_update_tool_type | Update a tool type
*ModLtiApi* | [**modLtiViewLti**](docs/ModLtiApi.md#modLtiViewLti) | **POST** /mod_lti_view_lti | Trigger the course module viewed event and update the module completion status.
*ModPageApi* | [**modPageGetPagesByCourses**](docs/ModPageApi.md#modPageGetPagesByCourses) | **POST** /mod_page_get_pages_by_courses | Returns a list of pages in a provided list of courses, if no list is provided all pages that the user                             can view will be returned.
*ModPageApi* | [**modPageViewPage**](docs/ModPageApi.md#modPageViewPage) | **POST** /mod_page_view_page | Simulate the view.php web interface page: trigger events, completion, etc...
*ModQuizApi* | [**modQuizAddRandomQuestions**](docs/ModQuizApi.md#modQuizAddRandomQuestions) | **POST** /mod_quiz_add_random_questions | Add a number of random questions to a quiz.
*ModQuizApi* | [**modQuizGetAttemptAccessInformation**](docs/ModQuizApi.md#modQuizGetAttemptAccessInformation) | **POST** /mod_quiz_get_attempt_access_information | Return access information for a given attempt in a quiz.
*ModQuizApi* | [**modQuizGetAttemptData**](docs/ModQuizApi.md#modQuizGetAttemptData) | **POST** /mod_quiz_get_attempt_data | Returns information for the given attempt page for a quiz attempt in progress.
*ModQuizApi* | [**modQuizGetAttemptReview**](docs/ModQuizApi.md#modQuizGetAttemptReview) | **POST** /mod_quiz_get_attempt_review | Returns review information for the given finished attempt, can be used by users or teachers.
*ModQuizApi* | [**modQuizGetAttemptSummary**](docs/ModQuizApi.md#modQuizGetAttemptSummary) | **POST** /mod_quiz_get_attempt_summary | Returns a summary of a quiz attempt before it is submitted.
*ModQuizApi* | [**modQuizGetCombinedReviewOptions**](docs/ModQuizApi.md#modQuizGetCombinedReviewOptions) | **POST** /mod_quiz_get_combined_review_options | Combines the review options from a number of different quiz attempts.
*ModQuizApi* | [**modQuizGetQuizAccessInformation**](docs/ModQuizApi.md#modQuizGetQuizAccessInformation) | **POST** /mod_quiz_get_quiz_access_information | Return access information for a given quiz.
*ModQuizApi* | [**modQuizGetQuizFeedbackForGrade**](docs/ModQuizApi.md#modQuizGetQuizFeedbackForGrade) | **POST** /mod_quiz_get_quiz_feedback_for_grade | Get the feedback text that should be show to a student who got the given grade in the given quiz.
*ModQuizApi* | [**modQuizGetQuizRequiredQtypes**](docs/ModQuizApi.md#modQuizGetQuizRequiredQtypes) | **POST** /mod_quiz_get_quiz_required_qtypes | Return the potential question types that would be required for a given quiz.
*ModQuizApi* | [**modQuizGetQuizzesByCourses**](docs/ModQuizApi.md#modQuizGetQuizzesByCourses) | **POST** /mod_quiz_get_quizzes_by_courses | Returns a list of quizzes in a provided list of courses,                             if no list is provided all quizzes that the user can view will be returned.
*ModQuizApi* | [**modQuizGetReopenAttemptConfirmation**](docs/ModQuizApi.md#modQuizGetReopenAttemptConfirmation) | **POST** /mod_quiz_get_reopen_attempt_confirmation | Verify it is OK to re-open a given quiz attempt, and if so, return a suitable confirmation message.
*ModQuizApi* | [**modQuizGetUserAttempts**](docs/ModQuizApi.md#modQuizGetUserAttempts) | **POST** /mod_quiz_get_user_attempts | Return a list of attempts for the given quiz and user.
*ModQuizApi* | [**modQuizGetUserBestGrade**](docs/ModQuizApi.md#modQuizGetUserBestGrade) | **POST** /mod_quiz_get_user_best_grade | Get the best current grade for the given user on a quiz.
*ModQuizApi* | [**modQuizProcessAttempt**](docs/ModQuizApi.md#modQuizProcessAttempt) | **POST** /mod_quiz_process_attempt | Process responses during an attempt at a quiz and also deals with attempts finishing.
*ModQuizApi* | [**modQuizReopenAttempt**](docs/ModQuizApi.md#modQuizReopenAttempt) | **POST** /mod_quiz_reopen_attempt | Re-open an attempt that is currently in the never submitted state.
*ModQuizApi* | [**modQuizSaveAttempt**](docs/ModQuizApi.md#modQuizSaveAttempt) | **POST** /mod_quiz_save_attempt | Processes save requests during the quiz.                             This function is intended for the quiz auto-save feature.
*ModQuizApi* | [**modQuizSetQuestionVersion**](docs/ModQuizApi.md#modQuizSetQuestionVersion) | **POST** /mod_quiz_set_question_version | Set the version of question that would be required for a given quiz.
*ModQuizApi* | [**modQuizStartAttempt**](docs/ModQuizApi.md#modQuizStartAttempt) | **POST** /mod_quiz_start_attempt | Starts a new attempt at a quiz.
*ModQuizApi* | [**modQuizUpdateFilterCondition**](docs/ModQuizApi.md#modQuizUpdateFilterCondition) | **POST** /mod_quiz_update_filter_condition | Update filter condition for a random question slot.
*ModQuizApi* | [**modQuizViewAttempt**](docs/ModQuizApi.md#modQuizViewAttempt) | **POST** /mod_quiz_view_attempt | Trigger the attempt viewed event.
*ModQuizApi* | [**modQuizViewAttemptReview**](docs/ModQuizApi.md#modQuizViewAttemptReview) | **POST** /mod_quiz_view_attempt_review | Trigger the attempt reviewed event.
*ModQuizApi* | [**modQuizViewAttemptSummary**](docs/ModQuizApi.md#modQuizViewAttemptSummary) | **POST** /mod_quiz_view_attempt_summary | Trigger the attempt summary viewed event.
*ModQuizApi* | [**modQuizViewQuiz**](docs/ModQuizApi.md#modQuizViewQuiz) | **POST** /mod_quiz_view_quiz | Trigger the course module viewed event and update the module completion status.
*ModResourceApi* | [**modResourceGetResourcesByCourses**](docs/ModResourceApi.md#modResourceGetResourcesByCourses) | **POST** /mod_resource_get_resources_by_courses | Returns a list of files in a provided list of courses, if no list is provided all files that                             the user can view will be returned.
*ModResourceApi* | [**modResourceViewResource**](docs/ModResourceApi.md#modResourceViewResource) | **POST** /mod_resource_view_resource | Simulate the view.php web interface resource: trigger events, completion, etc...
*ModScormApi* | [**modScormGetScormAccessInformation**](docs/ModScormApi.md#modScormGetScormAccessInformation) | **POST** /mod_scorm_get_scorm_access_information | Return capabilities information for a given scorm.
*ModScormApi* | [**modScormGetScormAttemptCount**](docs/ModScormApi.md#modScormGetScormAttemptCount) | **POST** /mod_scorm_get_scorm_attempt_count | Return the number of attempts done by a user in the given SCORM.
*ModScormApi* | [**modScormGetScormScoTracks**](docs/ModScormApi.md#modScormGetScormScoTracks) | **POST** /mod_scorm_get_scorm_sco_tracks | Retrieves SCO tracking data for the given user id and attempt number
*ModScormApi* | [**modScormGetScormScoes**](docs/ModScormApi.md#modScormGetScormScoes) | **POST** /mod_scorm_get_scorm_scoes | Returns a list containing all the scoes data related to the given scorm id
*ModScormApi* | [**modScormGetScormUserData**](docs/ModScormApi.md#modScormGetScormUserData) | **POST** /mod_scorm_get_scorm_user_data | Retrieves user tracking and SCO data and default SCORM values
*ModScormApi* | [**modScormGetScormsByCourses**](docs/ModScormApi.md#modScormGetScormsByCourses) | **POST** /mod_scorm_get_scorms_by_courses | Returns a list of scorm instances in a provided set of courses, if                             no courses are provided then all the scorm instances the user has access to will be returned.
*ModScormApi* | [**modScormInsertScormTracks**](docs/ModScormApi.md#modScormInsertScormTracks) | **POST** /mod_scorm_insert_scorm_tracks | Saves a scorm tracking record.                           It will overwrite any existing tracking data for this attempt.                           Validation should be performed before running the function to ensure the user will not lose any existing                           attempt data.
*ModScormApi* | [**modScormLaunchSco**](docs/ModScormApi.md#modScormLaunchSco) | **POST** /mod_scorm_launch_sco | Trigger the SCO launched event.
*ModScormApi* | [**modScormViewScorm**](docs/ModScormApi.md#modScormViewScorm) | **POST** /mod_scorm_view_scorm | Trigger the course module viewed event.
*ModSurveyApi* | [**modSurveyGetQuestions**](docs/ModSurveyApi.md#modSurveyGetQuestions) | **POST** /mod_survey_get_questions | Get the complete list of questions for the survey, including subquestions.
*ModSurveyApi* | [**modSurveyGetSurveysByCourses**](docs/ModSurveyApi.md#modSurveyGetSurveysByCourses) | **POST** /mod_survey_get_surveys_by_courses | Returns a list of survey instances in a provided set of courses,                             if no courses are provided then all the survey instances the user has access to will be returned.
*ModSurveyApi* | [**modSurveySubmitAnswers**](docs/ModSurveyApi.md#modSurveySubmitAnswers) | **POST** /mod_survey_submit_answers | Submit the answers for a given survey.
*ModSurveyApi* | [**modSurveyViewSurvey**](docs/ModSurveyApi.md#modSurveyViewSurvey) | **POST** /mod_survey_view_survey | Trigger the course module viewed event and update the module completion status.
*ModUrlApi* | [**modUrlGetUrlsByCourses**](docs/ModUrlApi.md#modUrlGetUrlsByCourses) | **POST** /mod_url_get_urls_by_courses | Returns a list of urls in a provided list of courses, if no list is provided all urls that the user                             can view will be returned.
*ModUrlApi* | [**modUrlViewUrl**](docs/ModUrlApi.md#modUrlViewUrl) | **POST** /mod_url_view_url | Trigger the course module viewed event and update the module completion status.
*ModWikiApi* | [**modWikiEditPage**](docs/ModWikiApi.md#modWikiEditPage) | **POST** /mod_wiki_edit_page | Save the contents of a page.
*ModWikiApi* | [**modWikiGetPageContents**](docs/ModWikiApi.md#modWikiGetPageContents) | **POST** /mod_wiki_get_page_contents | Returns the contents of a page.
*ModWikiApi* | [**modWikiGetPageForEditing**](docs/ModWikiApi.md#modWikiGetPageForEditing) | **POST** /mod_wiki_get_page_for_editing | Locks and retrieves info of page-section to be edited.
*ModWikiApi* | [**modWikiGetSubwikiFiles**](docs/ModWikiApi.md#modWikiGetSubwikiFiles) | **POST** /mod_wiki_get_subwiki_files | Returns the list of files for a specific subwiki.
*ModWikiApi* | [**modWikiGetSubwikiPages**](docs/ModWikiApi.md#modWikiGetSubwikiPages) | **POST** /mod_wiki_get_subwiki_pages | Returns the list of pages for a specific subwiki.
*ModWikiApi* | [**modWikiGetSubwikis**](docs/ModWikiApi.md#modWikiGetSubwikis) | **POST** /mod_wiki_get_subwikis | Returns the list of subwikis the user can see in a specific wiki.
*ModWikiApi* | [**modWikiGetWikisByCourses**](docs/ModWikiApi.md#modWikiGetWikisByCourses) | **POST** /mod_wiki_get_wikis_by_courses | Returns a list of wiki instances in a provided set of courses, if no courses are provided then all the wiki instances the user has access to will be returned.
*ModWikiApi* | [**modWikiNewPage**](docs/ModWikiApi.md#modWikiNewPage) | **POST** /mod_wiki_new_page | Create a new page in a subwiki.
*ModWikiApi* | [**modWikiViewPage**](docs/ModWikiApi.md#modWikiViewPage) | **POST** /mod_wiki_view_page | Trigger the page viewed event and update the module completion status.
*ModWikiApi* | [**modWikiViewWiki**](docs/ModWikiApi.md#modWikiViewWiki) | **POST** /mod_wiki_view_wiki | Trigger the course module viewed event and update the module completion status.
*ModWorkshopApi* | [**modWorkshopAddSubmission**](docs/ModWorkshopApi.md#modWorkshopAddSubmission) | **POST** /mod_workshop_add_submission | Add a new submission to a given workshop.
*ModWorkshopApi* | [**modWorkshopDeleteSubmission**](docs/ModWorkshopApi.md#modWorkshopDeleteSubmission) | **POST** /mod_workshop_delete_submission | Deletes the given submission.
*ModWorkshopApi* | [**modWorkshopEvaluateAssessment**](docs/ModWorkshopApi.md#modWorkshopEvaluateAssessment) | **POST** /mod_workshop_evaluate_assessment | Evaluates an assessment (used by teachers for provide feedback to the reviewer).
*ModWorkshopApi* | [**modWorkshopEvaluateSubmission**](docs/ModWorkshopApi.md#modWorkshopEvaluateSubmission) | **POST** /mod_workshop_evaluate_submission | Evaluates a submission (used by teachers for provide feedback or override the submission grade).
*ModWorkshopApi* | [**modWorkshopGetAssessment**](docs/ModWorkshopApi.md#modWorkshopGetAssessment) | **POST** /mod_workshop_get_assessment | Retrieves the given assessment.
*ModWorkshopApi* | [**modWorkshopGetAssessmentFormDefinition**](docs/ModWorkshopApi.md#modWorkshopGetAssessmentFormDefinition) | **POST** /mod_workshop_get_assessment_form_definition | Retrieves the assessment form definition.
*ModWorkshopApi* | [**modWorkshopGetGrades**](docs/ModWorkshopApi.md#modWorkshopGetGrades) | **POST** /mod_workshop_get_grades | Returns the assessment and submission grade for the given user.
*ModWorkshopApi* | [**modWorkshopGetGradesReport**](docs/ModWorkshopApi.md#modWorkshopGetGradesReport) | **POST** /mod_workshop_get_grades_report | Retrieves the assessment grades report.
*ModWorkshopApi* | [**modWorkshopGetReviewerAssessments**](docs/ModWorkshopApi.md#modWorkshopGetReviewerAssessments) | **POST** /mod_workshop_get_reviewer_assessments | Retrieves all the assessments reviewed by the given user.
*ModWorkshopApi* | [**modWorkshopGetSubmission**](docs/ModWorkshopApi.md#modWorkshopGetSubmission) | **POST** /mod_workshop_get_submission | Retrieves the given submission.
*ModWorkshopApi* | [**modWorkshopGetSubmissionAssessments**](docs/ModWorkshopApi.md#modWorkshopGetSubmissionAssessments) | **POST** /mod_workshop_get_submission_assessments | Retrieves all the assessments of the given submission.
*ModWorkshopApi* | [**modWorkshopGetSubmissions**](docs/ModWorkshopApi.md#modWorkshopGetSubmissions) | **POST** /mod_workshop_get_submissions | Retrieves all the workshop submissions or the one done by the given user (except example submissions).
*ModWorkshopApi* | [**modWorkshopGetUserPlan**](docs/ModWorkshopApi.md#modWorkshopGetUserPlan) | **POST** /mod_workshop_get_user_plan | Return the planner information for the given user.
*ModWorkshopApi* | [**modWorkshopGetWorkshopAccessInformation**](docs/ModWorkshopApi.md#modWorkshopGetWorkshopAccessInformation) | **POST** /mod_workshop_get_workshop_access_information | Return access information for a given workshop.
*ModWorkshopApi* | [**modWorkshopGetWorkshopsByCourses**](docs/ModWorkshopApi.md#modWorkshopGetWorkshopsByCourses) | **POST** /mod_workshop_get_workshops_by_courses | Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
*ModWorkshopApi* | [**modWorkshopUpdateAssessment**](docs/ModWorkshopApi.md#modWorkshopUpdateAssessment) | **POST** /mod_workshop_update_assessment | Add information to an allocated assessment.
*ModWorkshopApi* | [**modWorkshopUpdateSubmission**](docs/ModWorkshopApi.md#modWorkshopUpdateSubmission) | **POST** /mod_workshop_update_submission | Update the given submission.
*ModWorkshopApi* | [**modWorkshopViewSubmission**](docs/ModWorkshopApi.md#modWorkshopViewSubmission) | **POST** /mod_workshop_view_submission | Trigger the submission viewed event.
*ModWorkshopApi* | [**modWorkshopViewWorkshop**](docs/ModWorkshopApi.md#modWorkshopViewWorkshop) | **POST** /mod_workshop_view_workshop | Trigger the course module viewed event and update the module completion status.
*MoodleApi* | [**coreAdminSetBlockProtection**](docs/MoodleApi.md#coreAdminSetBlockProtection) | **POST** /core_admin_set_block_protection | Set the protection state for a block plugin
*MoodleApi* | [**coreAdminSetPluginOrder**](docs/MoodleApi.md#coreAdminSetPluginOrder) | **POST** /core_admin_set_plugin_order | Set the order of a plugin
*MoodleApi* | [**coreAdminSetPluginState**](docs/MoodleApi.md#coreAdminSetPluginState) | **POST** /core_admin_set_plugin_state | Set the state of a plugin
*MoodleApi* | [**coreAuthConfirmUser**](docs/MoodleApi.md#coreAuthConfirmUser) | **POST** /core_auth_confirm_user | Confirm a user account.
*MoodleApi* | [**coreAuthIsAgeDigitalConsentVerificationEnabled**](docs/MoodleApi.md#coreAuthIsAgeDigitalConsentVerificationEnabled) | **POST** /core_auth_is_age_digital_consent_verification_enabled | Checks if age digital consent verification is enabled.
*MoodleApi* | [**coreAuthIsMinor**](docs/MoodleApi.md#coreAuthIsMinor) | **POST** /core_auth_is_minor | Requests a check if a user is a digital minor.
*MoodleApi* | [**coreAuthRequestPasswordReset**](docs/MoodleApi.md#coreAuthRequestPasswordReset) | **POST** /core_auth_request_password_reset | Requests a password reset.
*MoodleApi* | [**coreAuthResendConfirmationEmail**](docs/MoodleApi.md#coreAuthResendConfirmationEmail) | **POST** /core_auth_resend_confirmation_email | Resend confirmation email.
*MoodleApi* | [**coreBackupGetAsyncBackupLinksBackup**](docs/MoodleApi.md#coreBackupGetAsyncBackupLinksBackup) | **POST** /core_backup_get_async_backup_links_backup | Gets the data to use when updating the status table row in the UI for when an async backup completes.
*MoodleApi* | [**coreBackupGetAsyncBackupLinksRestore**](docs/MoodleApi.md#coreBackupGetAsyncBackupLinksRestore) | **POST** /core_backup_get_async_backup_links_restore | Gets the data to use when updating the status table row in the UI for when an async restore completes.
*MoodleApi* | [**coreBackupGetAsyncBackupProgress**](docs/MoodleApi.md#coreBackupGetAsyncBackupProgress) | **POST** /core_backup_get_async_backup_progress | Get the progress of an Asyncronhous backup.
*MoodleApi* | [**coreBackupGetCopyProgress**](docs/MoodleApi.md#coreBackupGetCopyProgress) | **POST** /core_backup_get_copy_progress | Gets the progress of course copy operations.
*MoodleApi* | [**coreBackupSubmitCopyForm**](docs/MoodleApi.md#coreBackupSubmitCopyForm) | **POST** /core_backup_submit_copy_form | Handles ajax submission of course copy form.
*MoodleApi* | [**coreBadgesGetUserBadgeByHash**](docs/MoodleApi.md#coreBadgesGetUserBadgeByHash) | **POST** /core_badges_get_user_badge_by_hash | Returns the badge awarded to a user by hash.
*MoodleApi* | [**coreBadgesGetUserBadges**](docs/MoodleApi.md#coreBadgesGetUserBadges) | **POST** /core_badges_get_user_badges | Returns the list of badges awarded to a user.
*MoodleApi* | [**coreBlockFetchAddableBlocks**](docs/MoodleApi.md#coreBlockFetchAddableBlocks) | **POST** /core_block_fetch_addable_blocks | Returns all addable blocks in a given page.
*MoodleApi* | [**coreBlockGetCourseBlocks**](docs/MoodleApi.md#coreBlockGetCourseBlocks) | **POST** /core_block_get_course_blocks | Returns blocks information for a course.
*MoodleApi* | [**coreBlockGetDashboardBlocks**](docs/MoodleApi.md#coreBlockGetDashboardBlocks) | **POST** /core_block_get_dashboard_blocks | Returns blocks information for the given user dashboard.
*MoodleApi* | [**coreBlogGetEntries**](docs/MoodleApi.md#coreBlogGetEntries) | **POST** /core_blog_get_entries | Returns blog entries.
*MoodleApi* | [**coreBlogViewEntries**](docs/MoodleApi.md#coreBlogViewEntries) | **POST** /core_blog_view_entries | Trigger the blog_entries_viewed event.
*MoodleApi* | [**coreCalendarCreateCalendarEvents**](docs/MoodleApi.md#coreCalendarCreateCalendarEvents) | **POST** /core_calendar_create_calendar_events | Create calendar events
*MoodleApi* | [**coreCalendarDeleteCalendarEvents**](docs/MoodleApi.md#coreCalendarDeleteCalendarEvents) | **POST** /core_calendar_delete_calendar_events | Delete calendar events
*MoodleApi* | [**coreCalendarDeleteSubscription**](docs/MoodleApi.md#coreCalendarDeleteSubscription) | **POST** /core_calendar_delete_subscription | Delete the calendar subscription
*MoodleApi* | [**coreCalendarGetActionEventsByCourse**](docs/MoodleApi.md#coreCalendarGetActionEventsByCourse) | **POST** /core_calendar_get_action_events_by_course | Get calendar action events by course
*MoodleApi* | [**coreCalendarGetActionEventsByCourses**](docs/MoodleApi.md#coreCalendarGetActionEventsByCourses) | **POST** /core_calendar_get_action_events_by_courses | Get calendar action events by courses
*MoodleApi* | [**coreCalendarGetActionEventsByTimesort**](docs/MoodleApi.md#coreCalendarGetActionEventsByTimesort) | **POST** /core_calendar_get_action_events_by_timesort | Get calendar action events by tiemsort
*MoodleApi* | [**coreCalendarGetAllowedEventTypes**](docs/MoodleApi.md#coreCalendarGetAllowedEventTypes) | **POST** /core_calendar_get_allowed_event_types | Get the type of events a user can create in the given course.
*MoodleApi* | [**coreCalendarGetCalendarAccessInformation**](docs/MoodleApi.md#coreCalendarGetCalendarAccessInformation) | **POST** /core_calendar_get_calendar_access_information | Convenience function to retrieve some permissions/access information for the given course calendar.
*MoodleApi* | [**coreCalendarGetCalendarDayView**](docs/MoodleApi.md#coreCalendarGetCalendarDayView) | **POST** /core_calendar_get_calendar_day_view | Fetch the day view data for a calendar
*MoodleApi* | [**coreCalendarGetCalendarEventById**](docs/MoodleApi.md#coreCalendarGetCalendarEventById) | **POST** /core_calendar_get_calendar_event_by_id | Get calendar event by id
*MoodleApi* | [**coreCalendarGetCalendarEvents**](docs/MoodleApi.md#coreCalendarGetCalendarEvents) | **POST** /core_calendar_get_calendar_events | Get calendar events
*MoodleApi* | [**coreCalendarGetCalendarExportToken**](docs/MoodleApi.md#coreCalendarGetCalendarExportToken) | **POST** /core_calendar_get_calendar_export_token | Return the auth token required for exporting a calendar.
*MoodleApi* | [**coreCalendarGetCalendarMonthlyView**](docs/MoodleApi.md#coreCalendarGetCalendarMonthlyView) | **POST** /core_calendar_get_calendar_monthly_view | Fetch the monthly view data for a calendar
*MoodleApi* | [**coreCalendarGetCalendarUpcomingView**](docs/MoodleApi.md#coreCalendarGetCalendarUpcomingView) | **POST** /core_calendar_get_calendar_upcoming_view | Fetch the upcoming view data for a calendar
*MoodleApi* | [**coreCalendarGetTimestamps**](docs/MoodleApi.md#coreCalendarGetTimestamps) | **POST** /core_calendar_get_timestamps | Fetch unix timestamps for given date times.
*MoodleApi* | [**coreCalendarSubmitCreateUpdateForm**](docs/MoodleApi.md#coreCalendarSubmitCreateUpdateForm) | **POST** /core_calendar_submit_create_update_form | Submit form data for event form
*MoodleApi* | [**coreCalendarUpdateEventStartDay**](docs/MoodleApi.md#coreCalendarUpdateEventStartDay) | **POST** /core_calendar_update_event_start_day | Update the start day (but not time) for an event.
*MoodleApi* | [**coreChangeEditmode**](docs/MoodleApi.md#coreChangeEditmode) | **POST** /core_change_editmode | Change the editing mode
*MoodleApi* | [**coreCohortAddCohortMembers**](docs/MoodleApi.md#coreCohortAddCohortMembers) | **POST** /core_cohort_add_cohort_members | Adds cohort members.
*MoodleApi* | [**coreCohortCreateCohorts**](docs/MoodleApi.md#coreCohortCreateCohorts) | **POST** /core_cohort_create_cohorts | Creates new cohorts.
*MoodleApi* | [**coreCohortDeleteCohortMembers**](docs/MoodleApi.md#coreCohortDeleteCohortMembers) | **POST** /core_cohort_delete_cohort_members | Deletes cohort members.
*MoodleApi* | [**coreCohortDeleteCohorts**](docs/MoodleApi.md#coreCohortDeleteCohorts) | **POST** /core_cohort_delete_cohorts | Deletes all specified cohorts.
*MoodleApi* | [**coreCohortGetCohortMembers**](docs/MoodleApi.md#coreCohortGetCohortMembers) | **POST** /core_cohort_get_cohort_members | Returns cohort members.
*MoodleApi* | [**coreCohortGetCohorts**](docs/MoodleApi.md#coreCohortGetCohorts) | **POST** /core_cohort_get_cohorts | Returns cohort details.
*MoodleApi* | [**coreCohortSearchCohorts**](docs/MoodleApi.md#coreCohortSearchCohorts) | **POST** /core_cohort_search_cohorts | Search for cohorts.
*MoodleApi* | [**coreCohortUpdateCohorts**](docs/MoodleApi.md#coreCohortUpdateCohorts) | **POST** /core_cohort_update_cohorts | Updates existing cohorts.
*MoodleApi* | [**coreCommentAddComments**](docs/MoodleApi.md#coreCommentAddComments) | **POST** /core_comment_add_comments | Adds a comment or comments.
*MoodleApi* | [**coreCommentDeleteComments**](docs/MoodleApi.md#coreCommentDeleteComments) | **POST** /core_comment_delete_comments | Deletes a comment or comments.
*MoodleApi* | [**coreCommentGetComments**](docs/MoodleApi.md#coreCommentGetComments) | **POST** /core_comment_get_comments | Returns comments.
*MoodleApi* | [**coreCompetencyAddCompetencyToCourse**](docs/MoodleApi.md#coreCompetencyAddCompetencyToCourse) | **POST** /core_competency_add_competency_to_course | Add the competency to a course
*MoodleApi* | [**coreCompetencyAddCompetencyToPlan**](docs/MoodleApi.md#coreCompetencyAddCompetencyToPlan) | **POST** /core_competency_add_competency_to_plan | Add the competency to a learning plan
*MoodleApi* | [**coreCompetencyAddCompetencyToTemplate**](docs/MoodleApi.md#coreCompetencyAddCompetencyToTemplate) | **POST** /core_competency_add_competency_to_template | Add the competency to a template
*MoodleApi* | [**coreCompetencyAddRelatedCompetency**](docs/MoodleApi.md#coreCompetencyAddRelatedCompetency) | **POST** /core_competency_add_related_competency | Adds a related competency
*MoodleApi* | [**coreCompetencyApprovePlan**](docs/MoodleApi.md#coreCompetencyApprovePlan) | **POST** /core_competency_approve_plan | Approve a plan.
*MoodleApi* | [**coreCompetencyCompetencyFrameworkViewed**](docs/MoodleApi.md#coreCompetencyCompetencyFrameworkViewed) | **POST** /core_competency_competency_framework_viewed | Log event competency framework viewed
*MoodleApi* | [**coreCompetencyCompetencyViewed**](docs/MoodleApi.md#coreCompetencyCompetencyViewed) | **POST** /core_competency_competency_viewed | Log event competency viewed
*MoodleApi* | [**coreCompetencyCompletePlan**](docs/MoodleApi.md#coreCompetencyCompletePlan) | **POST** /core_competency_complete_plan | Complete learning plan.
*MoodleApi* | [**coreCompetencyCountCompetencies**](docs/MoodleApi.md#coreCompetencyCountCompetencies) | **POST** /core_competency_count_competencies | Count a list of a competencies.
*MoodleApi* | [**coreCompetencyCountCompetenciesInCourse**](docs/MoodleApi.md#coreCompetencyCountCompetenciesInCourse) | **POST** /core_competency_count_competencies_in_course | List the competencies in a course
*MoodleApi* | [**coreCompetencyCountCompetenciesInTemplate**](docs/MoodleApi.md#coreCompetencyCountCompetenciesInTemplate) | **POST** /core_competency_count_competencies_in_template | Count a list of a competencies for a given template.
*MoodleApi* | [**coreCompetencyCountCompetencyFrameworks**](docs/MoodleApi.md#coreCompetencyCountCompetencyFrameworks) | **POST** /core_competency_count_competency_frameworks | Count a list of a competency frameworks.
*MoodleApi* | [**coreCompetencyCountCourseModuleCompetencies**](docs/MoodleApi.md#coreCompetencyCountCourseModuleCompetencies) | **POST** /core_competency_count_course_module_competencies | Count the competencies in a course module
*MoodleApi* | [**coreCompetencyCountCoursesUsingCompetency**](docs/MoodleApi.md#coreCompetencyCountCoursesUsingCompetency) | **POST** /core_competency_count_courses_using_competency | List the courses using a competency
*MoodleApi* | [**coreCompetencyCountTemplates**](docs/MoodleApi.md#coreCompetencyCountTemplates) | **POST** /core_competency_count_templates | Count a list of a learning plan templates.
*MoodleApi* | [**coreCompetencyCountTemplatesUsingCompetency**](docs/MoodleApi.md#coreCompetencyCountTemplatesUsingCompetency) | **POST** /core_competency_count_templates_using_competency | Count a list of a learning plan templates for a given competency.
*MoodleApi* | [**coreCompetencyCreateCompetency**](docs/MoodleApi.md#coreCompetencyCreateCompetency) | **POST** /core_competency_create_competency | Creates new competencies.
*MoodleApi* | [**coreCompetencyCreateCompetencyFramework**](docs/MoodleApi.md#coreCompetencyCreateCompetencyFramework) | **POST** /core_competency_create_competency_framework | Creates new competency frameworks.
*MoodleApi* | [**coreCompetencyCreatePlan**](docs/MoodleApi.md#coreCompetencyCreatePlan) | **POST** /core_competency_create_plan | Creates a learning plan.
*MoodleApi* | [**coreCompetencyCreateTemplate**](docs/MoodleApi.md#coreCompetencyCreateTemplate) | **POST** /core_competency_create_template | Creates new learning plan templates.
*MoodleApi* | [**coreCompetencyCreateUserEvidenceCompetency**](docs/MoodleApi.md#coreCompetencyCreateUserEvidenceCompetency) | **POST** /core_competency_create_user_evidence_competency | Create an evidence of prior learning relationship with a competency.
*MoodleApi* | [**coreCompetencyDeleteCompetency**](docs/MoodleApi.md#coreCompetencyDeleteCompetency) | **POST** /core_competency_delete_competency | Delete a competency.
*MoodleApi* | [**coreCompetencyDeleteCompetencyFramework**](docs/MoodleApi.md#coreCompetencyDeleteCompetencyFramework) | **POST** /core_competency_delete_competency_framework | Delete a competency framework.
*MoodleApi* | [**coreCompetencyDeleteEvidence**](docs/MoodleApi.md#coreCompetencyDeleteEvidence) | **POST** /core_competency_delete_evidence | Delete an evidence
*MoodleApi* | [**coreCompetencyDeletePlan**](docs/MoodleApi.md#coreCompetencyDeletePlan) | **POST** /core_competency_delete_plan | Delete a learning plan.
*MoodleApi* | [**coreCompetencyDeleteTemplate**](docs/MoodleApi.md#coreCompetencyDeleteTemplate) | **POST** /core_competency_delete_template | Delete a learning plan template.
*MoodleApi* | [**coreCompetencyDeleteUserEvidence**](docs/MoodleApi.md#coreCompetencyDeleteUserEvidence) | **POST** /core_competency_delete_user_evidence | Delete an evidence of prior learning.
*MoodleApi* | [**coreCompetencyDeleteUserEvidenceCompetency**](docs/MoodleApi.md#coreCompetencyDeleteUserEvidenceCompetency) | **POST** /core_competency_delete_user_evidence_competency | Delete an evidence of prior learning relationship with a competency.
*MoodleApi* | [**coreCompetencyDuplicateCompetencyFramework**](docs/MoodleApi.md#coreCompetencyDuplicateCompetencyFramework) | **POST** /core_competency_duplicate_competency_framework | Duplicate a competency framework.
*MoodleApi* | [**coreCompetencyDuplicateTemplate**](docs/MoodleApi.md#coreCompetencyDuplicateTemplate) | **POST** /core_competency_duplicate_template | Duplicate learning plan template.
*MoodleApi* | [**coreCompetencyGetScaleValues**](docs/MoodleApi.md#coreCompetencyGetScaleValues) | **POST** /core_competency_get_scale_values | Fetch the values for a specific scale
*MoodleApi* | [**coreCompetencyGradeCompetency**](docs/MoodleApi.md#coreCompetencyGradeCompetency) | **POST** /core_competency_grade_competency | Grade a competency.
*MoodleApi* | [**coreCompetencyGradeCompetencyInCourse**](docs/MoodleApi.md#coreCompetencyGradeCompetencyInCourse) | **POST** /core_competency_grade_competency_in_course | Grade a competency from the course page.
*MoodleApi* | [**coreCompetencyGradeCompetencyInPlan**](docs/MoodleApi.md#coreCompetencyGradeCompetencyInPlan) | **POST** /core_competency_grade_competency_in_plan | Grade a competency from the user plan page.
*MoodleApi* | [**coreCompetencyListCompetencies**](docs/MoodleApi.md#coreCompetencyListCompetencies) | **POST** /core_competency_list_competencies | Load a list of a competencies.
*MoodleApi* | [**coreCompetencyListCompetenciesInTemplate**](docs/MoodleApi.md#coreCompetencyListCompetenciesInTemplate) | **POST** /core_competency_list_competencies_in_template | Load a list of a competencies for a given template.
*MoodleApi* | [**coreCompetencyListCompetencyFrameworks**](docs/MoodleApi.md#coreCompetencyListCompetencyFrameworks) | **POST** /core_competency_list_competency_frameworks | Load a list of a competency frameworks.
*MoodleApi* | [**coreCompetencyListCourseCompetencies**](docs/MoodleApi.md#coreCompetencyListCourseCompetencies) | **POST** /core_competency_list_course_competencies | List the competencies in a course
*MoodleApi* | [**coreCompetencyListCourseModuleCompetencies**](docs/MoodleApi.md#coreCompetencyListCourseModuleCompetencies) | **POST** /core_competency_list_course_module_competencies | List the competencies in a course module
*MoodleApi* | [**coreCompetencyListPlanCompetencies**](docs/MoodleApi.md#coreCompetencyListPlanCompetencies) | **POST** /core_competency_list_plan_competencies | List the competencies in a plan
*MoodleApi* | [**coreCompetencyListTemplates**](docs/MoodleApi.md#coreCompetencyListTemplates) | **POST** /core_competency_list_templates | Load a list of a learning plan templates.
*MoodleApi* | [**coreCompetencyListTemplatesUsingCompetency**](docs/MoodleApi.md#coreCompetencyListTemplatesUsingCompetency) | **POST** /core_competency_list_templates_using_competency | Load a list of a learning plan templates for a given competency.
*MoodleApi* | [**coreCompetencyListUserPlans**](docs/MoodleApi.md#coreCompetencyListUserPlans) | **POST** /core_competency_list_user_plans | List a user&#39;s learning plans.
*MoodleApi* | [**coreCompetencyMoveDownCompetency**](docs/MoodleApi.md#coreCompetencyMoveDownCompetency) | **POST** /core_competency_move_down_competency | Re-order a competency.
*MoodleApi* | [**coreCompetencyMoveUpCompetency**](docs/MoodleApi.md#coreCompetencyMoveUpCompetency) | **POST** /core_competency_move_up_competency | Re-order a competency.
*MoodleApi* | [**coreCompetencyPlanCancelReviewRequest**](docs/MoodleApi.md#coreCompetencyPlanCancelReviewRequest) | **POST** /core_competency_plan_cancel_review_request | Cancel the review of a plan.
*MoodleApi* | [**coreCompetencyPlanRequestReview**](docs/MoodleApi.md#coreCompetencyPlanRequestReview) | **POST** /core_competency_plan_request_review | Request for a plan to be reviewed.
*MoodleApi* | [**coreCompetencyPlanStartReview**](docs/MoodleApi.md#coreCompetencyPlanStartReview) | **POST** /core_competency_plan_start_review | Start the review of a plan.
*MoodleApi* | [**coreCompetencyPlanStopReview**](docs/MoodleApi.md#coreCompetencyPlanStopReview) | **POST** /core_competency_plan_stop_review | Stop the review of a plan.
*MoodleApi* | [**coreCompetencyReadCompetency**](docs/MoodleApi.md#coreCompetencyReadCompetency) | **POST** /core_competency_read_competency | Load a summary of a competency.
*MoodleApi* | [**coreCompetencyReadCompetencyFramework**](docs/MoodleApi.md#coreCompetencyReadCompetencyFramework) | **POST** /core_competency_read_competency_framework | Load a summary of a competency framework.
*MoodleApi* | [**coreCompetencyReadPlan**](docs/MoodleApi.md#coreCompetencyReadPlan) | **POST** /core_competency_read_plan | Load a learning plan.
*MoodleApi* | [**coreCompetencyReadTemplate**](docs/MoodleApi.md#coreCompetencyReadTemplate) | **POST** /core_competency_read_template | Load a summary of a learning plan template.
*MoodleApi* | [**coreCompetencyReadUserEvidence**](docs/MoodleApi.md#coreCompetencyReadUserEvidence) | **POST** /core_competency_read_user_evidence | Read an evidence of prior learning.
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromCourse**](docs/MoodleApi.md#coreCompetencyRemoveCompetencyFromCourse) | **POST** /core_competency_remove_competency_from_course | Remove a competency from a course
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromPlan**](docs/MoodleApi.md#coreCompetencyRemoveCompetencyFromPlan) | **POST** /core_competency_remove_competency_from_plan | Remove the competency from a learning plan
*MoodleApi* | [**coreCompetencyRemoveCompetencyFromTemplate**](docs/MoodleApi.md#coreCompetencyRemoveCompetencyFromTemplate) | **POST** /core_competency_remove_competency_from_template | Remove a competency from a template
*MoodleApi* | [**coreCompetencyRemoveRelatedCompetency**](docs/MoodleApi.md#coreCompetencyRemoveRelatedCompetency) | **POST** /core_competency_remove_related_competency | Remove a related competency
*MoodleApi* | [**coreCompetencyReopenPlan**](docs/MoodleApi.md#coreCompetencyReopenPlan) | **POST** /core_competency_reopen_plan | Reopen learning plan.
*MoodleApi* | [**coreCompetencyReorderCourseCompetency**](docs/MoodleApi.md#coreCompetencyReorderCourseCompetency) | **POST** /core_competency_reorder_course_competency | Move a course competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyReorderPlanCompetency**](docs/MoodleApi.md#coreCompetencyReorderPlanCompetency) | **POST** /core_competency_reorder_plan_competency | Move a plan competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyReorderTemplateCompetency**](docs/MoodleApi.md#coreCompetencyReorderTemplateCompetency) | **POST** /core_competency_reorder_template_competency | Move a template competency to a new relative sort order.
*MoodleApi* | [**coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies**](docs/MoodleApi.md#coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies) | **POST** /core_competency_request_review_of_user_evidence_linked_competencies | Send user evidence competencies in review
*MoodleApi* | [**coreCompetencySearchCompetencies**](docs/MoodleApi.md#coreCompetencySearchCompetencies) | **POST** /core_competency_search_competencies | Search a list of a competencies.
*MoodleApi* | [**coreCompetencySetCourseCompetencyRuleoutcome**](docs/MoodleApi.md#coreCompetencySetCourseCompetencyRuleoutcome) | **POST** /core_competency_set_course_competency_ruleoutcome | Modify the ruleoutcome value for course competency
*MoodleApi* | [**coreCompetencySetParentCompetency**](docs/MoodleApi.md#coreCompetencySetParentCompetency) | **POST** /core_competency_set_parent_competency | Set a new parent for a competency.
*MoodleApi* | [**coreCompetencyTemplateHasRelatedData**](docs/MoodleApi.md#coreCompetencyTemplateHasRelatedData) | **POST** /core_competency_template_has_related_data | Check if a template has related data
*MoodleApi* | [**coreCompetencyTemplateViewed**](docs/MoodleApi.md#coreCompetencyTemplateViewed) | **POST** /core_competency_template_viewed | Log event template viewed
*MoodleApi* | [**coreCompetencyUnapprovePlan**](docs/MoodleApi.md#coreCompetencyUnapprovePlan) | **POST** /core_competency_unapprove_plan | Unapprove a plan.
*MoodleApi* | [**coreCompetencyUnlinkPlanFromTemplate**](docs/MoodleApi.md#coreCompetencyUnlinkPlanFromTemplate) | **POST** /core_competency_unlink_plan_from_template | Unlink a plan form it template.
*MoodleApi* | [**coreCompetencyUpdateCompetency**](docs/MoodleApi.md#coreCompetencyUpdateCompetency) | **POST** /core_competency_update_competency | Update a competency.
*MoodleApi* | [**coreCompetencyUpdateCompetencyFramework**](docs/MoodleApi.md#coreCompetencyUpdateCompetencyFramework) | **POST** /core_competency_update_competency_framework | Update a competency framework.
*MoodleApi* | [**coreCompetencyUpdateCourseCompetencySettings**](docs/MoodleApi.md#coreCompetencyUpdateCourseCompetencySettings) | **POST** /core_competency_update_course_competency_settings | Update the course competency settings
*MoodleApi* | [**coreCompetencyUpdatePlan**](docs/MoodleApi.md#coreCompetencyUpdatePlan) | **POST** /core_competency_update_plan | Updates a learning plan.
*MoodleApi* | [**coreCompetencyUpdateTemplate**](docs/MoodleApi.md#coreCompetencyUpdateTemplate) | **POST** /core_competency_update_template | Update a learning plan template.
*MoodleApi* | [**coreCompetencyUserCompetencyCancelReviewRequest**](docs/MoodleApi.md#coreCompetencyUserCompetencyCancelReviewRequest) | **POST** /core_competency_user_competency_cancel_review_request | Cancel a review request.
*MoodleApi* | [**coreCompetencyUserCompetencyPlanViewed**](docs/MoodleApi.md#coreCompetencyUserCompetencyPlanViewed) | **POST** /core_competency_user_competency_plan_viewed | Log the user competency plan viewed event.
*MoodleApi* | [**coreCompetencyUserCompetencyRequestReview**](docs/MoodleApi.md#coreCompetencyUserCompetencyRequestReview) | **POST** /core_competency_user_competency_request_review | Request a review.
*MoodleApi* | [**coreCompetencyUserCompetencyStartReview**](docs/MoodleApi.md#coreCompetencyUserCompetencyStartReview) | **POST** /core_competency_user_competency_start_review | Start a review.
*MoodleApi* | [**coreCompetencyUserCompetencyStopReview**](docs/MoodleApi.md#coreCompetencyUserCompetencyStopReview) | **POST** /core_competency_user_competency_stop_review | Stop a review.
*MoodleApi* | [**coreCompetencyUserCompetencyViewed**](docs/MoodleApi.md#coreCompetencyUserCompetencyViewed) | **POST** /core_competency_user_competency_viewed | Log the user competency viewed event.
*MoodleApi* | [**coreCompetencyUserCompetencyViewedInCourse**](docs/MoodleApi.md#coreCompetencyUserCompetencyViewedInCourse) | **POST** /core_competency_user_competency_viewed_in_course | Log the user competency viewed in course event
*MoodleApi* | [**coreCompetencyUserCompetencyViewedInPlan**](docs/MoodleApi.md#coreCompetencyUserCompetencyViewedInPlan) | **POST** /core_competency_user_competency_viewed_in_plan | Log the user competency viewed in plan event.
*MoodleApi* | [**coreCompletionGetActivitiesCompletionStatus**](docs/MoodleApi.md#coreCompletionGetActivitiesCompletionStatus) | **POST** /core_completion_get_activities_completion_status | Return the activities completion status for a user in a course.
*MoodleApi* | [**coreCompletionGetCourseCompletionStatus**](docs/MoodleApi.md#coreCompletionGetCourseCompletionStatus) | **POST** /core_completion_get_course_completion_status | Returns course completion status.
*MoodleApi* | [**coreCompletionMarkCourseSelfCompleted**](docs/MoodleApi.md#coreCompletionMarkCourseSelfCompleted) | **POST** /core_completion_mark_course_self_completed | Update the course completion status for the current user (if course self-completion is enabled).
*MoodleApi* | [**coreCompletionOverrideActivityCompletionStatus**](docs/MoodleApi.md#coreCompletionOverrideActivityCompletionStatus) | **POST** /core_completion_override_activity_completion_status | Update completion status for a user in an activity by overriding it.
*MoodleApi* | [**coreCompletionUpdateActivityCompletionStatusManually**](docs/MoodleApi.md#coreCompletionUpdateActivityCompletionStatusManually) | **POST** /core_completion_update_activity_completion_status_manually | Update completion status for the current user in an activity, only for activities with manual tracking.
*MoodleApi* | [**coreContentbankCopyContent**](docs/MoodleApi.md#coreContentbankCopyContent) | **POST** /core_contentbank_copy_content | Copy a content in the content bank.
*MoodleApi* | [**coreContentbankDeleteContent**](docs/MoodleApi.md#coreContentbankDeleteContent) | **POST** /core_contentbank_delete_content | Delete a content from the content bank.
*MoodleApi* | [**coreContentbankRenameContent**](docs/MoodleApi.md#coreContentbankRenameContent) | **POST** /core_contentbank_rename_content | Rename a content in the content bank.
*MoodleApi* | [**coreContentbankSetContentVisibility**](docs/MoodleApi.md#coreContentbankSetContentVisibility) | **POST** /core_contentbank_set_content_visibility | Set the visibility of a content in the content bank.
*MoodleApi* | [**coreCourseAddContentItemToUserFavourites**](docs/MoodleApi.md#coreCourseAddContentItemToUserFavourites) | **POST** /core_course_add_content_item_to_user_favourites | Adds a content item (activity, resource or their subtypes) to the favourites for the user.
*MoodleApi* | [**coreCourseCheckUpdates**](docs/MoodleApi.md#coreCourseCheckUpdates) | **POST** /core_course_check_updates | Check if there is updates affecting the user for the given course and contexts.
*MoodleApi* | [**coreCourseCreateCategories**](docs/MoodleApi.md#coreCourseCreateCategories) | **POST** /core_course_create_categories | Create course categories
*MoodleApi* | [**coreCourseCreateCourses**](docs/MoodleApi.md#coreCourseCreateCourses) | **POST** /core_course_create_courses | Create new courses
*MoodleApi* | [**coreCourseDeleteCategories**](docs/MoodleApi.md#coreCourseDeleteCategories) | **POST** /core_course_delete_categories | Delete course categories
*MoodleApi* | [**coreCourseDeleteCourses**](docs/MoodleApi.md#coreCourseDeleteCourses) | **POST** /core_course_delete_courses | Deletes all specified courses
*MoodleApi* | [**coreCourseDeleteModules**](docs/MoodleApi.md#coreCourseDeleteModules) | **POST** /core_course_delete_modules | Deletes all specified module instances
*MoodleApi* | [**coreCourseDuplicateCourse**](docs/MoodleApi.md#coreCourseDuplicateCourse) | **POST** /core_course_duplicate_course | Duplicate an existing course (creating a new one).
*MoodleApi* | [**coreCourseEditModule**](docs/MoodleApi.md#coreCourseEditModule) | **POST** /core_course_edit_module | Performs an action on course module (change visibility, duplicate, delete, etc.)
*MoodleApi* | [**coreCourseEditSection**](docs/MoodleApi.md#coreCourseEditSection) | **POST** /core_course_edit_section | Performs an action on course section (change visibility, set marker, delete)
*MoodleApi* | [**coreCourseGetActivityChooserFooter**](docs/MoodleApi.md#coreCourseGetActivityChooserFooter) | **POST** /core_course_get_activity_chooser_footer | Fetch the data for the activity chooser footer.
*MoodleApi* | [**coreCourseGetCategories**](docs/MoodleApi.md#coreCourseGetCategories) | **POST** /core_course_get_categories | Return category details
*MoodleApi* | [**coreCourseGetContents**](docs/MoodleApi.md#coreCourseGetContents) | **POST** /core_course_get_contents | Get course contents
*MoodleApi* | [**coreCourseGetCourseContentItems**](docs/MoodleApi.md#coreCourseGetCourseContentItems) | **POST** /core_course_get_course_content_items | Fetch all the content items (activities, resources and their subtypes) for the activity picker
*MoodleApi* | [**coreCourseGetCourseModule**](docs/MoodleApi.md#coreCourseGetCourseModule) | **POST** /core_course_get_course_module | Return information about a course module
*MoodleApi* | [**coreCourseGetCourseModuleByInstance**](docs/MoodleApi.md#coreCourseGetCourseModuleByInstance) | **POST** /core_course_get_course_module_by_instance | Return information about a given module name and instance id
*MoodleApi* | [**coreCourseGetCourses**](docs/MoodleApi.md#coreCourseGetCourses) | **POST** /core_course_get_courses | Return course details
*MoodleApi* | [**coreCourseGetCoursesByField**](docs/MoodleApi.md#coreCourseGetCoursesByField) | **POST** /core_course_get_courses_by_field | Get courses matching a specific field (id/s, shortname, idnumber, category)
*MoodleApi* | [**coreCourseGetEnrolledCoursesByTimelineClassification**](docs/MoodleApi.md#coreCourseGetEnrolledCoursesByTimelineClassification) | **POST** /core_course_get_enrolled_courses_by_timeline_classification | List of enrolled courses for the given timeline classification (past, inprogress, or future).
*MoodleApi* | [**coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification**](docs/MoodleApi.md#coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification) | **POST** /core_course_get_enrolled_courses_with_action_events_by_timeline_classification | List of enrolled courses with action events in a given timeframe, for the given timeline classification.
*MoodleApi* | [**coreCourseGetEnrolledUsersByCmid**](docs/MoodleApi.md#coreCourseGetEnrolledUsersByCmid) | **POST** /core_course_get_enrolled_users_by_cmid | List users by course module id, filter by group and active enrolment status.
*MoodleApi* | [**coreCourseGetModule**](docs/MoodleApi.md#coreCourseGetModule) | **POST** /core_course_get_module | Returns html with one activity module on course page
*MoodleApi* | [**coreCourseGetRecentCourses**](docs/MoodleApi.md#coreCourseGetRecentCourses) | **POST** /core_course_get_recent_courses | List of courses a user has accessed most recently.
*MoodleApi* | [**coreCourseGetUpdatesSince**](docs/MoodleApi.md#coreCourseGetUpdatesSince) | **POST** /core_course_get_updates_since | Check if there are updates affecting the user for the given course since the given time stamp.
*MoodleApi* | [**coreCourseGetUserAdministrationOptions**](docs/MoodleApi.md#coreCourseGetUserAdministrationOptions) | **POST** /core_course_get_user_administration_options | Return a list of administration options in a set of courses that are avaialable or not for the current                             user.
*MoodleApi* | [**coreCourseGetUserNavigationOptions**](docs/MoodleApi.md#coreCourseGetUserNavigationOptions) | **POST** /core_course_get_user_navigation_options | Return a list of navigation options in a set of courses that are avaialable or not for the current user.
*MoodleApi* | [**coreCourseImportCourse**](docs/MoodleApi.md#coreCourseImportCourse) | **POST** /core_course_import_course | Import course data from a course into another course. Does not include any user data.
*MoodleApi* | [**coreCourseRemoveContentItemFromUserFavourites**](docs/MoodleApi.md#coreCourseRemoveContentItemFromUserFavourites) | **POST** /core_course_remove_content_item_from_user_favourites | Removes a content item (activity, resource or their subtypes) from the favourites for the user.
*MoodleApi* | [**coreCourseSearchCourses**](docs/MoodleApi.md#coreCourseSearchCourses) | **POST** /core_course_search_courses | Search courses by (name, module, block, tag)
*MoodleApi* | [**coreCourseSetFavouriteCourses**](docs/MoodleApi.md#coreCourseSetFavouriteCourses) | **POST** /core_course_set_favourite_courses | Add a list of courses to the list of favourite courses.
*MoodleApi* | [**coreCourseToggleActivityRecommendation**](docs/MoodleApi.md#coreCourseToggleActivityRecommendation) | **POST** /core_course_toggle_activity_recommendation | Adds or removes an activity as a recommendation in the activity chooser.
*MoodleApi* | [**coreCourseUpdateCategories**](docs/MoodleApi.md#coreCourseUpdateCategories) | **POST** /core_course_update_categories | Update categories
*MoodleApi* | [**coreCourseUpdateCourses**](docs/MoodleApi.md#coreCourseUpdateCourses) | **POST** /core_course_update_courses | Update courses
*MoodleApi* | [**coreCourseViewCourse**](docs/MoodleApi.md#coreCourseViewCourse) | **POST** /core_course_view_course | Log that the course was viewed
*MoodleApi* | [**coreCourseformatFileHandlers**](docs/MoodleApi.md#coreCourseformatFileHandlers) | **POST** /core_courseformat_file_handlers | Get the current course file hanlders.
*MoodleApi* | [**coreCourseformatGetState**](docs/MoodleApi.md#coreCourseformatGetState) | **POST** /core_courseformat_get_state | Get the current course state.
*MoodleApi* | [**coreCourseformatUpdateCourse**](docs/MoodleApi.md#coreCourseformatUpdateCourse) | **POST** /core_courseformat_update_course | Update course contents.
*MoodleApi* | [**coreCreateUserfeedbackActionRecord**](docs/MoodleApi.md#coreCreateUserfeedbackActionRecord) | **POST** /core_create_userfeedback_action_record | Record the action that the user takes in the user feedback notification for future use.
*MoodleApi* | [**coreCustomfieldCreateCategory**](docs/MoodleApi.md#coreCustomfieldCreateCategory) | **POST** /core_customfield_create_category | Creates a new category
*MoodleApi* | [**coreCustomfieldDeleteCategory**](docs/MoodleApi.md#coreCustomfieldDeleteCategory) | **POST** /core_customfield_delete_category | Deletes a category
*MoodleApi* | [**coreCustomfieldDeleteField**](docs/MoodleApi.md#coreCustomfieldDeleteField) | **POST** /core_customfield_delete_field | Deletes an entry
*MoodleApi* | [**coreCustomfieldMoveCategory**](docs/MoodleApi.md#coreCustomfieldMoveCategory) | **POST** /core_customfield_move_category | Drag and drop categories
*MoodleApi* | [**coreCustomfieldMoveField**](docs/MoodleApi.md#coreCustomfieldMoveField) | **POST** /core_customfield_move_field | Drag and drop
*MoodleApi* | [**coreCustomfieldReloadTemplate**](docs/MoodleApi.md#coreCustomfieldReloadTemplate) | **POST** /core_customfield_reload_template | Reloads template
*MoodleApi* | [**coreDynamicTabsGetContent**](docs/MoodleApi.md#coreDynamicTabsGetContent) | **POST** /core_dynamic_tabs_get_content | Returns the content for a dynamic tab
*MoodleApi* | [**coreEnrolGetCourseEnrolmentMethods**](docs/MoodleApi.md#coreEnrolGetCourseEnrolmentMethods) | **POST** /core_enrol_get_course_enrolment_methods | Get the list of course enrolment methods
*MoodleApi* | [**coreEnrolGetEnrolledUsers**](docs/MoodleApi.md#coreEnrolGetEnrolledUsers) | **POST** /core_enrol_get_enrolled_users | Get enrolled users by course id.
*MoodleApi* | [**coreEnrolGetEnrolledUsersWithCapability**](docs/MoodleApi.md#coreEnrolGetEnrolledUsersWithCapability) | **POST** /core_enrol_get_enrolled_users_with_capability | For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability
*MoodleApi* | [**coreEnrolGetPotentialUsers**](docs/MoodleApi.md#coreEnrolGetPotentialUsers) | **POST** /core_enrol_get_potential_users | Get the list of potential users to enrol
*MoodleApi* | [**coreEnrolGetUsersCourses**](docs/MoodleApi.md#coreEnrolGetUsersCourses) | **POST** /core_enrol_get_users_courses | Get the list of courses where a user is enrolled in
*MoodleApi* | [**coreEnrolSearchUsers**](docs/MoodleApi.md#coreEnrolSearchUsers) | **POST** /core_enrol_search_users | Search within the list of course participants
*MoodleApi* | [**coreEnrolSubmitUserEnrolmentForm**](docs/MoodleApi.md#coreEnrolSubmitUserEnrolmentForm) | **POST** /core_enrol_submit_user_enrolment_form | Submit form data for enrolment form
*MoodleApi* | [**coreEnrolUnenrolUserEnrolment**](docs/MoodleApi.md#coreEnrolUnenrolUserEnrolment) | **POST** /core_enrol_unenrol_user_enrolment | External function that unenrols a given user enrolment
*MoodleApi* | [**coreFetchNotifications**](docs/MoodleApi.md#coreFetchNotifications) | **POST** /core_fetch_notifications | Return a list of notifications for the current session
*MoodleApi* | [**coreFilesDeleteDraftFiles**](docs/MoodleApi.md#coreFilesDeleteDraftFiles) | **POST** /core_files_delete_draft_files | Delete the indicated files (or directories) from a user draft file area.
*MoodleApi* | [**coreFilesGetFiles**](docs/MoodleApi.md#coreFilesGetFiles) | **POST** /core_files_get_files | browse moodle files
*MoodleApi* | [**coreFilesGetUnusedDraftItemid**](docs/MoodleApi.md#coreFilesGetUnusedDraftItemid) | **POST** /core_files_get_unused_draft_itemid | Generate a new draft itemid for the current user.
*MoodleApi* | [**coreFilesUpload**](docs/MoodleApi.md#coreFilesUpload) | **POST** /core_files_upload | upload a file to moodle
*MoodleApi* | [**coreFiltersGetAvailableInContext**](docs/MoodleApi.md#coreFiltersGetAvailableInContext) | **POST** /core_filters_get_available_in_context | Returns the filters available in the given contexts.
*MoodleApi* | [**coreFormDynamicForm**](docs/MoodleApi.md#coreFormDynamicForm) | **POST** /core_form_dynamic_form | Process submission of a dynamic (modal) form
*MoodleApi* | [**coreFormGetFiletypesBrowserData**](docs/MoodleApi.md#coreFormGetFiletypesBrowserData) | **POST** /core_form_get_filetypes_browser_data | Provides data for the filetypes element browser.
*MoodleApi* | [**coreGetComponentStrings**](docs/MoodleApi.md#coreGetComponentStrings) | **POST** /core_get_component_strings | Return all raw strings (with {$a-&gt;xxx}), for a specific component - similar to core get_component_strings(), call
*MoodleApi* | [**coreGetFragment**](docs/MoodleApi.md#coreGetFragment) | **POST** /core_get_fragment | Return a fragment for inclusion, such as a JavaScript page.
*MoodleApi* | [**coreGetString**](docs/MoodleApi.md#coreGetString) | **POST** /core_get_string | Return a translated string - similar to core get_string(), call
*MoodleApi* | [**coreGetStrings**](docs/MoodleApi.md#coreGetStrings) | **POST** /core_get_strings | Return some translated strings - like several core get_string(), calls
*MoodleApi* | [**coreGetUserDates**](docs/MoodleApi.md#coreGetUserDates) | **POST** /core_get_user_dates | Return formatted timestamps
*MoodleApi* | [**coreGradesCreateGradecategories**](docs/MoodleApi.md#coreGradesCreateGradecategories) | **POST** /core_grades_create_gradecategories | Create grade categories inside a course gradebook.
*MoodleApi* | [**coreGradesGetEnrolledUsersForSearchWidget**](docs/MoodleApi.md#coreGradesGetEnrolledUsersForSearchWidget) | **POST** /core_grades_get_enrolled_users_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.
*MoodleApi* | [**coreGradesGetEnrolledUsersForSelector**](docs/MoodleApi.md#coreGradesGetEnrolledUsersForSelector) | **POST** /core_grades_get_enrolled_users_for_selector | Returns the enrolled users within and map some fields to the returned array of user objects.
*MoodleApi* | [**coreGradesGetFeedback**](docs/MoodleApi.md#coreGradesGetFeedback) | **POST** /core_grades_get_feedback | Get the feedback data for a grade item
*MoodleApi* | [**coreGradesGetGradableUsers**](docs/MoodleApi.md#coreGradesGetGradableUsers) | **POST** /core_grades_get_gradable_users | Returns the gradable users in a course
*MoodleApi* | [**coreGradesGetGradeTree**](docs/MoodleApi.md#coreGradesGetGradeTree) | **POST** /core_grades_get_grade_tree | Get the grade tree structure for a course
*MoodleApi* | [**coreGradesGetGradeitems**](docs/MoodleApi.md#coreGradesGetGradeitems) | **POST** /core_grades_get_gradeitems | Get the gradeitems for a course
*MoodleApi* | [**coreGradesGetGroupsForSearchWidget**](docs/MoodleApi.md#coreGradesGetGroupsForSearchWidget) | **POST** /core_grades_get_groups_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
*MoodleApi* | [**coreGradesGetGroupsForSelector**](docs/MoodleApi.md#coreGradesGetGroupsForSelector) | **POST** /core_grades_get_groups_for_selector | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
*MoodleApi* | [**coreGradesGraderGradingpanelPointFetch**](docs/MoodleApi.md#coreGradesGraderGradingpanelPointFetch) | **POST** /core_grades_grader_gradingpanel_point_fetch | Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required
*MoodleApi* | [**coreGradesGraderGradingpanelPointStore**](docs/MoodleApi.md#coreGradesGraderGradingpanelPointStore) | **POST** /core_grades_grader_gradingpanel_point_store | Store the data required to display the grader grading panel for simple grading
*MoodleApi* | [**coreGradesGraderGradingpanelScaleFetch**](docs/MoodleApi.md#coreGradesGraderGradingpanelScaleFetch) | **POST** /core_grades_grader_gradingpanel_scale_fetch | Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required
*MoodleApi* | [**coreGradesGraderGradingpanelScaleStore**](docs/MoodleApi.md#coreGradesGraderGradingpanelScaleStore) | **POST** /core_grades_grader_gradingpanel_scale_store | Store the data required to display the grader grading panel for scale-based grading
*MoodleApi* | [**coreGradesUpdateGrades**](docs/MoodleApi.md#coreGradesUpdateGrades) | **POST** /core_grades_update_grades | Update a grade item and associated student grades.
*MoodleApi* | [**coreGradingGetDefinitions**](docs/MoodleApi.md#coreGradingGetDefinitions) | **POST** /core_grading_get_definitions | Get grading definitions
*MoodleApi* | [**coreGradingGetGradingformInstances**](docs/MoodleApi.md#coreGradingGetGradingformInstances) | **POST** /core_grading_get_gradingform_instances | Get grading form instances
*MoodleApi* | [**coreGradingSaveDefinitions**](docs/MoodleApi.md#coreGradingSaveDefinitions) | **POST** /core_grading_save_definitions | Save grading definitions
*MoodleApi* | [**coreGroupAddGroupMembers**](docs/MoodleApi.md#coreGroupAddGroupMembers) | **POST** /core_group_add_group_members | Adds group members.
*MoodleApi* | [**coreGroupAssignGrouping**](docs/MoodleApi.md#coreGroupAssignGrouping) | **POST** /core_group_assign_grouping | Assing groups from groupings
*MoodleApi* | [**coreGroupCreateGroupings**](docs/MoodleApi.md#coreGroupCreateGroupings) | **POST** /core_group_create_groupings | Creates new groupings
*MoodleApi* | [**coreGroupCreateGroups**](docs/MoodleApi.md#coreGroupCreateGroups) | **POST** /core_group_create_groups | Creates new groups.
*MoodleApi* | [**coreGroupDeleteGroupMembers**](docs/MoodleApi.md#coreGroupDeleteGroupMembers) | **POST** /core_group_delete_group_members | Deletes group members.
*MoodleApi* | [**coreGroupDeleteGroupings**](docs/MoodleApi.md#coreGroupDeleteGroupings) | **POST** /core_group_delete_groupings | Deletes all specified groupings.
*MoodleApi* | [**coreGroupDeleteGroups**](docs/MoodleApi.md#coreGroupDeleteGroups) | **POST** /core_group_delete_groups | Deletes all specified groups.
*MoodleApi* | [**coreGroupGetActivityAllowedGroups**](docs/MoodleApi.md#coreGroupGetActivityAllowedGroups) | **POST** /core_group_get_activity_allowed_groups | Gets a list of groups that the user is allowed to access within the specified activity.
*MoodleApi* | [**coreGroupGetActivityGroupmode**](docs/MoodleApi.md#coreGroupGetActivityGroupmode) | **POST** /core_group_get_activity_groupmode | Returns effective groupmode used in a given activity.
*MoodleApi* | [**coreGroupGetCourseGroupings**](docs/MoodleApi.md#coreGroupGetCourseGroupings) | **POST** /core_group_get_course_groupings | Returns all groupings in specified course.
*MoodleApi* | [**coreGroupGetCourseGroups**](docs/MoodleApi.md#coreGroupGetCourseGroups) | **POST** /core_group_get_course_groups | Returns all groups in specified course.
*MoodleApi* | [**coreGroupGetCourseUserGroups**](docs/MoodleApi.md#coreGroupGetCourseUserGroups) | **POST** /core_group_get_course_user_groups | Returns all groups in specified course for the specified user.
*MoodleApi* | [**coreGroupGetGroupMembers**](docs/MoodleApi.md#coreGroupGetGroupMembers) | **POST** /core_group_get_group_members | Returns group members.
*MoodleApi* | [**coreGroupGetGroupings**](docs/MoodleApi.md#coreGroupGetGroupings) | **POST** /core_group_get_groupings | Returns groupings details.
*MoodleApi* | [**coreGroupGetGroups**](docs/MoodleApi.md#coreGroupGetGroups) | **POST** /core_group_get_groups | Returns group details.
*MoodleApi* | [**coreGroupGetGroupsForSelector**](docs/MoodleApi.md#coreGroupGetGroupsForSelector) | **POST** /core_group_get_groups_for_selector | Get the group/(s) for a course
*MoodleApi* | [**coreGroupUnassignGrouping**](docs/MoodleApi.md#coreGroupUnassignGrouping) | **POST** /core_group_unassign_grouping | Unassing groups from groupings
*MoodleApi* | [**coreGroupUpdateGroupings**](docs/MoodleApi.md#coreGroupUpdateGroupings) | **POST** /core_group_update_groupings | Updates existing groupings
*MoodleApi* | [**coreGroupUpdateGroups**](docs/MoodleApi.md#coreGroupUpdateGroups) | **POST** /core_group_update_groups | Updates existing groups.
*MoodleApi* | [**coreH5pGetTrustedH5pFile**](docs/MoodleApi.md#coreH5pGetTrustedH5pFile) | **POST** /core_h5p_get_trusted_h5p_file | Get the H5P file cleaned for Mobile App.
*MoodleApi* | [**coreMessageBlockUser**](docs/MoodleApi.md#coreMessageBlockUser) | **POST** /core_message_block_user | Blocks a user
*MoodleApi* | [**coreMessageConfirmContactRequest**](docs/MoodleApi.md#coreMessageConfirmContactRequest) | **POST** /core_message_confirm_contact_request | Confirms a contact request
*MoodleApi* | [**coreMessageCreateContactRequest**](docs/MoodleApi.md#coreMessageCreateContactRequest) | **POST** /core_message_create_contact_request | Creates a contact request
*MoodleApi* | [**coreMessageDataForMessageareaSearchMessages**](docs/MoodleApi.md#coreMessageDataForMessageareaSearchMessages) | **POST** /core_message_data_for_messagearea_search_messages | Retrieve the template data for searching for messages
*MoodleApi* | [**coreMessageDeclineContactRequest**](docs/MoodleApi.md#coreMessageDeclineContactRequest) | **POST** /core_message_decline_contact_request | Declines a contact request
*MoodleApi* | [**coreMessageDeleteContacts**](docs/MoodleApi.md#coreMessageDeleteContacts) | **POST** /core_message_delete_contacts | Remove contacts from the contact list
*MoodleApi* | [**coreMessageDeleteConversationsById**](docs/MoodleApi.md#coreMessageDeleteConversationsById) | **POST** /core_message_delete_conversations_by_id | Deletes a list of conversations.
*MoodleApi* | [**coreMessageDeleteMessage**](docs/MoodleApi.md#coreMessageDeleteMessage) | **POST** /core_message_delete_message | Deletes a message.
*MoodleApi* | [**coreMessageDeleteMessageForAllUsers**](docs/MoodleApi.md#coreMessageDeleteMessageForAllUsers) | **POST** /core_message_delete_message_for_all_users | Deletes a message for all users.
*MoodleApi* | [**coreMessageGetBlockedUsers**](docs/MoodleApi.md#coreMessageGetBlockedUsers) | **POST** /core_message_get_blocked_users | Retrieve a list of users blocked
*MoodleApi* | [**coreMessageGetContactRequests**](docs/MoodleApi.md#coreMessageGetContactRequests) | **POST** /core_message_get_contact_requests | Returns contact requests for a user
*MoodleApi* | [**coreMessageGetConversation**](docs/MoodleApi.md#coreMessageGetConversation) | **POST** /core_message_get_conversation | Retrieve a conversation for a user
*MoodleApi* | [**coreMessageGetConversationBetweenUsers**](docs/MoodleApi.md#coreMessageGetConversationBetweenUsers) | **POST** /core_message_get_conversation_between_users | Retrieve a conversation for a user between another user
*MoodleApi* | [**coreMessageGetConversationCounts**](docs/MoodleApi.md#coreMessageGetConversationCounts) | **POST** /core_message_get_conversation_counts | Retrieve a list of conversation counts, indexed by type.
*MoodleApi* | [**coreMessageGetConversationMembers**](docs/MoodleApi.md#coreMessageGetConversationMembers) | **POST** /core_message_get_conversation_members | Retrieve a list of members in a conversation
*MoodleApi* | [**coreMessageGetConversationMessages**](docs/MoodleApi.md#coreMessageGetConversationMessages) | **POST** /core_message_get_conversation_messages | Retrieve the conversation messages and relevant member information
*MoodleApi* | [**coreMessageGetConversations**](docs/MoodleApi.md#coreMessageGetConversations) | **POST** /core_message_get_conversations | Retrieve a list of conversations for a user
*MoodleApi* | [**coreMessageGetMemberInfo**](docs/MoodleApi.md#coreMessageGetMemberInfo) | **POST** /core_message_get_member_info | Retrieve a user message profiles
*MoodleApi* | [**coreMessageGetMessageProcessor**](docs/MoodleApi.md#coreMessageGetMessageProcessor) | **POST** /core_message_get_message_processor | Get a message processor
*MoodleApi* | [**coreMessageGetMessages**](docs/MoodleApi.md#coreMessageGetMessages) | **POST** /core_message_get_messages | Retrieve a list of messages sent and received by a user (conversations, notifications or both)
*MoodleApi* | [**coreMessageGetReceivedContactRequestsCount**](docs/MoodleApi.md#coreMessageGetReceivedContactRequestsCount) | **POST** /core_message_get_received_contact_requests_count | Gets the number of received contact requests
*MoodleApi* | [**coreMessageGetSelfConversation**](docs/MoodleApi.md#coreMessageGetSelfConversation) | **POST** /core_message_get_self_conversation | Retrieve a self-conversation for a user
*MoodleApi* | [**coreMessageGetUnreadConversationCounts**](docs/MoodleApi.md#coreMessageGetUnreadConversationCounts) | **POST** /core_message_get_unread_conversation_counts | Retrieve a list of unread conversation counts, indexed by type.
*MoodleApi* | [**coreMessageGetUnreadConversationsCount**](docs/MoodleApi.md#coreMessageGetUnreadConversationsCount) | **POST** /core_message_get_unread_conversations_count | Retrieve the count of unread conversations for a given user
*MoodleApi* | [**coreMessageGetUnreadNotificationCount**](docs/MoodleApi.md#coreMessageGetUnreadNotificationCount) | **POST** /core_message_get_unread_notification_count | Get number of unread notifications.
*MoodleApi* | [**coreMessageGetUserContacts**](docs/MoodleApi.md#coreMessageGetUserContacts) | **POST** /core_message_get_user_contacts | Retrieve the contact list
*MoodleApi* | [**coreMessageGetUserMessagePreferences**](docs/MoodleApi.md#coreMessageGetUserMessagePreferences) | **POST** /core_message_get_user_message_preferences | Get the message preferences for a given user.
*MoodleApi* | [**coreMessageGetUserNotificationPreferences**](docs/MoodleApi.md#coreMessageGetUserNotificationPreferences) | **POST** /core_message_get_user_notification_preferences | Get the notification preferences for a given user.
*MoodleApi* | [**coreMessageMarkAllConversationMessagesAsRead**](docs/MoodleApi.md#coreMessageMarkAllConversationMessagesAsRead) | **POST** /core_message_mark_all_conversation_messages_as_read | Mark all conversation messages as read for a given user
*MoodleApi* | [**coreMessageMarkAllNotificationsAsRead**](docs/MoodleApi.md#coreMessageMarkAllNotificationsAsRead) | **POST** /core_message_mark_all_notifications_as_read | Mark all notifications as read for a given user
*MoodleApi* | [**coreMessageMarkMessageRead**](docs/MoodleApi.md#coreMessageMarkMessageRead) | **POST** /core_message_mark_message_read | Mark a single message as read, trigger message_viewed event.
*MoodleApi* | [**coreMessageMarkNotificationRead**](docs/MoodleApi.md#coreMessageMarkNotificationRead) | **POST** /core_message_mark_notification_read | Mark a single notification as read, trigger notification_viewed event.
*MoodleApi* | [**coreMessageMessageProcessorConfigForm**](docs/MoodleApi.md#coreMessageMessageProcessorConfigForm) | **POST** /core_message_message_processor_config_form | Process the message processor config form
*MoodleApi* | [**coreMessageMessageSearchUsers**](docs/MoodleApi.md#coreMessageMessageSearchUsers) | **POST** /core_message_message_search_users | Retrieve the data for searching for people
*MoodleApi* | [**coreMessageMuteConversations**](docs/MoodleApi.md#coreMessageMuteConversations) | **POST** /core_message_mute_conversations | Mutes a list of conversations
*MoodleApi* | [**coreMessageSearchContacts**](docs/MoodleApi.md#coreMessageSearchContacts) | **POST** /core_message_search_contacts | Search for contacts
*MoodleApi* | [**coreMessageSendInstantMessages**](docs/MoodleApi.md#coreMessageSendInstantMessages) | **POST** /core_message_send_instant_messages | Send instant messages
*MoodleApi* | [**coreMessageSendMessagesToConversation**](docs/MoodleApi.md#coreMessageSendMessagesToConversation) | **POST** /core_message_send_messages_to_conversation | Send messages to an existing conversation between users
*MoodleApi* | [**coreMessageSetFavouriteConversations**](docs/MoodleApi.md#coreMessageSetFavouriteConversations) | **POST** /core_message_set_favourite_conversations | Mark a conversation or group of conversations as favourites/starred conversations.
*MoodleApi* | [**coreMessageUnblockUser**](docs/MoodleApi.md#coreMessageUnblockUser) | **POST** /core_message_unblock_user | Unblocks a user
*MoodleApi* | [**coreMessageUnmuteConversations**](docs/MoodleApi.md#coreMessageUnmuteConversations) | **POST** /core_message_unmute_conversations | Unmutes a list of conversations
*MoodleApi* | [**coreMessageUnsetFavouriteConversations**](docs/MoodleApi.md#coreMessageUnsetFavouriteConversations) | **POST** /core_message_unset_favourite_conversations | Unset a conversation or group of conversations as favourites/starred conversations.
*MoodleApi* | [**coreMoodlenetAuthCheck**](docs/MoodleApi.md#coreMoodlenetAuthCheck) | **POST** /core_moodlenet_auth_check | Check a user has authorized for a given MoodleNet site
*MoodleApi* | [**coreMoodlenetGetShareInfoActivity**](docs/MoodleApi.md#coreMoodlenetGetShareInfoActivity) | **POST** /core_moodlenet_get_share_info_activity | Get information about an activity being shared
*MoodleApi* | [**coreMoodlenetGetSharedCourseInfo**](docs/MoodleApi.md#coreMoodlenetGetSharedCourseInfo) | **POST** /core_moodlenet_get_shared_course_info | Get information about an course being shared
*MoodleApi* | [**coreMoodlenetSendActivity**](docs/MoodleApi.md#coreMoodlenetSendActivity) | **POST** /core_moodlenet_send_activity | Send activity to MoodleNet
*MoodleApi* | [**coreMoodlenetSendCourse**](docs/MoodleApi.md#coreMoodlenetSendCourse) | **POST** /core_moodlenet_send_course | Send course to MoodleNet
*MoodleApi* | [**coreMyViewPage**](docs/MoodleApi.md#coreMyViewPage) | **POST** /core_my_view_page | Trigger the My or Dashboard viewed event.
*MoodleApi* | [**coreNotesCreateNotes**](docs/MoodleApi.md#coreNotesCreateNotes) | **POST** /core_notes_create_notes | Create notes
*MoodleApi* | [**coreNotesDeleteNotes**](docs/MoodleApi.md#coreNotesDeleteNotes) | **POST** /core_notes_delete_notes | Delete notes
*MoodleApi* | [**coreNotesGetCourseNotes**](docs/MoodleApi.md#coreNotesGetCourseNotes) | **POST** /core_notes_get_course_notes | Returns all notes in specified course (or site), for the specified user.
*MoodleApi* | [**coreNotesGetNotes**](docs/MoodleApi.md#coreNotesGetNotes) | **POST** /core_notes_get_notes | Get notes
*MoodleApi* | [**coreNotesUpdateNotes**](docs/MoodleApi.md#coreNotesUpdateNotes) | **POST** /core_notes_update_notes | Update notes
*MoodleApi* | [**coreNotesViewNotes**](docs/MoodleApi.md#coreNotesViewNotes) | **POST** /core_notes_view_notes | Simulates the web interface view of notes/index.php: trigger events.
*MoodleApi* | [**coreOutputLoadFontawesomeIconMap**](docs/MoodleApi.md#coreOutputLoadFontawesomeIconMap) | **POST** /core_output_load_fontawesome_icon_map | Load the mapping of names to icons
*MoodleApi* | [**coreOutputLoadFontawesomeIconSystemMap**](docs/MoodleApi.md#coreOutputLoadFontawesomeIconSystemMap) | **POST** /core_output_load_fontawesome_icon_system_map | Load the mapping of moodle pix names to fontawesome icon names
*MoodleApi* | [**coreOutputLoadTemplate**](docs/MoodleApi.md#coreOutputLoadTemplate) | **POST** /core_output_load_template | Load a template for a renderable
*MoodleApi* | [**coreOutputLoadTemplateWithDependencies**](docs/MoodleApi.md#coreOutputLoadTemplateWithDependencies) | **POST** /core_output_load_template_with_dependencies | Load a template and its dependencies for a renderable
*MoodleApi* | [**corePaymentGetAvailableGateways**](docs/MoodleApi.md#corePaymentGetAvailableGateways) | **POST** /core_payment_get_available_gateways | Get the list of payment gateways that support the given component/area
*MoodleApi* | [**coreQuestionGetRandomQuestionSummaries**](docs/MoodleApi.md#coreQuestionGetRandomQuestionSummaries) | **POST** /core_question_get_random_question_summaries | Get the random question set for a criteria
*MoodleApi* | [**coreQuestionSubmitTagsForm**](docs/MoodleApi.md#coreQuestionSubmitTagsForm) | **POST** /core_question_submit_tags_form | Update the question tags.
*MoodleApi* | [**coreQuestionUpdateFlag**](docs/MoodleApi.md#coreQuestionUpdateFlag) | **POST** /core_question_update_flag | Update the flag state of a question attempt.
*MoodleApi* | [**coreRatingAddRating**](docs/MoodleApi.md#coreRatingAddRating) | **POST** /core_rating_add_rating | Rates an item.
*MoodleApi* | [**coreRatingGetItemRatings**](docs/MoodleApi.md#coreRatingGetItemRatings) | **POST** /core_rating_get_item_ratings | Retrieve all the ratings for an item.
*MoodleApi* | [**coreReportbuilderAudiencesDelete**](docs/MoodleApi.md#coreReportbuilderAudiencesDelete) | **POST** /core_reportbuilder_audiences_delete | Delete audience from report
*MoodleApi* | [**coreReportbuilderCanViewSystemReport**](docs/MoodleApi.md#coreReportbuilderCanViewSystemReport) | **POST** /core_reportbuilder_can_view_system_report | Determine access to a system report
*MoodleApi* | [**coreReportbuilderColumnsAdd**](docs/MoodleApi.md#coreReportbuilderColumnsAdd) | **POST** /core_reportbuilder_columns_add | Add column to report
*MoodleApi* | [**coreReportbuilderColumnsDelete**](docs/MoodleApi.md#coreReportbuilderColumnsDelete) | **POST** /core_reportbuilder_columns_delete | Delete column from report
*MoodleApi* | [**coreReportbuilderColumnsReorder**](docs/MoodleApi.md#coreReportbuilderColumnsReorder) | **POST** /core_reportbuilder_columns_reorder | Re-order column within report
*MoodleApi* | [**coreReportbuilderColumnsSortGet**](docs/MoodleApi.md#coreReportbuilderColumnsSortGet) | **POST** /core_reportbuilder_columns_sort_get | Retrieve column sorting for report
*MoodleApi* | [**coreReportbuilderColumnsSortReorder**](docs/MoodleApi.md#coreReportbuilderColumnsSortReorder) | **POST** /core_reportbuilder_columns_sort_reorder | Re-order column sorting within report
*MoodleApi* | [**coreReportbuilderColumnsSortToggle**](docs/MoodleApi.md#coreReportbuilderColumnsSortToggle) | **POST** /core_reportbuilder_columns_sort_toggle | Toggle sorting of column within report
*MoodleApi* | [**coreReportbuilderConditionsAdd**](docs/MoodleApi.md#coreReportbuilderConditionsAdd) | **POST** /core_reportbuilder_conditions_add | Add condition to report
*MoodleApi* | [**coreReportbuilderConditionsDelete**](docs/MoodleApi.md#coreReportbuilderConditionsDelete) | **POST** /core_reportbuilder_conditions_delete | Delete condition from report
*MoodleApi* | [**coreReportbuilderConditionsReorder**](docs/MoodleApi.md#coreReportbuilderConditionsReorder) | **POST** /core_reportbuilder_conditions_reorder | Re-order condition within report
*MoodleApi* | [**coreReportbuilderConditionsReset**](docs/MoodleApi.md#coreReportbuilderConditionsReset) | **POST** /core_reportbuilder_conditions_reset | Reset conditions for given report
*MoodleApi* | [**coreReportbuilderFiltersAdd**](docs/MoodleApi.md#coreReportbuilderFiltersAdd) | **POST** /core_reportbuilder_filters_add | Add filter to report
*MoodleApi* | [**coreReportbuilderFiltersDelete**](docs/MoodleApi.md#coreReportbuilderFiltersDelete) | **POST** /core_reportbuilder_filters_delete | Delete filter from report
*MoodleApi* | [**coreReportbuilderFiltersReorder**](docs/MoodleApi.md#coreReportbuilderFiltersReorder) | **POST** /core_reportbuilder_filters_reorder | Re-order filter within report
*MoodleApi* | [**coreReportbuilderFiltersReset**](docs/MoodleApi.md#coreReportbuilderFiltersReset) | **POST** /core_reportbuilder_filters_reset | Reset filters for given report
*MoodleApi* | [**coreReportbuilderListReports**](docs/MoodleApi.md#coreReportbuilderListReports) | **POST** /core_reportbuilder_list_reports | List custom reports for current user
*MoodleApi* | [**coreReportbuilderReportsDelete**](docs/MoodleApi.md#coreReportbuilderReportsDelete) | **POST** /core_reportbuilder_reports_delete | Delete report
*MoodleApi* | [**coreReportbuilderReportsGet**](docs/MoodleApi.md#coreReportbuilderReportsGet) | **POST** /core_reportbuilder_reports_get | Get custom report
*MoodleApi* | [**coreReportbuilderRetrieveReport**](docs/MoodleApi.md#coreReportbuilderRetrieveReport) | **POST** /core_reportbuilder_retrieve_report | Retrieve custom report content
*MoodleApi* | [**coreReportbuilderRetrieveSystemReport**](docs/MoodleApi.md#coreReportbuilderRetrieveSystemReport) | **POST** /core_reportbuilder_retrieve_system_report | Retrieve system report content
*MoodleApi* | [**coreReportbuilderSchedulesDelete**](docs/MoodleApi.md#coreReportbuilderSchedulesDelete) | **POST** /core_reportbuilder_schedules_delete | Delete schedule from report
*MoodleApi* | [**coreReportbuilderSchedulesSend**](docs/MoodleApi.md#coreReportbuilderSchedulesSend) | **POST** /core_reportbuilder_schedules_send | Send report schedule
*MoodleApi* | [**coreReportbuilderSchedulesToggle**](docs/MoodleApi.md#coreReportbuilderSchedulesToggle) | **POST** /core_reportbuilder_schedules_toggle | Toggle state of report schedule
*MoodleApi* | [**coreReportbuilderSetFilters**](docs/MoodleApi.md#coreReportbuilderSetFilters) | **POST** /core_reportbuilder_set_filters | Set filter values for given report
*MoodleApi* | [**coreReportbuilderViewReport**](docs/MoodleApi.md#coreReportbuilderViewReport) | **POST** /core_reportbuilder_view_report | Trigger custom report viewed
*MoodleApi* | [**coreRoleAssignRoles**](docs/MoodleApi.md#coreRoleAssignRoles) | **POST** /core_role_assign_roles | Manual role assignments.
*MoodleApi* | [**coreRoleUnassignRoles**](docs/MoodleApi.md#coreRoleUnassignRoles) | **POST** /core_role_unassign_roles | Manual role unassignments.
*MoodleApi* | [**coreSearchGetRelevantUsers**](docs/MoodleApi.md#coreSearchGetRelevantUsers) | **POST** /core_search_get_relevant_users | Gets relevant users for a search request.
*MoodleApi* | [**coreSearchGetResults**](docs/MoodleApi.md#coreSearchGetResults) | **POST** /core_search_get_results | Get search results.
*MoodleApi* | [**coreSearchGetSearchAreasList**](docs/MoodleApi.md#coreSearchGetSearchAreasList) | **POST** /core_search_get_search_areas_list | Get search areas.
*MoodleApi* | [**coreSearchGetTopResults**](docs/MoodleApi.md#coreSearchGetTopResults) | **POST** /core_search_get_top_results | Get top search results.
*MoodleApi* | [**coreSearchViewResults**](docs/MoodleApi.md#coreSearchViewResults) | **POST** /core_search_view_results | Trigger view search results event.
*MoodleApi* | [**coreSessionTimeRemaining**](docs/MoodleApi.md#coreSessionTimeRemaining) | **POST** /core_session_time_remaining | Count the seconds remaining in this session
*MoodleApi* | [**coreSessionTouch**](docs/MoodleApi.md#coreSessionTouch) | **POST** /core_session_touch | Keep the users session alive
*MoodleApi* | [**coreTableGetDynamicTableContent**](docs/MoodleApi.md#coreTableGetDynamicTableContent) | **POST** /core_table_get_dynamic_table_content | Get the dynamic table content raw html
*MoodleApi* | [**coreTagGetTagAreas**](docs/MoodleApi.md#coreTagGetTagAreas) | **POST** /core_tag_get_tag_areas | Retrieves existing tag areas.
*MoodleApi* | [**coreTagGetTagCloud**](docs/MoodleApi.md#coreTagGetTagCloud) | **POST** /core_tag_get_tag_cloud | Retrieves a tag cloud for the given collection and/or query search.
*MoodleApi* | [**coreTagGetTagCollections**](docs/MoodleApi.md#coreTagGetTagCollections) | **POST** /core_tag_get_tag_collections | Retrieves existing tag collections.
*MoodleApi* | [**coreTagGetTagindex**](docs/MoodleApi.md#coreTagGetTagindex) | **POST** /core_tag_get_tagindex | Gets tag index page for one tag and one tag area
*MoodleApi* | [**coreTagGetTagindexPerArea**](docs/MoodleApi.md#coreTagGetTagindexPerArea) | **POST** /core_tag_get_tagindex_per_area | Gets tag index page per different areas.
*MoodleApi* | [**coreTagGetTags**](docs/MoodleApi.md#coreTagGetTags) | **POST** /core_tag_get_tags | Gets tags by their ids
*MoodleApi* | [**coreTagUpdateTags**](docs/MoodleApi.md#coreTagUpdateTags) | **POST** /core_tag_update_tags | Updates tags
*MoodleApi* | [**coreUpdateInplaceEditable**](docs/MoodleApi.md#coreUpdateInplaceEditable) | **POST** /core_update_inplace_editable | Generic service to update title
*MoodleApi* | [**coreUserAddUserDevice**](docs/MoodleApi.md#coreUserAddUserDevice) | **POST** /core_user_add_user_device | Store mobile user devices information for PUSH Notifications.
*MoodleApi* | [**coreUserAddUserPrivateFiles**](docs/MoodleApi.md#coreUserAddUserPrivateFiles) | **POST** /core_user_add_user_private_files | Copy files from a draft area to users private files area.
*MoodleApi* | [**coreUserAgreeSitePolicy**](docs/MoodleApi.md#coreUserAgreeSitePolicy) | **POST** /core_user_agree_site_policy | Agree the site policy for the current user.
*MoodleApi* | [**coreUserCreateUsers**](docs/MoodleApi.md#coreUserCreateUsers) | **POST** /core_user_create_users | Create users.
*MoodleApi* | [**coreUserDeleteUsers**](docs/MoodleApi.md#coreUserDeleteUsers) | **POST** /core_user_delete_users | Delete users.
*MoodleApi* | [**coreUserGetCourseUserProfiles**](docs/MoodleApi.md#coreUserGetCourseUserProfiles) | **POST** /core_user_get_course_user_profiles | Get course user profiles (each of the profils matching a course id and a user id),.
*MoodleApi* | [**coreUserGetPrivateFilesInfo**](docs/MoodleApi.md#coreUserGetPrivateFilesInfo) | **POST** /core_user_get_private_files_info | Returns general information about files in the user private files area.
*MoodleApi* | [**coreUserGetUserPreferences**](docs/MoodleApi.md#coreUserGetUserPreferences) | **POST** /core_user_get_user_preferences | Return user preferences.
*MoodleApi* | [**coreUserGetUsers**](docs/MoodleApi.md#coreUserGetUsers) | **POST** /core_user_get_users | search for users matching the parameters
*MoodleApi* | [**coreUserGetUsersByField**](docs/MoodleApi.md#coreUserGetUsersByField) | **POST** /core_user_get_users_by_field | Retrieve users&#39; information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().
*MoodleApi* | [**coreUserRemoveUserDevice**](docs/MoodleApi.md#coreUserRemoveUserDevice) | **POST** /core_user_remove_user_device | Remove a user device from the Moodle database.
*MoodleApi* | [**coreUserSearchIdentity**](docs/MoodleApi.md#coreUserSearchIdentity) | **POST** /core_user_search_identity | Return list of users identities matching the given criteria in their name or other identity fields.
*MoodleApi* | [**coreUserSetUserPreferences**](docs/MoodleApi.md#coreUserSetUserPreferences) | **POST** /core_user_set_user_preferences | Set user preferences.
*MoodleApi* | [**coreUserUpdatePicture**](docs/MoodleApi.md#coreUserUpdatePicture) | **POST** /core_user_update_picture | Update or delete the user picture in the site
*MoodleApi* | [**coreUserUpdateUserDevicePublicKey**](docs/MoodleApi.md#coreUserUpdateUserDevicePublicKey) | **POST** /core_user_update_user_device_public_key | Store mobile user public key.
*MoodleApi* | [**coreUserUpdateUserPreferences**](docs/MoodleApi.md#coreUserUpdateUserPreferences) | **POST** /core_user_update_user_preferences | Update a user&#39;s preferences
*MoodleApi* | [**coreUserUpdateUsers**](docs/MoodleApi.md#coreUserUpdateUsers) | **POST** /core_user_update_users | Update users.
*MoodleApi* | [**coreUserViewUserList**](docs/MoodleApi.md#coreUserViewUserList) | **POST** /core_user_view_user_list | Simulates the web-interface view of user/index.php (triggering events),.
*MoodleApi* | [**coreUserViewUserProfile**](docs/MoodleApi.md#coreUserViewUserProfile) | **POST** /core_user_view_user_profile | Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.
*MoodleApi* | [**coreWebserviceGetSiteInfo**](docs/MoodleApi.md#coreWebserviceGetSiteInfo) | **POST** /core_webservice_get_site_info | Return some site info / user info / list web service functions
*MoodleApi* | [**coreXapiDeleteState**](docs/MoodleApi.md#coreXapiDeleteState) | **POST** /core_xapi_delete_state | Delete an xAPI state data from an activityId.
*MoodleApi* | [**coreXapiDeleteStates**](docs/MoodleApi.md#coreXapiDeleteStates) | **POST** /core_xapi_delete_states | Delete all xAPI state data from an activityId.
*MoodleApi* | [**coreXapiGetState**](docs/MoodleApi.md#coreXapiGetState) | **POST** /core_xapi_get_state | Get an xAPI state data from an activityId.
*MoodleApi* | [**coreXapiGetStates**](docs/MoodleApi.md#coreXapiGetStates) | **POST** /core_xapi_get_states | Get all state ID from an activityId.
*MoodleApi* | [**coreXapiPostState**](docs/MoodleApi.md#coreXapiPostState) | **POST** /core_xapi_post_state | Post an xAPI state into an activityId.
*MoodleApi* | [**coreXapiStatementPost**](docs/MoodleApi.md#coreXapiStatementPost) | **POST** /core_xapi_statement_post | Post an xAPI statement.
*PaygwPaypalApi* | [**paygwPaypalCreateTransactionComplete**](docs/PaygwPaypalApi.md#paygwPaypalCreateTransactionComplete) | **POST** /paygw_paypal_create_transaction_complete | Takes care of what needs to be done when a PayPal transaction comes back as complete.
*PaygwPaypalApi* | [**paygwPaypalGetConfigForJs**](docs/PaygwPaypalApi.md#paygwPaypalGetConfigForJs) | **POST** /paygw_paypal_get_config_for_js | Returns the configuration settings to be used in js
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetColumnSize**](docs/QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnSize) | **POST** /qbank_columnsortorder_set_column_size | Column size
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetColumnbankOrder**](docs/QbankColumnsortorderApi.md#qbankColumnsortorderSetColumnbankOrder) | **POST** /qbank_columnsortorder_set_columnbank_order | Sets question columns order in database
*QbankColumnsortorderApi* | [**qbankColumnsortorderSetHiddenColumns**](docs/QbankColumnsortorderApi.md#qbankColumnsortorderSetHiddenColumns) | **POST** /qbank_columnsortorder_set_hidden_columns | Hidden Columns
*QbankEditquestionApi* | [**qbankEditquestionSetStatus**](docs/QbankEditquestionApi.md#qbankEditquestionSetStatus) | **POST** /qbank_editquestion_set_status | Update the question status.
*QbankTagquestionApi* | [**qbankTagquestionSubmitTagsForm**](docs/QbankTagquestionApi.md#qbankTagquestionSubmitTagsForm) | **POST** /qbank_tagquestion_submit_tags_form | Update the question tags.
*QbankViewquestiontextApi* | [**qbankViewquestiontextSetQuestionTextFormat**](docs/QbankViewquestiontextApi.md#qbankViewquestiontextSetQuestionTextFormat) | **POST** /qbank_viewquestiontext_set_question_text_format | Sets the preference for displaying and formatting the question text
*QuizaccessSebApi* | [**quizaccessSebValidateQuizKeys**](docs/QuizaccessSebApi.md#quizaccessSebValidateQuizKeys) | **POST** /quizaccess_seb_validate_quiz_keys | Validate a Safe Exam Browser config key or a browser exam key.
*ReportCompetencyApi* | [**reportCompetencyDataForReport**](docs/ReportCompetencyApi.md#reportCompetencyDataForReport) | **POST** /report_competency_data_for_report | Load the data for the competency report in a course.
*ReportInsightsApi* | [**reportInsightsActionExecuted**](docs/ReportInsightsApi.md#reportInsightsActionExecuted) | **POST** /report_insights_action_executed | Stores an action executed over a group of predictions.
*ReportInsightsApi* | [**reportInsightsSetFixedPrediction**](docs/ReportInsightsApi.md#reportInsightsSetFixedPrediction) | **POST** /report_insights_set_fixed_prediction | Flags a prediction as fixed.
*ReportInsightsApi* | [**reportInsightsSetNotusefulPrediction**](docs/ReportInsightsApi.md#reportInsightsSetNotusefulPrediction) | **POST** /report_insights_set_notuseful_prediction | Flags the prediction as not useful.
*TinyAutosaveApi* | [**tinyAutosaveResetSession**](docs/TinyAutosaveApi.md#tinyAutosaveResetSession) | **POST** /tiny_autosave_reset_session | Reset an autosave session
*TinyAutosaveApi* | [**tinyAutosaveResumeSession**](docs/TinyAutosaveApi.md#tinyAutosaveResumeSession) | **POST** /tiny_autosave_resume_session | Resume an autosave session
*TinyAutosaveApi* | [**tinyAutosaveUpdateSession**](docs/TinyAutosaveApi.md#tinyAutosaveUpdateSession) | **POST** /tiny_autosave_update_session | Update an autosave session
*TinyEquationApi* | [**tinyEquationFilter**](docs/TinyEquationApi.md#tinyEquationFilter) | **POST** /tiny_equation_filter | Filter the equation
*TinyPremiumApi* | [**tinyPremiumGetApiKey**](docs/TinyPremiumApi.md#tinyPremiumGetApiKey) | **POST** /tiny_premium_get_api_key | Get the Tiny Premium API key from Moodle
*ToolAnalyticsApi* | [**toolAnalyticsPotentialContexts**](docs/ToolAnalyticsApi.md#toolAnalyticsPotentialContexts) | **POST** /tool_analytics_potential_contexts | Retrieve the list of potential contexts for a model.
*ToolBehatApi* | [**toolBehatGetEntityGenerator**](docs/ToolBehatApi.md#toolBehatGetEntityGenerator) | **POST** /tool_behat_get_entity_generator | Get the generator details for an entity
*ToolDataprivacyApi* | [**toolDataprivacyApproveDataRequest**](docs/ToolDataprivacyApi.md#toolDataprivacyApproveDataRequest) | **POST** /tool_dataprivacy_approve_data_request | Approve a data request
*ToolDataprivacyApi* | [**toolDataprivacyBulkApproveDataRequests**](docs/ToolDataprivacyApi.md#toolDataprivacyBulkApproveDataRequests) | **POST** /tool_dataprivacy_bulk_approve_data_requests | Bulk approve data requests
*ToolDataprivacyApi* | [**toolDataprivacyBulkDenyDataRequests**](docs/ToolDataprivacyApi.md#toolDataprivacyBulkDenyDataRequests) | **POST** /tool_dataprivacy_bulk_deny_data_requests | Bulk deny data requests
*ToolDataprivacyApi* | [**toolDataprivacyCancelDataRequest**](docs/ToolDataprivacyApi.md#toolDataprivacyCancelDataRequest) | **POST** /tool_dataprivacy_cancel_data_request | Cancel the data request made by the user
*ToolDataprivacyApi* | [**toolDataprivacyConfirmContextsForDeletion**](docs/ToolDataprivacyApi.md#toolDataprivacyConfirmContextsForDeletion) | **POST** /tool_dataprivacy_confirm_contexts_for_deletion | Mark the selected expired contexts as confirmed for deletion
*ToolDataprivacyApi* | [**toolDataprivacyContactDpo**](docs/ToolDataprivacyApi.md#toolDataprivacyContactDpo) | **POST** /tool_dataprivacy_contact_dpo | Contact the site Data Protection Officer(s)
*ToolDataprivacyApi* | [**toolDataprivacyCreateCategoryForm**](docs/ToolDataprivacyApi.md#toolDataprivacyCreateCategoryForm) | **POST** /tool_dataprivacy_create_category_form | Adds a data category
*ToolDataprivacyApi* | [**toolDataprivacyCreatePurposeForm**](docs/ToolDataprivacyApi.md#toolDataprivacyCreatePurposeForm) | **POST** /tool_dataprivacy_create_purpose_form | Adds a data purpose
*ToolDataprivacyApi* | [**toolDataprivacyDeleteCategory**](docs/ToolDataprivacyApi.md#toolDataprivacyDeleteCategory) | **POST** /tool_dataprivacy_delete_category | Deletes an existing data category
*ToolDataprivacyApi* | [**toolDataprivacyDeletePurpose**](docs/ToolDataprivacyApi.md#toolDataprivacyDeletePurpose) | **POST** /tool_dataprivacy_delete_purpose | Deletes an existing data purpose
*ToolDataprivacyApi* | [**toolDataprivacyDenyDataRequest**](docs/ToolDataprivacyApi.md#toolDataprivacyDenyDataRequest) | **POST** /tool_dataprivacy_deny_data_request | Deny a data request
*ToolDataprivacyApi* | [**toolDataprivacyGetActivityOptions**](docs/ToolDataprivacyApi.md#toolDataprivacyGetActivityOptions) | **POST** /tool_dataprivacy_get_activity_options | Fetches a list of activity options
*ToolDataprivacyApi* | [**toolDataprivacyGetCategoryOptions**](docs/ToolDataprivacyApi.md#toolDataprivacyGetCategoryOptions) | **POST** /tool_dataprivacy_get_category_options | Fetches a list of data category options
*ToolDataprivacyApi* | [**toolDataprivacyGetDataRequest**](docs/ToolDataprivacyApi.md#toolDataprivacyGetDataRequest) | **POST** /tool_dataprivacy_get_data_request | Fetch the details of a user&#39;s data request
*ToolDataprivacyApi* | [**toolDataprivacyGetPurposeOptions**](docs/ToolDataprivacyApi.md#toolDataprivacyGetPurposeOptions) | **POST** /tool_dataprivacy_get_purpose_options | Fetches a list of data storage purpose options
*ToolDataprivacyApi* | [**toolDataprivacyGetUsers**](docs/ToolDataprivacyApi.md#toolDataprivacyGetUsers) | **POST** /tool_dataprivacy_get_users | Fetches a list of users
*ToolDataprivacyApi* | [**toolDataprivacyMarkComplete**](docs/ToolDataprivacyApi.md#toolDataprivacyMarkComplete) | **POST** /tool_dataprivacy_mark_complete | Mark a user&#39;s general enquiry as complete
*ToolDataprivacyApi* | [**toolDataprivacySetContextDefaults**](docs/ToolDataprivacyApi.md#toolDataprivacySetContextDefaults) | **POST** /tool_dataprivacy_set_context_defaults | Updates the default category and purpose for a given context level (and optionally, a plugin)
*ToolDataprivacyApi* | [**toolDataprivacySetContextForm**](docs/ToolDataprivacyApi.md#toolDataprivacySetContextForm) | **POST** /tool_dataprivacy_set_context_form | Sets purpose and category for a specific context
*ToolDataprivacyApi* | [**toolDataprivacySetContextlevelForm**](docs/ToolDataprivacyApi.md#toolDataprivacySetContextlevelForm) | **POST** /tool_dataprivacy_set_contextlevel_form | Sets purpose and category across a context level
*ToolDataprivacyApi* | [**toolDataprivacySubmitSelectedCoursesForm**](docs/ToolDataprivacyApi.md#toolDataprivacySubmitSelectedCoursesForm) | **POST** /tool_dataprivacy_submit_selected_courses_form | Save list of selected courses for export
*ToolDataprivacyApi* | [**toolDataprivacyTreeExtraBranches**](docs/ToolDataprivacyApi.md#toolDataprivacyTreeExtraBranches) | **POST** /tool_dataprivacy_tree_extra_branches | Return branches for the context tree
*ToolIomadpolicyApi* | [**toolIomadpolicyGetIomadpolicyVersion**](docs/ToolIomadpolicyApi.md#toolIomadpolicyGetIomadpolicyVersion) | **POST** /tool_iomadpolicy_get_iomadpolicy_version | Fetch the details of a iomadpolicy version
*ToolIomadpolicyApi* | [**toolIomadpolicySubmitAcceptOnBehalf**](docs/ToolIomadpolicyApi.md#toolIomadpolicySubmitAcceptOnBehalf) | **POST** /tool_iomadpolicy_submit_accept_on_behalf | Accept policies on behalf of other users
*ToolLpApi* | [**toolLpDataForCompetenciesManagePage**](docs/ToolLpApi.md#toolLpDataForCompetenciesManagePage) | **POST** /tool_lp_data_for_competencies_manage_page | Load the data for the competencies manage page template
*ToolLpApi* | [**toolLpDataForCompetencyFrameworksManagePage**](docs/ToolLpApi.md#toolLpDataForCompetencyFrameworksManagePage) | **POST** /tool_lp_data_for_competency_frameworks_manage_page | Load the data for the competency frameworks manage page template
*ToolLpApi* | [**toolLpDataForCompetencySummary**](docs/ToolLpApi.md#toolLpDataForCompetencySummary) | **POST** /tool_lp_data_for_competency_summary | Load competency data for summary template.
*ToolLpApi* | [**toolLpDataForCourseCompetenciesPage**](docs/ToolLpApi.md#toolLpDataForCourseCompetenciesPage) | **POST** /tool_lp_data_for_course_competencies_page | Load the data for the course competencies page template.
*ToolLpApi* | [**toolLpDataForPlanPage**](docs/ToolLpApi.md#toolLpDataForPlanPage) | **POST** /tool_lp_data_for_plan_page | Load the data for the plan page template.
*ToolLpApi* | [**toolLpDataForPlansPage**](docs/ToolLpApi.md#toolLpDataForPlansPage) | **POST** /tool_lp_data_for_plans_page | Load the data for the plans page template
*ToolLpApi* | [**toolLpDataForRelatedCompetenciesSection**](docs/ToolLpApi.md#toolLpDataForRelatedCompetenciesSection) | **POST** /tool_lp_data_for_related_competencies_section | Load the data for the related competencies template.
*ToolLpApi* | [**toolLpDataForTemplateCompetenciesPage**](docs/ToolLpApi.md#toolLpDataForTemplateCompetenciesPage) | **POST** /tool_lp_data_for_template_competencies_page | Load the data for the template competencies page template.
*ToolLpApi* | [**toolLpDataForTemplatesManagePage**](docs/ToolLpApi.md#toolLpDataForTemplatesManagePage) | **POST** /tool_lp_data_for_templates_manage_page | Load the data for the learning plan templates manage page template
*ToolLpApi* | [**toolLpDataForUserCompetencySummary**](docs/ToolLpApi.md#toolLpDataForUserCompetencySummary) | **POST** /tool_lp_data_for_user_competency_summary | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserCompetencySummaryInCourse**](docs/ToolLpApi.md#toolLpDataForUserCompetencySummaryInCourse) | **POST** /tool_lp_data_for_user_competency_summary_in_course | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserCompetencySummaryInPlan**](docs/ToolLpApi.md#toolLpDataForUserCompetencySummaryInPlan) | **POST** /tool_lp_data_for_user_competency_summary_in_plan | Load a summary of a user competency.
*ToolLpApi* | [**toolLpDataForUserEvidenceListPage**](docs/ToolLpApi.md#toolLpDataForUserEvidenceListPage) | **POST** /tool_lp_data_for_user_evidence_list_page | Load the data for the user evidence list page template
*ToolLpApi* | [**toolLpDataForUserEvidencePage**](docs/ToolLpApi.md#toolLpDataForUserEvidencePage) | **POST** /tool_lp_data_for_user_evidence_page | Load the data for the user evidence page template
*ToolLpApi* | [**toolLpListCoursesUsingCompetency**](docs/ToolLpApi.md#toolLpListCoursesUsingCompetency) | **POST** /tool_lp_list_courses_using_competency | List the courses using a competency
*ToolLpApi* | [**toolLpSearchCohorts**](docs/ToolLpApi.md#toolLpSearchCohorts) | **POST** /tool_lp_search_cohorts | Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
*ToolLpApi* | [**toolLpSearchUsers**](docs/ToolLpApi.md#toolLpSearchUsers) | **POST** /tool_lp_search_users | Search for users.
*ToolMobileApi* | [**toolMobileCallExternalFunctions**](docs/ToolMobileApi.md#toolMobileCallExternalFunctions) | **POST** /tool_mobile_call_external_functions | Call multiple external functions and return all responses.
*ToolMobileApi* | [**toolMobileGetAutologinKey**](docs/ToolMobileApi.md#toolMobileGetAutologinKey) | **POST** /tool_mobile_get_autologin_key | Creates an auto-login key for the current user.                             Is created only in https sites and is restricted by time, ip address and only works if the request                             comes from the Moodle mobile or desktop app.
*ToolMobileApi* | [**toolMobileGetConfig**](docs/ToolMobileApi.md#toolMobileGetConfig) | **POST** /tool_mobile_get_config | Returns a list of the site configurations, filtering by section.
*ToolMobileApi* | [**toolMobileGetContent**](docs/ToolMobileApi.md#toolMobileGetContent) | **POST** /tool_mobile_get_content | Returns a piece of content to be displayed in the Mobile app.
*ToolMobileApi* | [**toolMobileGetPluginsSupportingMobile**](docs/ToolMobileApi.md#toolMobileGetPluginsSupportingMobile) | **POST** /tool_mobile_get_plugins_supporting_mobile | Returns a list of Moodle plugins supporting the mobile app.
*ToolMobileApi* | [**toolMobileGetPublicConfig**](docs/ToolMobileApi.md#toolMobileGetPublicConfig) | **POST** /tool_mobile_get_public_config | Returns a list of the site public settings, those not requiring authentication.
*ToolMobileApi* | [**toolMobileGetTokensForQrLogin**](docs/ToolMobileApi.md#toolMobileGetTokensForQrLogin) | **POST** /tool_mobile_get_tokens_for_qr_login | Returns a WebService token (and private token) for QR login.
*ToolMobileApi* | [**toolMobileValidateSubscriptionKey**](docs/ToolMobileApi.md#toolMobileValidateSubscriptionKey) | **POST** /tool_mobile_validate_subscription_key | Check if the given site subscription key is valid.
*ToolMoodlenetApi* | [**toolMoodlenetSearchCourses**](docs/ToolMoodlenetApi.md#toolMoodlenetSearchCourses) | **POST** /tool_moodlenet_search_courses | For some given input search for a course that matches
*ToolMoodlenetApi* | [**toolMoodlenetVerifyWebfinger**](docs/ToolMoodlenetApi.md#toolMoodlenetVerifyWebfinger) | **POST** /tool_moodlenet_verify_webfinger | Verify if the passed information resolves into a WebFinger profile URL
*ToolPolicyApi* | [**toolPolicyGetPolicyVersion**](docs/ToolPolicyApi.md#toolPolicyGetPolicyVersion) | **POST** /tool_policy_get_policy_version | Fetch the details of a policy version
*ToolPolicyApi* | [**toolPolicySubmitAcceptOnBehalf**](docs/ToolPolicyApi.md#toolPolicySubmitAcceptOnBehalf) | **POST** /tool_policy_submit_accept_on_behalf | Accept policies on behalf of other users
*ToolTemplatelibraryApi* | [**toolTemplatelibraryListTemplates**](docs/ToolTemplatelibraryApi.md#toolTemplatelibraryListTemplates) | **POST** /tool_templatelibrary_list_templates | List/search templates by component.
*ToolTemplatelibraryApi* | [**toolTemplatelibraryLoadCanonicalTemplate**](docs/ToolTemplatelibraryApi.md#toolTemplatelibraryLoadCanonicalTemplate) | **POST** /tool_templatelibrary_load_canonical_template | Load a canonical template by name (not the theme overidden one).
*ToolUsertoursApi* | [**toolUsertoursCompleteTour**](docs/ToolUsertoursApi.md#toolUsertoursCompleteTour) | **POST** /tool_usertours_complete_tour | Mark the specified tour as completed for the current user
*ToolUsertoursApi* | [**toolUsertoursFetchAndStartTour**](docs/ToolUsertoursApi.md#toolUsertoursFetchAndStartTour) | **POST** /tool_usertours_fetch_and_start_tour | Fetch the specified tour
*ToolUsertoursApi* | [**toolUsertoursResetTour**](docs/ToolUsertoursApi.md#toolUsertoursResetTour) | **POST** /tool_usertours_reset_tour | Remove the specified tour
*ToolUsertoursApi* | [**toolUsertoursStepShown**](docs/ToolUsertoursApi.md#toolUsertoursStepShown) | **POST** /tool_usertours_step_shown | Mark the specified step as completed for the current user
*ToolXmldbApi* | [**toolXmldbInvokeMoveAction**](docs/ToolXmldbApi.md#toolXmldbInvokeMoveAction) | **POST** /tool_xmldb_invoke_move_action | moves element up/down


## Documentation for Models

 - [AuthEmailGetSignupSettings200Response](docs/AuthEmailGetSignupSettings200Response.md)
 - [AuthEmailGetSignupSettings200ResponseProfilefieldsInner](docs/AuthEmailGetSignupSettings200ResponseProfilefieldsInner.md)
 - [AuthEmailGetSignupSettings200ResponseWarningsInner](docs/AuthEmailGetSignupSettings200ResponseWarningsInner.md)
 - [AuthEmailSignupUser200Response](docs/AuthEmailSignupUser200Response.md)
 - [AuthEmailSignupUser200ResponseWarningsInner](docs/AuthEmailSignupUser200ResponseWarningsInner.md)
 - [AuthEmailSignupUserRequest](docs/AuthEmailSignupUserRequest.md)
 - [AuthEmailSignupUserRequestCustomprofilefieldsInner](docs/AuthEmailSignupUserRequestCustomprofilefieldsInner.md)
 - [BlockAccessreviewGetModuleDataRequest](docs/BlockAccessreviewGetModuleDataRequest.md)
 - [BlockAccessreviewGetSectionDataRequest](docs/BlockAccessreviewGetSectionDataRequest.md)
 - [BlockIomadCompanyAdminAllocateLicensesRequest](docs/BlockIomadCompanyAdminAllocateLicensesRequest.md)
 - [BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner](docs/BlockIomadCompanyAdminAllocateLicensesRequestLicensesInner.md)
 - [BlockIomadCompanyAdminAssignCoursesRequest](docs/BlockIomadCompanyAdminAssignCoursesRequest.md)
 - [BlockIomadCompanyAdminAssignCoursesRequestCoursesInner](docs/BlockIomadCompanyAdminAssignCoursesRequestCoursesInner.md)
 - [BlockIomadCompanyAdminAssignUsers200Response](docs/BlockIomadCompanyAdminAssignUsers200Response.md)
 - [BlockIomadCompanyAdminAssignUsers200ResponseUsersInner](docs/BlockIomadCompanyAdminAssignUsers200ResponseUsersInner.md)
 - [BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner](docs/BlockIomadCompanyAdminAssignUsers200ResponseWarningsInner.md)
 - [BlockIomadCompanyAdminAssignUsersRequest](docs/BlockIomadCompanyAdminAssignUsersRequest.md)
 - [BlockIomadCompanyAdminAssignUsersRequestUsersInner](docs/BlockIomadCompanyAdminAssignUsersRequestUsersInner.md)
 - [BlockIomadCompanyAdminCapabilityDeleteTemplateRequest](docs/BlockIomadCompanyAdminCapabilityDeleteTemplateRequest.md)
 - [BlockIomadCompanyAdminCheckToken200Response](docs/BlockIomadCompanyAdminCheckToken200Response.md)
 - [BlockIomadCompanyAdminCheckTokenRequest](docs/BlockIomadCompanyAdminCheckTokenRequest.md)
 - [BlockIomadCompanyAdminCheckTokenRequestKey0](docs/BlockIomadCompanyAdminCheckTokenRequestKey0.md)
 - [BlockIomadCompanyAdminCreateCompaniesRequest](docs/BlockIomadCompanyAdminCreateCompaniesRequest.md)
 - [BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner](docs/BlockIomadCompanyAdminCreateCompaniesRequestCompaniesInner.md)
 - [BlockIomadCompanyAdminCreateLicensesRequest](docs/BlockIomadCompanyAdminCreateLicensesRequest.md)
 - [BlockIomadCompanyAdminCreateLicensesRequestLicensesInner](docs/BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.md)
 - [BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner](docs/BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md)
 - [BlockIomadCompanyAdminDeleteLicensesRequest](docs/BlockIomadCompanyAdminDeleteLicensesRequest.md)
 - [BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner](docs/BlockIomadCompanyAdminDeleteLicensesRequestLicensesInner.md)
 - [BlockIomadCompanyAdminEditCompaniesRequest](docs/BlockIomadCompanyAdminEditCompaniesRequest.md)
 - [BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner](docs/BlockIomadCompanyAdminEditCompaniesRequestCompaniesInner.md)
 - [BlockIomadCompanyAdminEditLicensesRequest](docs/BlockIomadCompanyAdminEditLicensesRequest.md)
 - [BlockIomadCompanyAdminEditLicensesRequestLicensesInner](docs/BlockIomadCompanyAdminEditLicensesRequestLicensesInner.md)
 - [BlockIomadCompanyAdminEnrolUsersRequest](docs/BlockIomadCompanyAdminEnrolUsersRequest.md)
 - [BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner](docs/BlockIomadCompanyAdminEnrolUsersRequestEnrolmentsInner.md)
 - [BlockIomadCompanyAdminGetCompanies200Response](docs/BlockIomadCompanyAdminGetCompanies200Response.md)
 - [BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner](docs/BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner.md)
 - [BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner](docs/BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner.md)
 - [BlockIomadCompanyAdminGetCompaniesRequest](docs/BlockIomadCompanyAdminGetCompaniesRequest.md)
 - [BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner](docs/BlockIomadCompanyAdminGetCompaniesRequestCriteriaInner.md)
 - [BlockIomadCompanyAdminGetCompanyCourses200Response](docs/BlockIomadCompanyAdminGetCompanyCourses200Response.md)
 - [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner](docs/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner.md)
 - [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner](docs/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner.md)
 - [BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner](docs/BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInnerCustomfieldsInner.md)
 - [BlockIomadCompanyAdminGetCompanyCoursesRequest](docs/BlockIomadCompanyAdminGetCompanyCoursesRequest.md)
 - [BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner](docs/BlockIomadCompanyAdminGetCompanyCoursesRequestCriteriaInner.md)
 - [BlockIomadCompanyAdminGetCourseInfoRequest](docs/BlockIomadCompanyAdminGetCourseInfoRequest.md)
 - [BlockIomadCompanyAdminGetDepartmentUsers200Response](docs/BlockIomadCompanyAdminGetDepartmentUsers200Response.md)
 - [BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner](docs/BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner.md)
 - [BlockIomadCompanyAdminGetDepartmentUsersRequest](docs/BlockIomadCompanyAdminGetDepartmentUsersRequest.md)
 - [BlockIomadCompanyAdminGetDepartments200Response](docs/BlockIomadCompanyAdminGetDepartments200Response.md)
 - [BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner](docs/BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner.md)
 - [BlockIomadCompanyAdminGetDepartmentsRequest](docs/BlockIomadCompanyAdminGetDepartmentsRequest.md)
 - [BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner](docs/BlockIomadCompanyAdminGetDepartmentsRequestCriteriaInner.md)
 - [BlockIomadCompanyAdminGetLicenseFromId200Response](docs/BlockIomadCompanyAdminGetLicenseFromId200Response.md)
 - [BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner](docs/BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner.md)
 - [BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense](docs/BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense.md)
 - [BlockIomadCompanyAdminGetLicenseFromIdRequest](docs/BlockIomadCompanyAdminGetLicenseFromIdRequest.md)
 - [BlockIomadCompanyAdminGetLicenseInfo200Response](docs/BlockIomadCompanyAdminGetLicenseInfo200Response.md)
 - [BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner](docs/BlockIomadCompanyAdminGetLicenseInfo200ResponseLicensesInner.md)
 - [BlockIomadCompanyAdminGetLicenseInfoRequest](docs/BlockIomadCompanyAdminGetLicenseInfoRequest.md)
 - [BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner](docs/BlockIomadCompanyAdminGetLicenseInfoRequestCriteriaInner.md)
 - [BlockIomadCompanyAdminMoveUsersRequest](docs/BlockIomadCompanyAdminMoveUsersRequest.md)
 - [BlockIomadCompanyAdminMoveUsersRequestUsersInner](docs/BlockIomadCompanyAdminMoveUsersRequestUsersInner.md)
 - [BlockIomadCompanyAdminRestrictCapabilityRequest](docs/BlockIomadCompanyAdminRestrictCapabilityRequest.md)
 - [BlockIomadCompanyAdminSyncUsers200Response](docs/BlockIomadCompanyAdminSyncUsers200Response.md)
 - [BlockIomadCompanyAdminSyncUsersRequest](docs/BlockIomadCompanyAdminSyncUsersRequest.md)
 - [BlockIomadCompanyAdminUnallocateLicensesRequest](docs/BlockIomadCompanyAdminUnallocateLicensesRequest.md)
 - [BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner](docs/BlockIomadCompanyAdminUnallocateLicensesRequestLicensesInner.md)
 - [BlockIomadCompanyAdminUnassignCoursesRequest](docs/BlockIomadCompanyAdminUnassignCoursesRequest.md)
 - [BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner](docs/BlockIomadCompanyAdminUnassignCoursesRequestCoursesInner.md)
 - [BlockIomadCompanyAdminUnassignUsersRequest](docs/BlockIomadCompanyAdminUnassignUsersRequest.md)
 - [BlockIomadCompanyAdminUnassignUsersRequestUsersInner](docs/BlockIomadCompanyAdminUnassignUsersRequestUsersInner.md)
 - [BlockIomadCompanyAdminUpdateCoursesRequest](docs/BlockIomadCompanyAdminUpdateCoursesRequest.md)
 - [BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner](docs/BlockIomadCompanyAdminUpdateCoursesRequestCoursesInner.md)
 - [BlockRecentlyaccesseditemsGetRecentItemsRequest](docs/BlockRecentlyaccesseditemsGetRecentItemsRequest.md)
 - [BlockStarredcoursesGetStarredCoursesRequest](docs/BlockStarredcoursesGetStarredCoursesRequest.md)
 - [CoreAdminSetBlockProtectionRequest](docs/CoreAdminSetBlockProtectionRequest.md)
 - [CoreAdminSetPluginOrderRequest](docs/CoreAdminSetPluginOrderRequest.md)
 - [CoreAdminSetPluginStateRequest](docs/CoreAdminSetPluginStateRequest.md)
 - [CoreAuthConfirmUser200Response](docs/CoreAuthConfirmUser200Response.md)
 - [CoreAuthConfirmUserRequest](docs/CoreAuthConfirmUserRequest.md)
 - [CoreAuthIsAgeDigitalConsentVerificationEnabled200Response](docs/CoreAuthIsAgeDigitalConsentVerificationEnabled200Response.md)
 - [CoreAuthIsMinor200Response](docs/CoreAuthIsMinor200Response.md)
 - [CoreAuthIsMinorRequest](docs/CoreAuthIsMinorRequest.md)
 - [CoreAuthRequestPasswordReset200Response](docs/CoreAuthRequestPasswordReset200Response.md)
 - [CoreAuthRequestPasswordResetRequest](docs/CoreAuthRequestPasswordResetRequest.md)
 - [CoreAuthResendConfirmationEmail200Response](docs/CoreAuthResendConfirmationEmail200Response.md)
 - [CoreAuthResendConfirmationEmailRequest](docs/CoreAuthResendConfirmationEmailRequest.md)
 - [CoreBackupGetAsyncBackupLinksBackup200Response](docs/CoreBackupGetAsyncBackupLinksBackup200Response.md)
 - [CoreBackupGetAsyncBackupLinksBackupRequest](docs/CoreBackupGetAsyncBackupLinksBackupRequest.md)
 - [CoreBackupGetAsyncBackupLinksRestore200Response](docs/CoreBackupGetAsyncBackupLinksRestore200Response.md)
 - [CoreBackupGetAsyncBackupLinksRestoreRequest](docs/CoreBackupGetAsyncBackupLinksRestoreRequest.md)
 - [CoreBackupGetAsyncBackupProgressRequest](docs/CoreBackupGetAsyncBackupProgressRequest.md)
 - [CoreBackupGetCopyProgressRequest](docs/CoreBackupGetCopyProgressRequest.md)
 - [CoreBackupGetCopyProgressRequestCopiesInner](docs/CoreBackupGetCopyProgressRequestCopiesInner.md)
 - [CoreBackupSubmitCopyFormRequest](docs/CoreBackupSubmitCopyFormRequest.md)
 - [CoreBadgesGetUserBadgeByHash200Response](docs/CoreBadgesGetUserBadgeByHash200Response.md)
 - [CoreBadgesGetUserBadgeByHash200ResponseBadgeInner](docs/CoreBadgesGetUserBadgeByHash200ResponseBadgeInner.md)
 - [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner](docs/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerAlignmentInner.md)
 - [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement](docs/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerEndorsement.md)
 - [CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner](docs/CoreBadgesGetUserBadgeByHash200ResponseBadgeInnerRelatedbadgesInner.md)
 - [CoreBadgesGetUserBadgeByHashRequest](docs/CoreBadgesGetUserBadgeByHashRequest.md)
 - [CoreBadgesGetUserBadges200Response](docs/CoreBadgesGetUserBadges200Response.md)
 - [CoreBadgesGetUserBadges200ResponseBadgesInner](docs/CoreBadgesGetUserBadges200ResponseBadgesInner.md)
 - [CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner](docs/CoreBadgesGetUserBadges200ResponseBadgesInnerAlignmentInner.md)
 - [CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement](docs/CoreBadgesGetUserBadges200ResponseBadgesInnerEndorsement.md)
 - [CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner](docs/CoreBadgesGetUserBadges200ResponseBadgesInnerRelatedbadgesInner.md)
 - [CoreBadgesGetUserBadgesRequest](docs/CoreBadgesGetUserBadgesRequest.md)
 - [CoreBlockFetchAddableBlocksRequest](docs/CoreBlockFetchAddableBlocksRequest.md)
 - [CoreBlockGetCourseBlocks200Response](docs/CoreBlockGetCourseBlocks200Response.md)
 - [CoreBlockGetCourseBlocks200ResponseBlocksInner](docs/CoreBlockGetCourseBlocks200ResponseBlocksInner.md)
 - [CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner](docs/CoreBlockGetCourseBlocks200ResponseBlocksInnerConfigsInner.md)
 - [CoreBlockGetCourseBlocks200ResponseBlocksInnerContents](docs/CoreBlockGetCourseBlocks200ResponseBlocksInnerContents.md)
 - [CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner](docs/CoreBlockGetCourseBlocks200ResponseBlocksInnerContentsFilesInner.md)
 - [CoreBlockGetCourseBlocksRequest](docs/CoreBlockGetCourseBlocksRequest.md)
 - [CoreBlockGetDashboardBlocks200Response](docs/CoreBlockGetDashboardBlocks200Response.md)
 - [CoreBlockGetDashboardBlocks200ResponseBlocksInner](docs/CoreBlockGetDashboardBlocks200ResponseBlocksInner.md)
 - [CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner](docs/CoreBlockGetDashboardBlocks200ResponseBlocksInnerConfigsInner.md)
 - [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents](docs/CoreBlockGetDashboardBlocks200ResponseBlocksInnerContents.md)
 - [CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner](docs/CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner.md)
 - [CoreBlockGetDashboardBlocksRequest](docs/CoreBlockGetDashboardBlocksRequest.md)
 - [CoreBlogGetEntries200Response](docs/CoreBlogGetEntries200Response.md)
 - [CoreBlogGetEntries200ResponseEntriesInner](docs/CoreBlogGetEntries200ResponseEntriesInner.md)
 - [CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner](docs/CoreBlogGetEntries200ResponseEntriesInnerAttachmentfilesInner.md)
 - [CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner](docs/CoreBlogGetEntries200ResponseEntriesInnerSummaryfilesInner.md)
 - [CoreBlogGetEntries200ResponseEntriesInnerTagsInner](docs/CoreBlogGetEntries200ResponseEntriesInnerTagsInner.md)
 - [CoreBlogGetEntriesRequest](docs/CoreBlogGetEntriesRequest.md)
 - [CoreBlogGetEntriesRequestFiltersInner](docs/CoreBlogGetEntriesRequestFiltersInner.md)
 - [CoreBlogViewEntries200Response](docs/CoreBlogViewEntries200Response.md)
 - [CoreBlogViewEntriesRequest](docs/CoreBlogViewEntriesRequest.md)
 - [CoreBlogViewEntriesRequestFiltersInner](docs/CoreBlogViewEntriesRequestFiltersInner.md)
 - [CoreCalendarCreateCalendarEvents200Response](docs/CoreCalendarCreateCalendarEvents200Response.md)
 - [CoreCalendarCreateCalendarEvents200ResponseEventsInner](docs/CoreCalendarCreateCalendarEvents200ResponseEventsInner.md)
 - [CoreCalendarCreateCalendarEventsRequest](docs/CoreCalendarCreateCalendarEventsRequest.md)
 - [CoreCalendarCreateCalendarEventsRequestEventsInner](docs/CoreCalendarCreateCalendarEventsRequestEventsInner.md)
 - [CoreCalendarDeleteCalendarEventsRequest](docs/CoreCalendarDeleteCalendarEventsRequest.md)
 - [CoreCalendarDeleteCalendarEventsRequestEventsInner](docs/CoreCalendarDeleteCalendarEventsRequestEventsInner.md)
 - [CoreCalendarDeleteSubscription200Response](docs/CoreCalendarDeleteSubscription200Response.md)
 - [CoreCalendarDeleteSubscriptionRequest](docs/CoreCalendarDeleteSubscriptionRequest.md)
 - [CoreCalendarGetActionEventsByCourse200Response](docs/CoreCalendarGetActionEventsByCourse200Response.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInner](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInner.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerAction.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCategory.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerCourse.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerIcon.md)
 - [CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription](docs/CoreCalendarGetActionEventsByCourse200ResponseEventsInnerSubscription.md)
 - [CoreCalendarGetActionEventsByCourseRequest](docs/CoreCalendarGetActionEventsByCourseRequest.md)
 - [CoreCalendarGetActionEventsByCourses200Response](docs/CoreCalendarGetActionEventsByCourses200Response.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInner.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInner.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerAction.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCategory.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerCourse.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerIcon.md)
 - [CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription](docs/CoreCalendarGetActionEventsByCourses200ResponseGroupedbycourseInnerEventsInnerSubscription.md)
 - [CoreCalendarGetActionEventsByCoursesRequest](docs/CoreCalendarGetActionEventsByCoursesRequest.md)
 - [CoreCalendarGetActionEventsByTimesort200Response](docs/CoreCalendarGetActionEventsByTimesort200Response.md)
 - [CoreCalendarGetActionEventsByTimesortRequest](docs/CoreCalendarGetActionEventsByTimesortRequest.md)
 - [CoreCalendarGetAllowedEventTypes200Response](docs/CoreCalendarGetAllowedEventTypes200Response.md)
 - [CoreCalendarGetAllowedEventTypesRequest](docs/CoreCalendarGetAllowedEventTypesRequest.md)
 - [CoreCalendarGetCalendarAccessInformation200Response](docs/CoreCalendarGetCalendarAccessInformation200Response.md)
 - [CoreCalendarGetCalendarAccessInformationRequest](docs/CoreCalendarGetCalendarAccessInformationRequest.md)
 - [CoreCalendarGetCalendarDayView200Response](docs/CoreCalendarGetCalendarDayView200Response.md)
 - [CoreCalendarGetCalendarDayView200ResponseDate](docs/CoreCalendarGetCalendarDayView200ResponseDate.md)
 - [CoreCalendarGetCalendarDayView200ResponseEventsInner](docs/CoreCalendarGetCalendarDayView200ResponseEventsInner.md)
 - [CoreCalendarGetCalendarDayView200ResponseNextperiod](docs/CoreCalendarGetCalendarDayView200ResponseNextperiod.md)
 - [CoreCalendarGetCalendarDayViewRequest](docs/CoreCalendarGetCalendarDayViewRequest.md)
 - [CoreCalendarGetCalendarEventById200Response](docs/CoreCalendarGetCalendarEventById200Response.md)
 - [CoreCalendarGetCalendarEventById200ResponseEvent](docs/CoreCalendarGetCalendarEventById200ResponseEvent.md)
 - [CoreCalendarGetCalendarEventByIdRequest](docs/CoreCalendarGetCalendarEventByIdRequest.md)
 - [CoreCalendarGetCalendarEvents200Response](docs/CoreCalendarGetCalendarEvents200Response.md)
 - [CoreCalendarGetCalendarEvents200ResponseEventsInner](docs/CoreCalendarGetCalendarEvents200ResponseEventsInner.md)
 - [CoreCalendarGetCalendarEventsRequest](docs/CoreCalendarGetCalendarEventsRequest.md)
 - [CoreCalendarGetCalendarEventsRequestEvents](docs/CoreCalendarGetCalendarEventsRequestEvents.md)
 - [CoreCalendarGetCalendarEventsRequestOptions](docs/CoreCalendarGetCalendarEventsRequestOptions.md)
 - [CoreCalendarGetCalendarExportToken200Response](docs/CoreCalendarGetCalendarExportToken200Response.md)
 - [CoreCalendarGetCalendarMonthlyView200Response](docs/CoreCalendarGetCalendarMonthlyView200Response.md)
 - [CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner](docs/CoreCalendarGetCalendarMonthlyView200ResponseDaynamesInner.md)
 - [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner](docs/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInner.md)
 - [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner](docs/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInner.md)
 - [CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner](docs/CoreCalendarGetCalendarMonthlyView200ResponseWeeksInnerDaysInnerEventsInner.md)
 - [CoreCalendarGetCalendarMonthlyViewRequest](docs/CoreCalendarGetCalendarMonthlyViewRequest.md)
 - [CoreCalendarGetCalendarUpcomingView200Response](docs/CoreCalendarGetCalendarUpcomingView200Response.md)
 - [CoreCalendarGetCalendarUpcomingViewRequest](docs/CoreCalendarGetCalendarUpcomingViewRequest.md)
 - [CoreCalendarGetTimestamps200Response](docs/CoreCalendarGetTimestamps200Response.md)
 - [CoreCalendarGetTimestamps200ResponseTimestampsInner](docs/CoreCalendarGetTimestamps200ResponseTimestampsInner.md)
 - [CoreCalendarGetTimestampsRequest](docs/CoreCalendarGetTimestampsRequest.md)
 - [CoreCalendarGetTimestampsRequestDataInner](docs/CoreCalendarGetTimestampsRequestDataInner.md)
 - [CoreCalendarSubmitCreateUpdateForm200Response](docs/CoreCalendarSubmitCreateUpdateForm200Response.md)
 - [CoreCalendarSubmitCreateUpdateFormRequest](docs/CoreCalendarSubmitCreateUpdateFormRequest.md)
 - [CoreCalendarUpdateEventStartDay200Response](docs/CoreCalendarUpdateEventStartDay200Response.md)
 - [CoreCalendarUpdateEventStartDayRequest](docs/CoreCalendarUpdateEventStartDayRequest.md)
 - [CoreChangeEditmode200Response](docs/CoreChangeEditmode200Response.md)
 - [CoreChangeEditmodeRequest](docs/CoreChangeEditmodeRequest.md)
 - [CoreCohortAddCohortMembers200Response](docs/CoreCohortAddCohortMembers200Response.md)
 - [CoreCohortAddCohortMembersRequest](docs/CoreCohortAddCohortMembersRequest.md)
 - [CoreCohortAddCohortMembersRequestMembersInner](docs/CoreCohortAddCohortMembersRequestMembersInner.md)
 - [CoreCohortAddCohortMembersRequestMembersInnerCohorttype](docs/CoreCohortAddCohortMembersRequestMembersInnerCohorttype.md)
 - [CoreCohortAddCohortMembersRequestMembersInnerUsertype](docs/CoreCohortAddCohortMembersRequestMembersInnerUsertype.md)
 - [CoreCohortCreateCohortsRequest](docs/CoreCohortCreateCohortsRequest.md)
 - [CoreCohortCreateCohortsRequestCohortsInner](docs/CoreCohortCreateCohortsRequestCohortsInner.md)
 - [CoreCohortCreateCohortsRequestCohortsInnerCategorytype](docs/CoreCohortCreateCohortsRequestCohortsInnerCategorytype.md)
 - [CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner](docs/CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner.md)
 - [CoreCohortDeleteCohortMembersRequest](docs/CoreCohortDeleteCohortMembersRequest.md)
 - [CoreCohortDeleteCohortMembersRequestMembersInner](docs/CoreCohortDeleteCohortMembersRequestMembersInner.md)
 - [CoreCohortDeleteCohortsRequest](docs/CoreCohortDeleteCohortsRequest.md)
 - [CoreCohortGetCohortMembersRequest](docs/CoreCohortGetCohortMembersRequest.md)
 - [CoreCohortGetCohortsRequest](docs/CoreCohortGetCohortsRequest.md)
 - [CoreCohortSearchCohorts200Response](docs/CoreCohortSearchCohorts200Response.md)
 - [CoreCohortSearchCohorts200ResponseCohortsInner](docs/CoreCohortSearchCohorts200ResponseCohortsInner.md)
 - [CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner](docs/CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner.md)
 - [CoreCohortSearchCohortsRequest](docs/CoreCohortSearchCohortsRequest.md)
 - [CoreCohortSearchCohortsRequestContext](docs/CoreCohortSearchCohortsRequestContext.md)
 - [CoreCohortUpdateCohortsRequest](docs/CoreCohortUpdateCohortsRequest.md)
 - [CoreCohortUpdateCohortsRequestCohortsInner](docs/CoreCohortUpdateCohortsRequestCohortsInner.md)
 - [CoreCohortUpdateCohortsRequestCohortsInnerCategorytype](docs/CoreCohortUpdateCohortsRequestCohortsInnerCategorytype.md)
 - [CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner](docs/CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner.md)
 - [CoreCommentAddCommentsRequest](docs/CoreCommentAddCommentsRequest.md)
 - [CoreCommentAddCommentsRequestCommentsInner](docs/CoreCommentAddCommentsRequestCommentsInner.md)
 - [CoreCommentDeleteCommentsRequest](docs/CoreCommentDeleteCommentsRequest.md)
 - [CoreCommentGetComments200Response](docs/CoreCommentGetComments200Response.md)
 - [CoreCommentGetComments200ResponseCommentsInner](docs/CoreCommentGetComments200ResponseCommentsInner.md)
 - [CoreCommentGetCommentsRequest](docs/CoreCommentGetCommentsRequest.md)
 - [CoreCompetencyAddCompetencyToCourseRequest](docs/CoreCompetencyAddCompetencyToCourseRequest.md)
 - [CoreCompetencyAddCompetencyToPlanRequest](docs/CoreCompetencyAddCompetencyToPlanRequest.md)
 - [CoreCompetencyAddCompetencyToTemplateRequest](docs/CoreCompetencyAddCompetencyToTemplateRequest.md)
 - [CoreCompetencyAddRelatedCompetencyRequest](docs/CoreCompetencyAddRelatedCompetencyRequest.md)
 - [CoreCompetencyApprovePlanRequest](docs/CoreCompetencyApprovePlanRequest.md)
 - [CoreCompetencyCompetencyFrameworkViewedRequest](docs/CoreCompetencyCompetencyFrameworkViewedRequest.md)
 - [CoreCompetencyCompetencyViewedRequest](docs/CoreCompetencyCompetencyViewedRequest.md)
 - [CoreCompetencyCompletePlanRequest](docs/CoreCompetencyCompletePlanRequest.md)
 - [CoreCompetencyCountCompetenciesInCourseRequest](docs/CoreCompetencyCountCompetenciesInCourseRequest.md)
 - [CoreCompetencyCountCompetenciesInTemplateRequest](docs/CoreCompetencyCountCompetenciesInTemplateRequest.md)
 - [CoreCompetencyCountCompetenciesRequest](docs/CoreCompetencyCountCompetenciesRequest.md)
 - [CoreCompetencyCountCompetenciesRequestFiltersInner](docs/CoreCompetencyCountCompetenciesRequestFiltersInner.md)
 - [CoreCompetencyCountCompetencyFrameworksRequest](docs/CoreCompetencyCountCompetencyFrameworksRequest.md)
 - [CoreCompetencyCountCourseModuleCompetenciesRequest](docs/CoreCompetencyCountCourseModuleCompetenciesRequest.md)
 - [CoreCompetencyCreateCompetency200Response](docs/CoreCompetencyCreateCompetency200Response.md)
 - [CoreCompetencyCreateCompetencyFramework200Response](docs/CoreCompetencyCreateCompetencyFramework200Response.md)
 - [CoreCompetencyCreateCompetencyFrameworkRequest](docs/CoreCompetencyCreateCompetencyFrameworkRequest.md)
 - [CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework](docs/CoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework.md)
 - [CoreCompetencyCreateCompetencyRequest](docs/CoreCompetencyCreateCompetencyRequest.md)
 - [CoreCompetencyCreateCompetencyRequestCompetency](docs/CoreCompetencyCreateCompetencyRequestCompetency.md)
 - [CoreCompetencyCreatePlan200Response](docs/CoreCompetencyCreatePlan200Response.md)
 - [CoreCompetencyCreatePlan200ResponseCommentarea](docs/CoreCompetencyCreatePlan200ResponseCommentarea.md)
 - [CoreCompetencyCreatePlan200ResponseReviewer](docs/CoreCompetencyCreatePlan200ResponseReviewer.md)
 - [CoreCompetencyCreatePlan200ResponseTemplate](docs/CoreCompetencyCreatePlan200ResponseTemplate.md)
 - [CoreCompetencyCreatePlanRequest](docs/CoreCompetencyCreatePlanRequest.md)
 - [CoreCompetencyCreatePlanRequestPlan](docs/CoreCompetencyCreatePlanRequestPlan.md)
 - [CoreCompetencyCreateTemplate200Response](docs/CoreCompetencyCreateTemplate200Response.md)
 - [CoreCompetencyCreateTemplateRequest](docs/CoreCompetencyCreateTemplateRequest.md)
 - [CoreCompetencyCreateTemplateRequestTemplate](docs/CoreCompetencyCreateTemplateRequestTemplate.md)
 - [CoreCompetencyCreateUserEvidenceCompetency200Response](docs/CoreCompetencyCreateUserEvidenceCompetency200Response.md)
 - [CoreCompetencyCreateUserEvidenceCompetencyRequest](docs/CoreCompetencyCreateUserEvidenceCompetencyRequest.md)
 - [CoreCompetencyDeleteCompetencyFrameworkRequest](docs/CoreCompetencyDeleteCompetencyFrameworkRequest.md)
 - [CoreCompetencyDeleteCompetencyRequest](docs/CoreCompetencyDeleteCompetencyRequest.md)
 - [CoreCompetencyDeleteEvidenceRequest](docs/CoreCompetencyDeleteEvidenceRequest.md)
 - [CoreCompetencyDeletePlanRequest](docs/CoreCompetencyDeletePlanRequest.md)
 - [CoreCompetencyDeleteTemplateRequest](docs/CoreCompetencyDeleteTemplateRequest.md)
 - [CoreCompetencyDeleteUserEvidenceCompetencyRequest](docs/CoreCompetencyDeleteUserEvidenceCompetencyRequest.md)
 - [CoreCompetencyDeleteUserEvidenceRequest](docs/CoreCompetencyDeleteUserEvidenceRequest.md)
 - [CoreCompetencyDuplicateCompetencyFramework200Response](docs/CoreCompetencyDuplicateCompetencyFramework200Response.md)
 - [CoreCompetencyDuplicateCompetencyFrameworkRequest](docs/CoreCompetencyDuplicateCompetencyFrameworkRequest.md)
 - [CoreCompetencyGetScaleValuesRequest](docs/CoreCompetencyGetScaleValuesRequest.md)
 - [CoreCompetencyGradeCompetency200Response](docs/CoreCompetencyGradeCompetency200Response.md)
 - [CoreCompetencyGradeCompetency200ResponseActionuser](docs/CoreCompetencyGradeCompetency200ResponseActionuser.md)
 - [CoreCompetencyGradeCompetencyInCourse200Response](docs/CoreCompetencyGradeCompetencyInCourse200Response.md)
 - [CoreCompetencyGradeCompetencyInCourseRequest](docs/CoreCompetencyGradeCompetencyInCourseRequest.md)
 - [CoreCompetencyGradeCompetencyInPlanRequest](docs/CoreCompetencyGradeCompetencyInPlanRequest.md)
 - [CoreCompetencyGradeCompetencyRequest](docs/CoreCompetencyGradeCompetencyRequest.md)
 - [CoreCompetencyListCompetenciesRequest](docs/CoreCompetencyListCompetenciesRequest.md)
 - [CoreCompetencyListCompetenciesRequestFiltersInner](docs/CoreCompetencyListCompetenciesRequestFiltersInner.md)
 - [CoreCompetencyListCompetencyFrameworksRequest](docs/CoreCompetencyListCompetencyFrameworksRequest.md)
 - [CoreCompetencyListCourseModuleCompetenciesRequest](docs/CoreCompetencyListCourseModuleCompetenciesRequest.md)
 - [CoreCompetencyListPlanCompetenciesRequest](docs/CoreCompetencyListPlanCompetenciesRequest.md)
 - [CoreCompetencyListTemplatesRequest](docs/CoreCompetencyListTemplatesRequest.md)
 - [CoreCompetencyListUserPlansRequest](docs/CoreCompetencyListUserPlansRequest.md)
 - [CoreCompetencyPlanCancelReviewRequestRequest](docs/CoreCompetencyPlanCancelReviewRequestRequest.md)
 - [CoreCompetencyReadCompetencyRequest](docs/CoreCompetencyReadCompetencyRequest.md)
 - [CoreCompetencyReadPlan200Response](docs/CoreCompetencyReadPlan200Response.md)
 - [CoreCompetencyReadPlan200ResponseCommentarea](docs/CoreCompetencyReadPlan200ResponseCommentarea.md)
 - [CoreCompetencyReadPlanRequest](docs/CoreCompetencyReadPlanRequest.md)
 - [CoreCompetencyReadTemplateRequest](docs/CoreCompetencyReadTemplateRequest.md)
 - [CoreCompetencyReadUserEvidence200Response](docs/CoreCompetencyReadUserEvidence200Response.md)
 - [CoreCompetencyReadUserEvidence200ResponseCompetenciesInner](docs/CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.md)
 - [CoreCompetencyReadUserEvidence200ResponseFilesInner](docs/CoreCompetencyReadUserEvidence200ResponseFilesInner.md)
 - [CoreCompetencyRemoveCompetencyFromCourseRequest](docs/CoreCompetencyRemoveCompetencyFromCourseRequest.md)
 - [CoreCompetencyRemoveCompetencyFromPlanRequest](docs/CoreCompetencyRemoveCompetencyFromPlanRequest.md)
 - [CoreCompetencyRemoveCompetencyFromTemplateRequest](docs/CoreCompetencyRemoveCompetencyFromTemplateRequest.md)
 - [CoreCompetencyRemoveRelatedCompetencyRequest](docs/CoreCompetencyRemoveRelatedCompetencyRequest.md)
 - [CoreCompetencyReorderCourseCompetencyRequest](docs/CoreCompetencyReorderCourseCompetencyRequest.md)
 - [CoreCompetencyReorderPlanCompetencyRequest](docs/CoreCompetencyReorderPlanCompetencyRequest.md)
 - [CoreCompetencyReorderTemplateCompetencyRequest](docs/CoreCompetencyReorderTemplateCompetencyRequest.md)
 - [CoreCompetencySearchCompetenciesRequest](docs/CoreCompetencySearchCompetenciesRequest.md)
 - [CoreCompetencySetCourseCompetencyRuleoutcomeRequest](docs/CoreCompetencySetCourseCompetencyRuleoutcomeRequest.md)
 - [CoreCompetencySetParentCompetencyRequest](docs/CoreCompetencySetParentCompetencyRequest.md)
 - [CoreCompetencyUnlinkPlanFromTemplateRequest](docs/CoreCompetencyUnlinkPlanFromTemplateRequest.md)
 - [CoreCompetencyUpdateCompetencyFrameworkRequest](docs/CoreCompetencyUpdateCompetencyFrameworkRequest.md)
 - [CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework](docs/CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework.md)
 - [CoreCompetencyUpdateCompetencyRequest](docs/CoreCompetencyUpdateCompetencyRequest.md)
 - [CoreCompetencyUpdateCompetencyRequestCompetency](docs/CoreCompetencyUpdateCompetencyRequestCompetency.md)
 - [CoreCompetencyUpdateCourseCompetencySettingsRequest](docs/CoreCompetencyUpdateCourseCompetencySettingsRequest.md)
 - [CoreCompetencyUpdateCourseCompetencySettingsRequestSettings](docs/CoreCompetencyUpdateCourseCompetencySettingsRequestSettings.md)
 - [CoreCompetencyUpdatePlanRequest](docs/CoreCompetencyUpdatePlanRequest.md)
 - [CoreCompetencyUpdatePlanRequestPlan](docs/CoreCompetencyUpdatePlanRequestPlan.md)
 - [CoreCompetencyUpdateTemplateRequest](docs/CoreCompetencyUpdateTemplateRequest.md)
 - [CoreCompetencyUpdateTemplateRequestTemplate](docs/CoreCompetencyUpdateTemplateRequestTemplate.md)
 - [CoreCompetencyUserCompetencyCancelReviewRequestRequest](docs/CoreCompetencyUserCompetencyCancelReviewRequestRequest.md)
 - [CoreCompetencyUserCompetencyPlanViewedRequest](docs/CoreCompetencyUserCompetencyPlanViewedRequest.md)
 - [CoreCompetencyUserCompetencyRequestReviewRequest](docs/CoreCompetencyUserCompetencyRequestReviewRequest.md)
 - [CoreCompetencyUserCompetencyViewedInCourseRequest](docs/CoreCompetencyUserCompetencyViewedInCourseRequest.md)
 - [CoreCompetencyUserCompetencyViewedRequest](docs/CoreCompetencyUserCompetencyViewedRequest.md)
 - [CoreCompletionGetActivitiesCompletionStatus200Response](docs/CoreCompletionGetActivitiesCompletionStatus200Response.md)
 - [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner](docs/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInner.md)
 - [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner](docs/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.md)
 - [CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue](docs/CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue.md)
 - [CoreCompletionGetActivitiesCompletionStatusRequest](docs/CoreCompletionGetActivitiesCompletionStatusRequest.md)
 - [CoreCompletionGetCourseCompletionStatus200Response](docs/CoreCompletionGetCourseCompletionStatus200Response.md)
 - [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus](docs/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatus.md)
 - [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner](docs/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInner.md)
 - [CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails](docs/CoreCompletionGetCourseCompletionStatus200ResponseCompletionstatusCompletionsInnerDetails.md)
 - [CoreCompletionMarkCourseSelfCompleted200Response](docs/CoreCompletionMarkCourseSelfCompleted200Response.md)
 - [CoreCompletionMarkCourseSelfCompletedRequest](docs/CoreCompletionMarkCourseSelfCompletedRequest.md)
 - [CoreCompletionOverrideActivityCompletionStatus200Response](docs/CoreCompletionOverrideActivityCompletionStatus200Response.md)
 - [CoreCompletionOverrideActivityCompletionStatusRequest](docs/CoreCompletionOverrideActivityCompletionStatusRequest.md)
 - [CoreCompletionUpdateActivityCompletionStatusManually200Response](docs/CoreCompletionUpdateActivityCompletionStatusManually200Response.md)
 - [CoreCompletionUpdateActivityCompletionStatusManuallyRequest](docs/CoreCompletionUpdateActivityCompletionStatusManuallyRequest.md)
 - [CoreContentbankCopyContent200Response](docs/CoreContentbankCopyContent200Response.md)
 - [CoreContentbankCopyContentRequest](docs/CoreContentbankCopyContentRequest.md)
 - [CoreContentbankDeleteContent200Response](docs/CoreContentbankDeleteContent200Response.md)
 - [CoreContentbankDeleteContentRequest](docs/CoreContentbankDeleteContentRequest.md)
 - [CoreContentbankRenameContent200Response](docs/CoreContentbankRenameContent200Response.md)
 - [CoreContentbankRenameContentRequest](docs/CoreContentbankRenameContentRequest.md)
 - [CoreContentbankSetContentVisibilityRequest](docs/CoreContentbankSetContentVisibilityRequest.md)
 - [CoreCourseAddContentItemToUserFavourites200Response](docs/CoreCourseAddContentItemToUserFavourites200Response.md)
 - [CoreCourseAddContentItemToUserFavouritesRequest](docs/CoreCourseAddContentItemToUserFavouritesRequest.md)
 - [CoreCourseCheckUpdates200Response](docs/CoreCourseCheckUpdates200Response.md)
 - [CoreCourseCheckUpdates200ResponseInstancesInner](docs/CoreCourseCheckUpdates200ResponseInstancesInner.md)
 - [CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner](docs/CoreCourseCheckUpdates200ResponseInstancesInnerUpdatesInner.md)
 - [CoreCourseCheckUpdatesRequest](docs/CoreCourseCheckUpdatesRequest.md)
 - [CoreCourseCheckUpdatesRequestTocheckInner](docs/CoreCourseCheckUpdatesRequestTocheckInner.md)
 - [CoreCourseCreateCategoriesRequest](docs/CoreCourseCreateCategoriesRequest.md)
 - [CoreCourseCreateCategoriesRequestCategoriesInner](docs/CoreCourseCreateCategoriesRequestCategoriesInner.md)
 - [CoreCourseCreateCoursesRequest](docs/CoreCourseCreateCoursesRequest.md)
 - [CoreCourseCreateCoursesRequestCoursesInner](docs/CoreCourseCreateCoursesRequestCoursesInner.md)
 - [CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner](docs/CoreCourseCreateCoursesRequestCoursesInnerCourseformatoptionsInner.md)
 - [CoreCourseDeleteCategoriesRequest](docs/CoreCourseDeleteCategoriesRequest.md)
 - [CoreCourseDeleteCategoriesRequestCategoriesInner](docs/CoreCourseDeleteCategoriesRequestCategoriesInner.md)
 - [CoreCourseDeleteCoursesRequest](docs/CoreCourseDeleteCoursesRequest.md)
 - [CoreCourseDeleteModulesRequest](docs/CoreCourseDeleteModulesRequest.md)
 - [CoreCourseDuplicateCourse200Response](docs/CoreCourseDuplicateCourse200Response.md)
 - [CoreCourseDuplicateCourseRequest](docs/CoreCourseDuplicateCourseRequest.md)
 - [CoreCourseDuplicateCourseRequestOptionsInner](docs/CoreCourseDuplicateCourseRequestOptionsInner.md)
 - [CoreCourseEditModuleRequest](docs/CoreCourseEditModuleRequest.md)
 - [CoreCourseEditSectionRequest](docs/CoreCourseEditSectionRequest.md)
 - [CoreCourseGetActivityChooserFooter200Response](docs/CoreCourseGetActivityChooserFooter200Response.md)
 - [CoreCourseGetActivityChooserFooterRequest](docs/CoreCourseGetActivityChooserFooterRequest.md)
 - [CoreCourseGetCategoriesRequest](docs/CoreCourseGetCategoriesRequest.md)
 - [CoreCourseGetCategoriesRequestCriteriaInner](docs/CoreCourseGetCategoriesRequestCriteriaInner.md)
 - [CoreCourseGetContentsRequest](docs/CoreCourseGetContentsRequest.md)
 - [CoreCourseGetContentsRequestOptionsInner](docs/CoreCourseGetContentsRequestOptionsInner.md)
 - [CoreCourseGetCourseContentItems200Response](docs/CoreCourseGetCourseContentItems200Response.md)
 - [CoreCourseGetCourseContentItems200ResponseContentItemsInner](docs/CoreCourseGetCourseContentItems200ResponseContentItemsInner.md)
 - [CoreCourseGetCourseContentItemsRequest](docs/CoreCourseGetCourseContentItemsRequest.md)
 - [CoreCourseGetCourseModule200Response](docs/CoreCourseGetCourseModule200Response.md)
 - [CoreCourseGetCourseModule200ResponseCm](docs/CoreCourseGetCourseModule200ResponseCm.md)
 - [CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner](docs/CoreCourseGetCourseModule200ResponseCmAdvancedgradingInner.md)
 - [CoreCourseGetCourseModule200ResponseCmOutcomesInner](docs/CoreCourseGetCourseModule200ResponseCmOutcomesInner.md)
 - [CoreCourseGetCourseModuleByInstance200Response](docs/CoreCourseGetCourseModuleByInstance200Response.md)
 - [CoreCourseGetCourseModuleByInstance200ResponseCm](docs/CoreCourseGetCourseModuleByInstance200ResponseCm.md)
 - [CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner](docs/CoreCourseGetCourseModuleByInstance200ResponseCmAdvancedgradingInner.md)
 - [CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner](docs/CoreCourseGetCourseModuleByInstance200ResponseCmOutcomesInner.md)
 - [CoreCourseGetCourseModuleByInstanceRequest](docs/CoreCourseGetCourseModuleByInstanceRequest.md)
 - [CoreCourseGetCoursesByField200Response](docs/CoreCourseGetCoursesByField200Response.md)
 - [CoreCourseGetCoursesByField200ResponseCoursesInner](docs/CoreCourseGetCoursesByField200ResponseCoursesInner.md)
 - [CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner](docs/CoreCourseGetCoursesByField200ResponseCoursesInnerContactsInner.md)
 - [CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner](docs/CoreCourseGetCoursesByField200ResponseCoursesInnerCourseformatoptionsInner.md)
 - [CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner](docs/CoreCourseGetCoursesByField200ResponseCoursesInnerCustomfieldsInner.md)
 - [CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner](docs/CoreCourseGetCoursesByField200ResponseCoursesInnerFiltersInner.md)
 - [CoreCourseGetCoursesByFieldRequest](docs/CoreCourseGetCoursesByFieldRequest.md)
 - [CoreCourseGetCoursesRequest](docs/CoreCourseGetCoursesRequest.md)
 - [CoreCourseGetCoursesRequestOptions](docs/CoreCourseGetCoursesRequestOptions.md)
 - [CoreCourseGetEnrolledCoursesByTimelineClassification200Response](docs/CoreCourseGetEnrolledCoursesByTimelineClassification200Response.md)
 - [CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner](docs/CoreCourseGetEnrolledCoursesByTimelineClassification200ResponseCoursesInner.md)
 - [CoreCourseGetEnrolledCoursesByTimelineClassificationRequest](docs/CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.md)
 - [CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response](docs/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.md)
 - [CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest](docs/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.md)
 - [CoreCourseGetEnrolledUsersByCmid200Response](docs/CoreCourseGetEnrolledUsersByCmid200Response.md)
 - [CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner](docs/CoreCourseGetEnrolledUsersByCmid200ResponseUsersInner.md)
 - [CoreCourseGetEnrolledUsersByCmidRequest](docs/CoreCourseGetEnrolledUsersByCmidRequest.md)
 - [CoreCourseGetModuleRequest](docs/CoreCourseGetModuleRequest.md)
 - [CoreCourseGetRecentCoursesRequest](docs/CoreCourseGetRecentCoursesRequest.md)
 - [CoreCourseGetUpdatesSince200Response](docs/CoreCourseGetUpdatesSince200Response.md)
 - [CoreCourseGetUpdatesSince200ResponseInstancesInner](docs/CoreCourseGetUpdatesSince200ResponseInstancesInner.md)
 - [CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner](docs/CoreCourseGetUpdatesSince200ResponseInstancesInnerUpdatesInner.md)
 - [CoreCourseGetUpdatesSinceRequest](docs/CoreCourseGetUpdatesSinceRequest.md)
 - [CoreCourseGetUserAdministrationOptions200Response](docs/CoreCourseGetUserAdministrationOptions200Response.md)
 - [CoreCourseGetUserAdministrationOptions200ResponseCoursesInner](docs/CoreCourseGetUserAdministrationOptions200ResponseCoursesInner.md)
 - [CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner](docs/CoreCourseGetUserAdministrationOptions200ResponseCoursesInnerOptionsInner.md)
 - [CoreCourseGetUserAdministrationOptionsRequest](docs/CoreCourseGetUserAdministrationOptionsRequest.md)
 - [CoreCourseGetUserNavigationOptions200Response](docs/CoreCourseGetUserNavigationOptions200Response.md)
 - [CoreCourseGetUserNavigationOptions200ResponseCoursesInner](docs/CoreCourseGetUserNavigationOptions200ResponseCoursesInner.md)
 - [CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner](docs/CoreCourseGetUserNavigationOptions200ResponseCoursesInnerOptionsInner.md)
 - [CoreCourseGetUserNavigationOptionsRequest](docs/CoreCourseGetUserNavigationOptionsRequest.md)
 - [CoreCourseImportCourseRequest](docs/CoreCourseImportCourseRequest.md)
 - [CoreCourseImportCourseRequestOptionsInner](docs/CoreCourseImportCourseRequestOptionsInner.md)
 - [CoreCourseRemoveContentItemFromUserFavouritesRequest](docs/CoreCourseRemoveContentItemFromUserFavouritesRequest.md)
 - [CoreCourseSearchCourses200Response](docs/CoreCourseSearchCourses200Response.md)
 - [CoreCourseSearchCourses200ResponseCoursesInner](docs/CoreCourseSearchCourses200ResponseCoursesInner.md)
 - [CoreCourseSearchCourses200ResponseCoursesInnerContactsInner](docs/CoreCourseSearchCourses200ResponseCoursesInnerContactsInner.md)
 - [CoreCourseSearchCoursesRequest](docs/CoreCourseSearchCoursesRequest.md)
 - [CoreCourseSetFavouriteCoursesRequest](docs/CoreCourseSetFavouriteCoursesRequest.md)
 - [CoreCourseSetFavouriteCoursesRequestCoursesInner](docs/CoreCourseSetFavouriteCoursesRequestCoursesInner.md)
 - [CoreCourseToggleActivityRecommendation200Response](docs/CoreCourseToggleActivityRecommendation200Response.md)
 - [CoreCourseToggleActivityRecommendationRequest](docs/CoreCourseToggleActivityRecommendationRequest.md)
 - [CoreCourseUpdateCategoriesRequest](docs/CoreCourseUpdateCategoriesRequest.md)
 - [CoreCourseUpdateCategoriesRequestCategoriesInner](docs/CoreCourseUpdateCategoriesRequestCategoriesInner.md)
 - [CoreCourseUpdateCoursesRequest](docs/CoreCourseUpdateCoursesRequest.md)
 - [CoreCourseUpdateCoursesRequestCoursesInner](docs/CoreCourseUpdateCoursesRequestCoursesInner.md)
 - [CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner](docs/CoreCourseUpdateCoursesRequestCoursesInnerCourseformatoptionsInner.md)
 - [CoreCourseViewCourseRequest](docs/CoreCourseViewCourseRequest.md)
 - [CoreCourseformatFileHandlersRequest](docs/CoreCourseformatFileHandlersRequest.md)
 - [CoreCourseformatUpdateCourseRequest](docs/CoreCourseformatUpdateCourseRequest.md)
 - [CoreCreateUserfeedbackActionRecordRequest](docs/CoreCreateUserfeedbackActionRecordRequest.md)
 - [CoreCustomfieldCreateCategoryRequest](docs/CoreCustomfieldCreateCategoryRequest.md)
 - [CoreCustomfieldDeleteCategoryRequest](docs/CoreCustomfieldDeleteCategoryRequest.md)
 - [CoreCustomfieldDeleteFieldRequest](docs/CoreCustomfieldDeleteFieldRequest.md)
 - [CoreCustomfieldMoveCategoryRequest](docs/CoreCustomfieldMoveCategoryRequest.md)
 - [CoreCustomfieldMoveFieldRequest](docs/CoreCustomfieldMoveFieldRequest.md)
 - [CoreCustomfieldReloadTemplate200Response](docs/CoreCustomfieldReloadTemplate200Response.md)
 - [CoreCustomfieldReloadTemplate200ResponseCategoriesInner](docs/CoreCustomfieldReloadTemplate200ResponseCategoriesInner.md)
 - [CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner](docs/CoreCustomfieldReloadTemplate200ResponseCategoriesInnerFieldsInner.md)
 - [CoreCustomfieldReloadTemplateRequest](docs/CoreCustomfieldReloadTemplateRequest.md)
 - [CoreDynamicTabsGetContent200Response](docs/CoreDynamicTabsGetContent200Response.md)
 - [CoreDynamicTabsGetContentRequest](docs/CoreDynamicTabsGetContentRequest.md)
 - [CoreEnrolGetCourseEnrolmentMethodsRequest](docs/CoreEnrolGetCourseEnrolmentMethodsRequest.md)
 - [CoreEnrolGetEnrolledUsersRequest](docs/CoreEnrolGetEnrolledUsersRequest.md)
 - [CoreEnrolGetEnrolledUsersRequestOptionsInner](docs/CoreEnrolGetEnrolledUsersRequestOptionsInner.md)
 - [CoreEnrolGetEnrolledUsersWithCapabilityRequest](docs/CoreEnrolGetEnrolledUsersWithCapabilityRequest.md)
 - [CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner](docs/CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner.md)
 - [CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner](docs/CoreEnrolGetEnrolledUsersWithCapabilityRequestOptionsInner.md)
 - [CoreEnrolGetPotentialUsersRequest](docs/CoreEnrolGetPotentialUsersRequest.md)
 - [CoreEnrolGetUsersCoursesRequest](docs/CoreEnrolGetUsersCoursesRequest.md)
 - [CoreEnrolSearchUsersRequest](docs/CoreEnrolSearchUsersRequest.md)
 - [CoreEnrolSubmitUserEnrolmentForm200Response](docs/CoreEnrolSubmitUserEnrolmentForm200Response.md)
 - [CoreEnrolSubmitUserEnrolmentFormRequest](docs/CoreEnrolSubmitUserEnrolmentFormRequest.md)
 - [CoreEnrolUnenrolUserEnrolment200Response](docs/CoreEnrolUnenrolUserEnrolment200Response.md)
 - [CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner](docs/CoreEnrolUnenrolUserEnrolment200ResponseErrorsInner.md)
 - [CoreEnrolUnenrolUserEnrolmentRequest](docs/CoreEnrolUnenrolUserEnrolmentRequest.md)
 - [CoreFetchNotificationsRequest](docs/CoreFetchNotificationsRequest.md)
 - [CoreFilesDeleteDraftFiles200Response](docs/CoreFilesDeleteDraftFiles200Response.md)
 - [CoreFilesDeleteDraftFilesRequest](docs/CoreFilesDeleteDraftFilesRequest.md)
 - [CoreFilesDeleteDraftFilesRequestFilesInner](docs/CoreFilesDeleteDraftFilesRequestFilesInner.md)
 - [CoreFilesGetFiles200Response](docs/CoreFilesGetFiles200Response.md)
 - [CoreFilesGetFiles200ResponseFilesInner](docs/CoreFilesGetFiles200ResponseFilesInner.md)
 - [CoreFilesGetFiles200ResponseParentsInner](docs/CoreFilesGetFiles200ResponseParentsInner.md)
 - [CoreFilesGetFilesRequest](docs/CoreFilesGetFilesRequest.md)
 - [CoreFilesGetUnusedDraftItemid200Response](docs/CoreFilesGetUnusedDraftItemid200Response.md)
 - [CoreFilesUpload200Response](docs/CoreFilesUpload200Response.md)
 - [CoreFilesUploadRequest](docs/CoreFilesUploadRequest.md)
 - [CoreFiltersGetAvailableInContext200Response](docs/CoreFiltersGetAvailableInContext200Response.md)
 - [CoreFiltersGetAvailableInContext200ResponseFiltersInner](docs/CoreFiltersGetAvailableInContext200ResponseFiltersInner.md)
 - [CoreFiltersGetAvailableInContextRequest](docs/CoreFiltersGetAvailableInContextRequest.md)
 - [CoreFiltersGetAvailableInContextRequestContextsInner](docs/CoreFiltersGetAvailableInContextRequestContextsInner.md)
 - [CoreFormDynamicForm200Response](docs/CoreFormDynamicForm200Response.md)
 - [CoreFormDynamicFormRequest](docs/CoreFormDynamicFormRequest.md)
 - [CoreFormGetFiletypesBrowserData200Response](docs/CoreFormGetFiletypesBrowserData200Response.md)
 - [CoreFormGetFiletypesBrowserData200ResponseGroupsInner](docs/CoreFormGetFiletypesBrowserData200ResponseGroupsInner.md)
 - [CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner](docs/CoreFormGetFiletypesBrowserData200ResponseGroupsInnerTypesInner.md)
 - [CoreFormGetFiletypesBrowserDataRequest](docs/CoreFormGetFiletypesBrowserDataRequest.md)
 - [CoreGetComponentStringsRequest](docs/CoreGetComponentStringsRequest.md)
 - [CoreGetFragment200Response](docs/CoreGetFragment200Response.md)
 - [CoreGetFragmentRequest](docs/CoreGetFragmentRequest.md)
 - [CoreGetFragmentRequestArgsInner](docs/CoreGetFragmentRequestArgsInner.md)
 - [CoreGetStringRequest](docs/CoreGetStringRequest.md)
 - [CoreGetStringRequestStringparamsInner](docs/CoreGetStringRequestStringparamsInner.md)
 - [CoreGetStringsRequest](docs/CoreGetStringsRequest.md)
 - [CoreGetStringsRequestStringsInner](docs/CoreGetStringsRequestStringsInner.md)
 - [CoreGetStringsRequestStringsInnerStringparamsInner](docs/CoreGetStringsRequestStringsInnerStringparamsInner.md)
 - [CoreGetUserDates200Response](docs/CoreGetUserDates200Response.md)
 - [CoreGetUserDatesRequest](docs/CoreGetUserDatesRequest.md)
 - [CoreGetUserDatesRequestTimestampsInner](docs/CoreGetUserDatesRequestTimestampsInner.md)
 - [CoreGradesCreateGradecategories200Response](docs/CoreGradesCreateGradecategories200Response.md)
 - [CoreGradesCreateGradecategoriesRequest](docs/CoreGradesCreateGradecategoriesRequest.md)
 - [CoreGradesCreateGradecategoriesRequestCategoriesInner](docs/CoreGradesCreateGradecategoriesRequestCategoriesInner.md)
 - [CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions](docs/CoreGradesCreateGradecategoriesRequestCategoriesInnerOptions.md)
 - [CoreGradesGetEnrolledUsersForSearchWidget200Response](docs/CoreGradesGetEnrolledUsersForSearchWidget200Response.md)
 - [CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner](docs/CoreGradesGetEnrolledUsersForSearchWidget200ResponseUsersInner.md)
 - [CoreGradesGetEnrolledUsersForSearchWidgetRequest](docs/CoreGradesGetEnrolledUsersForSearchWidgetRequest.md)
 - [CoreGradesGetEnrolledUsersForSelector200Response](docs/CoreGradesGetEnrolledUsersForSelector200Response.md)
 - [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner](docs/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInner.md)
 - [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner](docs/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerCustomfieldsInner.md)
 - [CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner](docs/CoreGradesGetEnrolledUsersForSelector200ResponseUsersInnerPreferencesInner.md)
 - [CoreGradesGetEnrolledUsersForSelectorRequest](docs/CoreGradesGetEnrolledUsersForSelectorRequest.md)
 - [CoreGradesGetFeedback200Response](docs/CoreGradesGetFeedback200Response.md)
 - [CoreGradesGetFeedbackRequest](docs/CoreGradesGetFeedbackRequest.md)
 - [CoreGradesGetGradableUsers200Response](docs/CoreGradesGetGradableUsers200Response.md)
 - [CoreGradesGetGradableUsers200ResponseUsersInner](docs/CoreGradesGetGradableUsers200ResponseUsersInner.md)
 - [CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner](docs/CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner.md)
 - [CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner](docs/CoreGradesGetGradableUsers200ResponseUsersInnerPreferencesInner.md)
 - [CoreGradesGetGradableUsersRequest](docs/CoreGradesGetGradableUsersRequest.md)
 - [CoreGradesGetGradeitems200Response](docs/CoreGradesGetGradeitems200Response.md)
 - [CoreGradesGetGradeitems200ResponseGradeItemsInner](docs/CoreGradesGetGradeitems200ResponseGradeItemsInner.md)
 - [CoreGradesGetGroupsForSearchWidget200Response](docs/CoreGradesGetGroupsForSearchWidget200Response.md)
 - [CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner](docs/CoreGradesGetGroupsForSearchWidget200ResponseGroupsInner.md)
 - [CoreGradesGetGroupsForSearchWidgetRequest](docs/CoreGradesGetGroupsForSearchWidgetRequest.md)
 - [CoreGradesGetGroupsForSelector200Response](docs/CoreGradesGetGroupsForSelector200Response.md)
 - [CoreGradesGetGroupsForSelector200ResponseGroupsInner](docs/CoreGradesGetGroupsForSelector200ResponseGroupsInner.md)
 - [CoreGradesGraderGradingpanelPointFetch200Response](docs/CoreGradesGraderGradingpanelPointFetch200Response.md)
 - [CoreGradesGraderGradingpanelPointFetch200ResponseGrade](docs/CoreGradesGraderGradingpanelPointFetch200ResponseGrade.md)
 - [CoreGradesGraderGradingpanelPointFetchRequest](docs/CoreGradesGraderGradingpanelPointFetchRequest.md)
 - [CoreGradesGraderGradingpanelPointStore200Response](docs/CoreGradesGraderGradingpanelPointStore200Response.md)
 - [CoreGradesGraderGradingpanelPointStore200ResponseGrade](docs/CoreGradesGraderGradingpanelPointStore200ResponseGrade.md)
 - [CoreGradesGraderGradingpanelPointStoreRequest](docs/CoreGradesGraderGradingpanelPointStoreRequest.md)
 - [CoreGradesGraderGradingpanelScaleFetch200Response](docs/CoreGradesGraderGradingpanelScaleFetch200Response.md)
 - [CoreGradesGraderGradingpanelScaleFetch200ResponseGrade](docs/CoreGradesGraderGradingpanelScaleFetch200ResponseGrade.md)
 - [CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner](docs/CoreGradesGraderGradingpanelScaleFetch200ResponseGradeOptionsInner.md)
 - [CoreGradesGraderGradingpanelScaleFetchRequest](docs/CoreGradesGraderGradingpanelScaleFetchRequest.md)
 - [CoreGradesGraderGradingpanelScaleStore200Response](docs/CoreGradesGraderGradingpanelScaleStore200Response.md)
 - [CoreGradesGraderGradingpanelScaleStore200ResponseGrade](docs/CoreGradesGraderGradingpanelScaleStore200ResponseGrade.md)
 - [CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner](docs/CoreGradesGraderGradingpanelScaleStore200ResponseGradeOptionsInner.md)
 - [CoreGradesGraderGradingpanelScaleStoreRequest](docs/CoreGradesGraderGradingpanelScaleStoreRequest.md)
 - [CoreGradesUpdateGradesRequest](docs/CoreGradesUpdateGradesRequest.md)
 - [CoreGradesUpdateGradesRequestGradesInner](docs/CoreGradesUpdateGradesRequestGradesInner.md)
 - [CoreGradesUpdateGradesRequestItemdetails](docs/CoreGradesUpdateGradesRequestItemdetails.md)
 - [CoreGradingGetDefinitions200Response](docs/CoreGradingGetDefinitions200Response.md)
 - [CoreGradingGetDefinitions200ResponseAreasInner](docs/CoreGradingGetDefinitions200ResponseAreasInner.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCommentsInner.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideGuideCriteriaInner.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInner.md)
 - [CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner](docs/CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md)
 - [CoreGradingGetDefinitionsRequest](docs/CoreGradingGetDefinitionsRequest.md)
 - [CoreGradingGetGradingformInstances200Response](docs/CoreGradingGetGradingformInstances200Response.md)
 - [CoreGradingGetGradingformInstances200ResponseInstancesInner](docs/CoreGradingGetGradingformInstances200ResponseInstancesInner.md)
 - [CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide](docs/CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide.md)
 - [CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner](docs/CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideCriteriaInner.md)
 - [CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric](docs/CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric.md)
 - [CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner](docs/CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricCriteriaInner.md)
 - [CoreGradingGetGradingformInstancesRequest](docs/CoreGradingGetGradingformInstancesRequest.md)
 - [CoreGradingSaveDefinitionsRequest](docs/CoreGradingSaveDefinitionsRequest.md)
 - [CoreGradingSaveDefinitionsRequestAreasInner](docs/CoreGradingSaveDefinitionsRequestAreasInner.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCommentsInner.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInner.md)
 - [CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner](docs/CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricRubricCriteriaInnerLevelsInner.md)
 - [CoreGroupAddGroupMembersRequest](docs/CoreGroupAddGroupMembersRequest.md)
 - [CoreGroupAddGroupMembersRequestMembersInner](docs/CoreGroupAddGroupMembersRequestMembersInner.md)
 - [CoreGroupAssignGroupingRequest](docs/CoreGroupAssignGroupingRequest.md)
 - [CoreGroupAssignGroupingRequestAssignmentsInner](docs/CoreGroupAssignGroupingRequestAssignmentsInner.md)
 - [CoreGroupCreateGroupingsRequest](docs/CoreGroupCreateGroupingsRequest.md)
 - [CoreGroupCreateGroupingsRequestGroupingsInner](docs/CoreGroupCreateGroupingsRequestGroupingsInner.md)
 - [CoreGroupCreateGroupsRequest](docs/CoreGroupCreateGroupsRequest.md)
 - [CoreGroupCreateGroupsRequestGroupsInner](docs/CoreGroupCreateGroupsRequestGroupsInner.md)
 - [CoreGroupDeleteGroupMembersRequest](docs/CoreGroupDeleteGroupMembersRequest.md)
 - [CoreGroupDeleteGroupMembersRequestMembersInner](docs/CoreGroupDeleteGroupMembersRequestMembersInner.md)
 - [CoreGroupDeleteGroupingsRequest](docs/CoreGroupDeleteGroupingsRequest.md)
 - [CoreGroupDeleteGroupsRequest](docs/CoreGroupDeleteGroupsRequest.md)
 - [CoreGroupGetActivityAllowedGroups200Response](docs/CoreGroupGetActivityAllowedGroups200Response.md)
 - [CoreGroupGetActivityAllowedGroups200ResponseGroupsInner](docs/CoreGroupGetActivityAllowedGroups200ResponseGroupsInner.md)
 - [CoreGroupGetActivityAllowedGroupsRequest](docs/CoreGroupGetActivityAllowedGroupsRequest.md)
 - [CoreGroupGetActivityGroupmode200Response](docs/CoreGroupGetActivityGroupmode200Response.md)
 - [CoreGroupGetActivityGroupmodeRequest](docs/CoreGroupGetActivityGroupmodeRequest.md)
 - [CoreGroupGetCourseGroupingsRequest](docs/CoreGroupGetCourseGroupingsRequest.md)
 - [CoreGroupGetCourseUserGroups200Response](docs/CoreGroupGetCourseUserGroups200Response.md)
 - [CoreGroupGetCourseUserGroups200ResponseGroupsInner](docs/CoreGroupGetCourseUserGroups200ResponseGroupsInner.md)
 - [CoreGroupGetCourseUserGroupsRequest](docs/CoreGroupGetCourseUserGroupsRequest.md)
 - [CoreGroupGetGroupMembersRequest](docs/CoreGroupGetGroupMembersRequest.md)
 - [CoreGroupGetGroupingsRequest](docs/CoreGroupGetGroupingsRequest.md)
 - [CoreGroupUnassignGroupingRequest](docs/CoreGroupUnassignGroupingRequest.md)
 - [CoreGroupUnassignGroupingRequestUnassignmentsInner](docs/CoreGroupUnassignGroupingRequestUnassignmentsInner.md)
 - [CoreGroupUpdateGroupingsRequest](docs/CoreGroupUpdateGroupingsRequest.md)
 - [CoreGroupUpdateGroupingsRequestGroupingsInner](docs/CoreGroupUpdateGroupingsRequestGroupingsInner.md)
 - [CoreGroupUpdateGroupsRequest](docs/CoreGroupUpdateGroupsRequest.md)
 - [CoreGroupUpdateGroupsRequestGroupsInner](docs/CoreGroupUpdateGroupsRequestGroupsInner.md)
 - [CoreH5pGetTrustedH5pFile200Response](docs/CoreH5pGetTrustedH5pFile200Response.md)
 - [CoreH5pGetTrustedH5pFileRequest](docs/CoreH5pGetTrustedH5pFileRequest.md)
 - [CoreMessageBlockUserRequest](docs/CoreMessageBlockUserRequest.md)
 - [CoreMessageConfirmContactRequestRequest](docs/CoreMessageConfirmContactRequestRequest.md)
 - [CoreMessageCreateContactRequest200Response](docs/CoreMessageCreateContactRequest200Response.md)
 - [CoreMessageCreateContactRequest200ResponseRequest](docs/CoreMessageCreateContactRequest200ResponseRequest.md)
 - [CoreMessageCreateContactRequestRequest](docs/CoreMessageCreateContactRequestRequest.md)
 - [CoreMessageDataForMessageareaSearchMessages200Response](docs/CoreMessageDataForMessageareaSearchMessages200Response.md)
 - [CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner](docs/CoreMessageDataForMessageareaSearchMessages200ResponseContactsInner.md)
 - [CoreMessageDataForMessageareaSearchMessagesRequest](docs/CoreMessageDataForMessageareaSearchMessagesRequest.md)
 - [CoreMessageDeleteContactsRequest](docs/CoreMessageDeleteContactsRequest.md)
 - [CoreMessageDeleteConversationsByIdRequest](docs/CoreMessageDeleteConversationsByIdRequest.md)
 - [CoreMessageDeleteMessage200Response](docs/CoreMessageDeleteMessage200Response.md)
 - [CoreMessageDeleteMessageForAllUsersRequest](docs/CoreMessageDeleteMessageForAllUsersRequest.md)
 - [CoreMessageDeleteMessageRequest](docs/CoreMessageDeleteMessageRequest.md)
 - [CoreMessageGetBlockedUsers200Response](docs/CoreMessageGetBlockedUsers200Response.md)
 - [CoreMessageGetBlockedUsers200ResponseUsersInner](docs/CoreMessageGetBlockedUsers200ResponseUsersInner.md)
 - [CoreMessageGetBlockedUsersRequest](docs/CoreMessageGetBlockedUsersRequest.md)
 - [CoreMessageGetContactRequestsRequest](docs/CoreMessageGetContactRequestsRequest.md)
 - [CoreMessageGetConversation200Response](docs/CoreMessageGetConversation200Response.md)
 - [CoreMessageGetConversation200ResponseMembersInner](docs/CoreMessageGetConversation200ResponseMembersInner.md)
 - [CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner](docs/CoreMessageGetConversation200ResponseMembersInnerContactrequestsInner.md)
 - [CoreMessageGetConversation200ResponseMembersInnerConversationsInner](docs/CoreMessageGetConversation200ResponseMembersInnerConversationsInner.md)
 - [CoreMessageGetConversation200ResponseMessagesInner](docs/CoreMessageGetConversation200ResponseMessagesInner.md)
 - [CoreMessageGetConversationBetweenUsers200Response](docs/CoreMessageGetConversationBetweenUsers200Response.md)
 - [CoreMessageGetConversationBetweenUsers200ResponseMembersInner](docs/CoreMessageGetConversationBetweenUsers200ResponseMembersInner.md)
 - [CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner](docs/CoreMessageGetConversationBetweenUsers200ResponseMembersInnerContactrequestsInner.md)
 - [CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner](docs/CoreMessageGetConversationBetweenUsers200ResponseMembersInnerConversationsInner.md)
 - [CoreMessageGetConversationBetweenUsers200ResponseMessagesInner](docs/CoreMessageGetConversationBetweenUsers200ResponseMessagesInner.md)
 - [CoreMessageGetConversationBetweenUsersRequest](docs/CoreMessageGetConversationBetweenUsersRequest.md)
 - [CoreMessageGetConversationCounts200Response](docs/CoreMessageGetConversationCounts200Response.md)
 - [CoreMessageGetConversationCounts200ResponseTypes](docs/CoreMessageGetConversationCounts200ResponseTypes.md)
 - [CoreMessageGetConversationCountsRequest](docs/CoreMessageGetConversationCountsRequest.md)
 - [CoreMessageGetConversationMembersRequest](docs/CoreMessageGetConversationMembersRequest.md)
 - [CoreMessageGetConversationMessages200Response](docs/CoreMessageGetConversationMessages200Response.md)
 - [CoreMessageGetConversationMessagesRequest](docs/CoreMessageGetConversationMessagesRequest.md)
 - [CoreMessageGetConversationRequest](docs/CoreMessageGetConversationRequest.md)
 - [CoreMessageGetConversations200Response](docs/CoreMessageGetConversations200Response.md)
 - [CoreMessageGetConversations200ResponseConversationsInner](docs/CoreMessageGetConversations200ResponseConversationsInner.md)
 - [CoreMessageGetConversationsRequest](docs/CoreMessageGetConversationsRequest.md)
 - [CoreMessageGetMemberInfoRequest](docs/CoreMessageGetMemberInfoRequest.md)
 - [CoreMessageGetMessageProcessor200Response](docs/CoreMessageGetMessageProcessor200Response.md)
 - [CoreMessageGetMessageProcessorRequest](docs/CoreMessageGetMessageProcessorRequest.md)
 - [CoreMessageGetMessages200Response](docs/CoreMessageGetMessages200Response.md)
 - [CoreMessageGetMessages200ResponseMessagesInner](docs/CoreMessageGetMessages200ResponseMessagesInner.md)
 - [CoreMessageGetMessagesRequest](docs/CoreMessageGetMessagesRequest.md)
 - [CoreMessageGetReceivedContactRequestsCountRequest](docs/CoreMessageGetReceivedContactRequestsCountRequest.md)
 - [CoreMessageGetSelfConversationRequest](docs/CoreMessageGetSelfConversationRequest.md)
 - [CoreMessageGetUnreadConversationCounts200Response](docs/CoreMessageGetUnreadConversationCounts200Response.md)
 - [CoreMessageGetUnreadConversationCounts200ResponseTypes](docs/CoreMessageGetUnreadConversationCounts200ResponseTypes.md)
 - [CoreMessageGetUnreadConversationsCountRequest](docs/CoreMessageGetUnreadConversationsCountRequest.md)
 - [CoreMessageGetUnreadNotificationCountRequest](docs/CoreMessageGetUnreadNotificationCountRequest.md)
 - [CoreMessageGetUserContactsRequest](docs/CoreMessageGetUserContactsRequest.md)
 - [CoreMessageGetUserMessagePreferences200Response](docs/CoreMessageGetUserMessagePreferences200Response.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferences](docs/CoreMessageGetUserMessagePreferences200ResponsePreferences.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInner.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInner.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedin.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInnerLoggedoff.md)
 - [CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner](docs/CoreMessageGetUserMessagePreferences200ResponsePreferencesProcessorsInner.md)
 - [CoreMessageGetUserNotificationPreferences200Response](docs/CoreMessageGetUserNotificationPreferences200Response.md)
 - [CoreMessageGetUserNotificationPreferences200ResponsePreferences](docs/CoreMessageGetUserNotificationPreferences200ResponsePreferences.md)
 - [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner](docs/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInner.md)
 - [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner](docs/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInner.md)
 - [CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner](docs/CoreMessageGetUserNotificationPreferences200ResponsePreferencesComponentsInnerNotificationsInnerProcessorsInner.md)
 - [CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner](docs/CoreMessageGetUserNotificationPreferences200ResponsePreferencesProcessorsInner.md)
 - [CoreMessageMarkAllConversationMessagesAsReadRequest](docs/CoreMessageMarkAllConversationMessagesAsReadRequest.md)
 - [CoreMessageMarkAllNotificationsAsReadRequest](docs/CoreMessageMarkAllNotificationsAsReadRequest.md)
 - [CoreMessageMarkMessageRead200Response](docs/CoreMessageMarkMessageRead200Response.md)
 - [CoreMessageMarkMessageReadRequest](docs/CoreMessageMarkMessageReadRequest.md)
 - [CoreMessageMarkNotificationRead200Response](docs/CoreMessageMarkNotificationRead200Response.md)
 - [CoreMessageMarkNotificationReadRequest](docs/CoreMessageMarkNotificationReadRequest.md)
 - [CoreMessageMessageProcessorConfigFormRequest](docs/CoreMessageMessageProcessorConfigFormRequest.md)
 - [CoreMessageMessageProcessorConfigFormRequestFormvaluesInner](docs/CoreMessageMessageProcessorConfigFormRequestFormvaluesInner.md)
 - [CoreMessageMessageSearchUsers200Response](docs/CoreMessageMessageSearchUsers200Response.md)
 - [CoreMessageMessageSearchUsersRequest](docs/CoreMessageMessageSearchUsersRequest.md)
 - [CoreMessageMuteConversationsRequest](docs/CoreMessageMuteConversationsRequest.md)
 - [CoreMessageSearchContactsRequest](docs/CoreMessageSearchContactsRequest.md)
 - [CoreMessageSendInstantMessagesRequest](docs/CoreMessageSendInstantMessagesRequest.md)
 - [CoreMessageSendInstantMessagesRequestMessagesInner](docs/CoreMessageSendInstantMessagesRequestMessagesInner.md)
 - [CoreMessageSendMessagesToConversationRequest](docs/CoreMessageSendMessagesToConversationRequest.md)
 - [CoreMessageSendMessagesToConversationRequestMessagesInner](docs/CoreMessageSendMessagesToConversationRequestMessagesInner.md)
 - [CoreMessageSetFavouriteConversationsRequest](docs/CoreMessageSetFavouriteConversationsRequest.md)
 - [CoreMessageUnblockUserRequest](docs/CoreMessageUnblockUserRequest.md)
 - [CoreMessageUnmuteConversationsRequest](docs/CoreMessageUnmuteConversationsRequest.md)
 - [CoreMoodlenetAuthCheck200Response](docs/CoreMoodlenetAuthCheck200Response.md)
 - [CoreMoodlenetAuthCheckRequest](docs/CoreMoodlenetAuthCheckRequest.md)
 - [CoreMoodlenetGetShareInfoActivity200Response](docs/CoreMoodlenetGetShareInfoActivity200Response.md)
 - [CoreMoodlenetGetShareInfoActivityRequest](docs/CoreMoodlenetGetShareInfoActivityRequest.md)
 - [CoreMoodlenetGetSharedCourseInfo200Response](docs/CoreMoodlenetGetSharedCourseInfo200Response.md)
 - [CoreMoodlenetGetSharedCourseInfoRequest](docs/CoreMoodlenetGetSharedCourseInfoRequest.md)
 - [CoreMoodlenetSendActivity200Response](docs/CoreMoodlenetSendActivity200Response.md)
 - [CoreMoodlenetSendActivityRequest](docs/CoreMoodlenetSendActivityRequest.md)
 - [CoreMoodlenetSendCourse200Response](docs/CoreMoodlenetSendCourse200Response.md)
 - [CoreMoodlenetSendCourseRequest](docs/CoreMoodlenetSendCourseRequest.md)
 - [CoreMyViewPageRequest](docs/CoreMyViewPageRequest.md)
 - [CoreNotesCreateNotesRequest](docs/CoreNotesCreateNotesRequest.md)
 - [CoreNotesCreateNotesRequestNotesInner](docs/CoreNotesCreateNotesRequestNotesInner.md)
 - [CoreNotesDeleteNotesRequest](docs/CoreNotesDeleteNotesRequest.md)
 - [CoreNotesGetCourseNotes200Response](docs/CoreNotesGetCourseNotes200Response.md)
 - [CoreNotesGetCourseNotes200ResponseCoursenotesInner](docs/CoreNotesGetCourseNotes200ResponseCoursenotesInner.md)
 - [CoreNotesGetCourseNotes200ResponsePersonalnotesInner](docs/CoreNotesGetCourseNotes200ResponsePersonalnotesInner.md)
 - [CoreNotesGetCourseNotesRequest](docs/CoreNotesGetCourseNotesRequest.md)
 - [CoreNotesGetNotes200Response](docs/CoreNotesGetNotes200Response.md)
 - [CoreNotesGetNotes200ResponseNotesInner](docs/CoreNotesGetNotes200ResponseNotesInner.md)
 - [CoreNotesGetNotes200ResponseWarningsInner](docs/CoreNotesGetNotes200ResponseWarningsInner.md)
 - [CoreNotesGetNotesRequest](docs/CoreNotesGetNotesRequest.md)
 - [CoreNotesUpdateNotesRequest](docs/CoreNotesUpdateNotesRequest.md)
 - [CoreNotesUpdateNotesRequestNotesInner](docs/CoreNotesUpdateNotesRequestNotesInner.md)
 - [CoreNotesViewNotesRequest](docs/CoreNotesViewNotesRequest.md)
 - [CoreOutputLoadFontawesomeIconSystemMapRequest](docs/CoreOutputLoadFontawesomeIconSystemMapRequest.md)
 - [CoreOutputLoadTemplateRequest](docs/CoreOutputLoadTemplateRequest.md)
 - [CoreOutputLoadTemplateWithDependencies200Response](docs/CoreOutputLoadTemplateWithDependencies200Response.md)
 - [CoreOutputLoadTemplateWithDependencies200ResponseStringsInner](docs/CoreOutputLoadTemplateWithDependencies200ResponseStringsInner.md)
 - [CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner](docs/CoreOutputLoadTemplateWithDependencies200ResponseTemplatesInner.md)
 - [CoreOutputLoadTemplateWithDependenciesRequest](docs/CoreOutputLoadTemplateWithDependenciesRequest.md)
 - [CorePaymentGetAvailableGatewaysRequest](docs/CorePaymentGetAvailableGatewaysRequest.md)
 - [CoreQuestionGetRandomQuestionSummaries200Response](docs/CoreQuestionGetRandomQuestionSummaries200Response.md)
 - [CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner](docs/CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInner.md)
 - [CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon](docs/CoreQuestionGetRandomQuestionSummaries200ResponseQuestionsInnerIcon.md)
 - [CoreQuestionGetRandomQuestionSummariesRequest](docs/CoreQuestionGetRandomQuestionSummariesRequest.md)
 - [CoreQuestionSubmitTagsForm200Response](docs/CoreQuestionSubmitTagsForm200Response.md)
 - [CoreQuestionSubmitTagsFormRequest](docs/CoreQuestionSubmitTagsFormRequest.md)
 - [CoreQuestionUpdateFlagRequest](docs/CoreQuestionUpdateFlagRequest.md)
 - [CoreRatingAddRating200Response](docs/CoreRatingAddRating200Response.md)
 - [CoreRatingAddRatingRequest](docs/CoreRatingAddRatingRequest.md)
 - [CoreRatingGetItemRatings200Response](docs/CoreRatingGetItemRatings200Response.md)
 - [CoreRatingGetItemRatings200ResponseRatingsInner](docs/CoreRatingGetItemRatings200ResponseRatingsInner.md)
 - [CoreRatingGetItemRatingsRequest](docs/CoreRatingGetItemRatingsRequest.md)
 - [CoreReportbuilderAudiencesDeleteRequest](docs/CoreReportbuilderAudiencesDeleteRequest.md)
 - [CoreReportbuilderCanViewSystemReportRequest](docs/CoreReportbuilderCanViewSystemReportRequest.md)
 - [CoreReportbuilderCanViewSystemReportRequestParametersInner](docs/CoreReportbuilderCanViewSystemReportRequestParametersInner.md)
 - [CoreReportbuilderColumnsAdd200Response](docs/CoreReportbuilderColumnsAdd200Response.md)
 - [CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner](docs/CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInner.md)
 - [CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon](docs/CoreReportbuilderColumnsAdd200ResponseSortablecolumnsInnerSorticon.md)
 - [CoreReportbuilderColumnsAddRequest](docs/CoreReportbuilderColumnsAddRequest.md)
 - [CoreReportbuilderColumnsDelete200Response](docs/CoreReportbuilderColumnsDelete200Response.md)
 - [CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner](docs/CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInner.md)
 - [CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon](docs/CoreReportbuilderColumnsDelete200ResponseSortablecolumnsInnerSorticon.md)
 - [CoreReportbuilderColumnsDeleteRequest](docs/CoreReportbuilderColumnsDeleteRequest.md)
 - [CoreReportbuilderColumnsReorderRequest](docs/CoreReportbuilderColumnsReorderRequest.md)
 - [CoreReportbuilderColumnsSortGetRequest](docs/CoreReportbuilderColumnsSortGetRequest.md)
 - [CoreReportbuilderColumnsSortReorderRequest](docs/CoreReportbuilderColumnsSortReorderRequest.md)
 - [CoreReportbuilderColumnsSortToggleRequest](docs/CoreReportbuilderColumnsSortToggleRequest.md)
 - [CoreReportbuilderConditionsAdd200Response](docs/CoreReportbuilderConditionsAdd200Response.md)
 - [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner](docs/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInner.md)
 - [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup](docs/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroup.md)
 - [CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner](docs/CoreReportbuilderConditionsAdd200ResponseAvailableconditionsInnerOptiongroupValuesInner.md)
 - [CoreReportbuilderConditionsAddRequest](docs/CoreReportbuilderConditionsAddRequest.md)
 - [CoreReportbuilderConditionsDelete200Response](docs/CoreReportbuilderConditionsDelete200Response.md)
 - [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner](docs/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInner.md)
 - [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup](docs/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroup.md)
 - [CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner](docs/CoreReportbuilderConditionsDelete200ResponseAvailableconditionsInnerOptiongroupValuesInner.md)
 - [CoreReportbuilderConditionsDeleteRequest](docs/CoreReportbuilderConditionsDeleteRequest.md)
 - [CoreReportbuilderConditionsReorderRequest](docs/CoreReportbuilderConditionsReorderRequest.md)
 - [CoreReportbuilderFiltersAdd200Response](docs/CoreReportbuilderFiltersAdd200Response.md)
 - [CoreReportbuilderFiltersAdd200ResponseActivefiltersInner](docs/CoreReportbuilderFiltersAdd200ResponseActivefiltersInner.md)
 - [CoreReportbuilderFiltersAddRequest](docs/CoreReportbuilderFiltersAddRequest.md)
 - [CoreReportbuilderFiltersDelete200Response](docs/CoreReportbuilderFiltersDelete200Response.md)
 - [CoreReportbuilderFiltersDelete200ResponseActivefiltersInner](docs/CoreReportbuilderFiltersDelete200ResponseActivefiltersInner.md)
 - [CoreReportbuilderFiltersDeleteRequest](docs/CoreReportbuilderFiltersDeleteRequest.md)
 - [CoreReportbuilderFiltersReorderRequest](docs/CoreReportbuilderFiltersReorderRequest.md)
 - [CoreReportbuilderFiltersResetRequest](docs/CoreReportbuilderFiltersResetRequest.md)
 - [CoreReportbuilderListReports200Response](docs/CoreReportbuilderListReports200Response.md)
 - [CoreReportbuilderListReports200ResponseReportsInner](docs/CoreReportbuilderListReports200ResponseReportsInner.md)
 - [CoreReportbuilderListReportsRequest](docs/CoreReportbuilderListReportsRequest.md)
 - [CoreReportbuilderReportsGet200Response](docs/CoreReportbuilderReportsGet200Response.md)
 - [CoreReportbuilderReportsGet200ResponseAttributesInner](docs/CoreReportbuilderReportsGet200ResponseAttributesInner.md)
 - [CoreReportbuilderReportsGet200ResponseCardview](docs/CoreReportbuilderReportsGet200ResponseCardview.md)
 - [CoreReportbuilderReportsGet200ResponseSidebarmenucards](docs/CoreReportbuilderReportsGet200ResponseSidebarmenucards.md)
 - [CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner](docs/CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInner.md)
 - [CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner](docs/CoreReportbuilderReportsGet200ResponseSidebarmenucardsMenucardsInnerItemsInner.md)
 - [CoreReportbuilderReportsGetRequest](docs/CoreReportbuilderReportsGetRequest.md)
 - [CoreReportbuilderRetrieveReport200Response](docs/CoreReportbuilderRetrieveReport200Response.md)
 - [CoreReportbuilderRetrieveReport200ResponseData](docs/CoreReportbuilderRetrieveReport200ResponseData.md)
 - [CoreReportbuilderRetrieveReport200ResponseDataRowsInner](docs/CoreReportbuilderRetrieveReport200ResponseDataRowsInner.md)
 - [CoreReportbuilderRetrieveReport200ResponseDetails](docs/CoreReportbuilderRetrieveReport200ResponseDetails.md)
 - [CoreReportbuilderRetrieveReportRequest](docs/CoreReportbuilderRetrieveReportRequest.md)
 - [CoreReportbuilderRetrieveSystemReport200Response](docs/CoreReportbuilderRetrieveSystemReport200Response.md)
 - [CoreReportbuilderRetrieveSystemReport200ResponseData](docs/CoreReportbuilderRetrieveSystemReport200ResponseData.md)
 - [CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner](docs/CoreReportbuilderRetrieveSystemReport200ResponseDataRowsInner.md)
 - [CoreReportbuilderRetrieveSystemReportRequest](docs/CoreReportbuilderRetrieveSystemReportRequest.md)
 - [CoreReportbuilderSchedulesDeleteRequest](docs/CoreReportbuilderSchedulesDeleteRequest.md)
 - [CoreReportbuilderSchedulesSendRequest](docs/CoreReportbuilderSchedulesSendRequest.md)
 - [CoreReportbuilderSchedulesToggleRequest](docs/CoreReportbuilderSchedulesToggleRequest.md)
 - [CoreReportbuilderSetFiltersRequest](docs/CoreReportbuilderSetFiltersRequest.md)
 - [CoreReportbuilderViewReport200Response](docs/CoreReportbuilderViewReport200Response.md)
 - [CoreRoleAssignRolesRequest](docs/CoreRoleAssignRolesRequest.md)
 - [CoreRoleAssignRolesRequestAssignmentsInner](docs/CoreRoleAssignRolesRequestAssignmentsInner.md)
 - [CoreRoleUnassignRolesRequest](docs/CoreRoleUnassignRolesRequest.md)
 - [CoreRoleUnassignRolesRequestUnassignmentsInner](docs/CoreRoleUnassignRolesRequestUnassignmentsInner.md)
 - [CoreSearchGetRelevantUsersRequest](docs/CoreSearchGetRelevantUsersRequest.md)
 - [CoreSearchGetResults200Response](docs/CoreSearchGetResults200Response.md)
 - [CoreSearchGetResults200ResponseResultsInner](docs/CoreSearchGetResults200ResponseResultsInner.md)
 - [CoreSearchGetResultsRequest](docs/CoreSearchGetResultsRequest.md)
 - [CoreSearchGetResultsRequestFilters](docs/CoreSearchGetResultsRequestFilters.md)
 - [CoreSearchGetSearchAreasList200Response](docs/CoreSearchGetSearchAreasList200Response.md)
 - [CoreSearchGetSearchAreasList200ResponseAreasInner](docs/CoreSearchGetSearchAreasList200ResponseAreasInner.md)
 - [CoreSearchGetSearchAreasListRequest](docs/CoreSearchGetSearchAreasListRequest.md)
 - [CoreSearchGetTopResults200Response](docs/CoreSearchGetTopResults200Response.md)
 - [CoreSearchGetTopResults200ResponseResultsInner](docs/CoreSearchGetTopResults200ResponseResultsInner.md)
 - [CoreSearchGetTopResultsRequest](docs/CoreSearchGetTopResultsRequest.md)
 - [CoreSearchGetTopResultsRequestFilters](docs/CoreSearchGetTopResultsRequestFilters.md)
 - [CoreSearchViewResultsRequest](docs/CoreSearchViewResultsRequest.md)
 - [CoreSearchViewResultsRequestFilters](docs/CoreSearchViewResultsRequestFilters.md)
 - [CoreSessionTimeRemaining200Response](docs/CoreSessionTimeRemaining200Response.md)
 - [CoreTableGetDynamicTableContent200Response](docs/CoreTableGetDynamicTableContent200Response.md)
 - [CoreTableGetDynamicTableContentRequest](docs/CoreTableGetDynamicTableContentRequest.md)
 - [CoreTableGetDynamicTableContentRequestFiltersInner](docs/CoreTableGetDynamicTableContentRequestFiltersInner.md)
 - [CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner](docs/CoreTableGetDynamicTableContentRequestFiltersInnerFilteroptionsInner.md)
 - [CoreTableGetDynamicTableContentRequestSortdataInner](docs/CoreTableGetDynamicTableContentRequestSortdataInner.md)
 - [CoreTagGetTagAreas200Response](docs/CoreTagGetTagAreas200Response.md)
 - [CoreTagGetTagAreas200ResponseAreasInner](docs/CoreTagGetTagAreas200ResponseAreasInner.md)
 - [CoreTagGetTagCloud200Response](docs/CoreTagGetTagCloud200Response.md)
 - [CoreTagGetTagCloud200ResponseTagsInner](docs/CoreTagGetTagCloud200ResponseTagsInner.md)
 - [CoreTagGetTagCloudRequest](docs/CoreTagGetTagCloudRequest.md)
 - [CoreTagGetTagCollections200Response](docs/CoreTagGetTagCollections200Response.md)
 - [CoreTagGetTagCollections200ResponseCollectionsInner](docs/CoreTagGetTagCollections200ResponseCollectionsInner.md)
 - [CoreTagGetTagindex200Response](docs/CoreTagGetTagindex200Response.md)
 - [CoreTagGetTagindexPerAreaRequest](docs/CoreTagGetTagindexPerAreaRequest.md)
 - [CoreTagGetTagindexPerAreaRequestTagindex](docs/CoreTagGetTagindexPerAreaRequestTagindex.md)
 - [CoreTagGetTagindexRequest](docs/CoreTagGetTagindexRequest.md)
 - [CoreTagGetTagindexRequestTagindex](docs/CoreTagGetTagindexRequestTagindex.md)
 - [CoreTagGetTags200Response](docs/CoreTagGetTags200Response.md)
 - [CoreTagGetTags200ResponseTagsInner](docs/CoreTagGetTags200ResponseTagsInner.md)
 - [CoreTagGetTagsRequest](docs/CoreTagGetTagsRequest.md)
 - [CoreTagGetTagsRequestTagsInner](docs/CoreTagGetTagsRequestTagsInner.md)
 - [CoreTagUpdateTagsRequest](docs/CoreTagUpdateTagsRequest.md)
 - [CoreTagUpdateTagsRequestTagsInner](docs/CoreTagUpdateTagsRequestTagsInner.md)
 - [CoreUpdateInplaceEditable200Response](docs/CoreUpdateInplaceEditable200Response.md)
 - [CoreUpdateInplaceEditable200ResponseEditicon](docs/CoreUpdateInplaceEditable200ResponseEditicon.md)
 - [CoreUpdateInplaceEditableRequest](docs/CoreUpdateInplaceEditableRequest.md)
 - [CoreUserAddUserDeviceRequest](docs/CoreUserAddUserDeviceRequest.md)
 - [CoreUserAddUserPrivateFilesRequest](docs/CoreUserAddUserPrivateFilesRequest.md)
 - [CoreUserAgreeSitePolicy200Response](docs/CoreUserAgreeSitePolicy200Response.md)
 - [CoreUserCreateUsersRequest](docs/CoreUserCreateUsersRequest.md)
 - [CoreUserCreateUsersRequestUsersInner](docs/CoreUserCreateUsersRequestUsersInner.md)
 - [CoreUserCreateUsersRequestUsersInnerCustomfieldsInner](docs/CoreUserCreateUsersRequestUsersInnerCustomfieldsInner.md)
 - [CoreUserCreateUsersRequestUsersInnerPreferencesInner](docs/CoreUserCreateUsersRequestUsersInnerPreferencesInner.md)
 - [CoreUserDeleteUsersRequest](docs/CoreUserDeleteUsersRequest.md)
 - [CoreUserGetCourseUserProfilesRequest](docs/CoreUserGetCourseUserProfilesRequest.md)
 - [CoreUserGetCourseUserProfilesRequestUserlistInner](docs/CoreUserGetCourseUserProfilesRequestUserlistInner.md)
 - [CoreUserGetPrivateFilesInfo200Response](docs/CoreUserGetPrivateFilesInfo200Response.md)
 - [CoreUserGetPrivateFilesInfoRequest](docs/CoreUserGetPrivateFilesInfoRequest.md)
 - [CoreUserGetUserPreferences200Response](docs/CoreUserGetUserPreferences200Response.md)
 - [CoreUserGetUserPreferences200ResponsePreferencesInner](docs/CoreUserGetUserPreferences200ResponsePreferencesInner.md)
 - [CoreUserGetUserPreferencesRequest](docs/CoreUserGetUserPreferencesRequest.md)
 - [CoreUserGetUsers200Response](docs/CoreUserGetUsers200Response.md)
 - [CoreUserGetUsersByFieldRequest](docs/CoreUserGetUsersByFieldRequest.md)
 - [CoreUserGetUsersRequest](docs/CoreUserGetUsersRequest.md)
 - [CoreUserGetUsersRequestCriteriaInner](docs/CoreUserGetUsersRequestCriteriaInner.md)
 - [CoreUserRemoveUserDevice200Response](docs/CoreUserRemoveUserDevice200Response.md)
 - [CoreUserRemoveUserDeviceRequest](docs/CoreUserRemoveUserDeviceRequest.md)
 - [CoreUserSearchIdentity200Response](docs/CoreUserSearchIdentity200Response.md)
 - [CoreUserSearchIdentity200ResponseListInner](docs/CoreUserSearchIdentity200ResponseListInner.md)
 - [CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner](docs/CoreUserSearchIdentity200ResponseListInnerExtrafieldsInner.md)
 - [CoreUserSearchIdentityRequest](docs/CoreUserSearchIdentityRequest.md)
 - [CoreUserSetUserPreferences200Response](docs/CoreUserSetUserPreferences200Response.md)
 - [CoreUserSetUserPreferences200ResponseSavedInner](docs/CoreUserSetUserPreferences200ResponseSavedInner.md)
 - [CoreUserSetUserPreferencesRequest](docs/CoreUserSetUserPreferencesRequest.md)
 - [CoreUserSetUserPreferencesRequestPreferencesInner](docs/CoreUserSetUserPreferencesRequestPreferencesInner.md)
 - [CoreUserUpdatePicture200Response](docs/CoreUserUpdatePicture200Response.md)
 - [CoreUserUpdatePictureRequest](docs/CoreUserUpdatePictureRequest.md)
 - [CoreUserUpdateUserDevicePublicKey200Response](docs/CoreUserUpdateUserDevicePublicKey200Response.md)
 - [CoreUserUpdateUserDevicePublicKeyRequest](docs/CoreUserUpdateUserDevicePublicKeyRequest.md)
 - [CoreUserUpdateUserPreferencesRequest](docs/CoreUserUpdateUserPreferencesRequest.md)
 - [CoreUserUpdateUserPreferencesRequestPreferencesInner](docs/CoreUserUpdateUserPreferencesRequestPreferencesInner.md)
 - [CoreUserUpdateUsersRequest](docs/CoreUserUpdateUsersRequest.md)
 - [CoreUserUpdateUsersRequestUsersInner](docs/CoreUserUpdateUsersRequestUsersInner.md)
 - [CoreUserUpdateUsersRequestUsersInnerPreferencesInner](docs/CoreUserUpdateUsersRequestUsersInnerPreferencesInner.md)
 - [CoreUserViewUserListRequest](docs/CoreUserViewUserListRequest.md)
 - [CoreUserViewUserProfileRequest](docs/CoreUserViewUserProfileRequest.md)
 - [CoreWebserviceGetSiteInfo200Response](docs/CoreWebserviceGetSiteInfo200Response.md)
 - [CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner](docs/CoreWebserviceGetSiteInfo200ResponseAdvancedfeaturesInner.md)
 - [CoreWebserviceGetSiteInfo200ResponseFunctionsInner](docs/CoreWebserviceGetSiteInfo200ResponseFunctionsInner.md)
 - [CoreWebserviceGetSiteInfoRequest](docs/CoreWebserviceGetSiteInfoRequest.md)
 - [CoreXapiDeleteStateRequest](docs/CoreXapiDeleteStateRequest.md)
 - [CoreXapiDeleteStatesRequest](docs/CoreXapiDeleteStatesRequest.md)
 - [CoreXapiGetStateRequest](docs/CoreXapiGetStateRequest.md)
 - [CoreXapiGetStatesRequest](docs/CoreXapiGetStatesRequest.md)
 - [CoreXapiPostStateRequest](docs/CoreXapiPostStateRequest.md)
 - [CoreXapiStatementPostRequest](docs/CoreXapiStatementPostRequest.md)
 - [EnrolGuestGetInstanceInfo200Response](docs/EnrolGuestGetInstanceInfo200Response.md)
 - [EnrolGuestGetInstanceInfo200ResponseInstanceinfo](docs/EnrolGuestGetInstanceInfo200ResponseInstanceinfo.md)
 - [EnrolGuestGetInstanceInfoRequest](docs/EnrolGuestGetInstanceInfoRequest.md)
 - [EnrolGuestValidatePassword200Response](docs/EnrolGuestValidatePassword200Response.md)
 - [EnrolGuestValidatePasswordRequest](docs/EnrolGuestValidatePasswordRequest.md)
 - [EnrolLicenseEnrolUser200Response](docs/EnrolLicenseEnrolUser200Response.md)
 - [EnrolLicenseEnrolUserRequest](docs/EnrolLicenseEnrolUserRequest.md)
 - [EnrolLicenseGetInstanceInfo200Response](docs/EnrolLicenseGetInstanceInfo200Response.md)
 - [EnrolLicenseGetInstanceInfoRequest](docs/EnrolLicenseGetInstanceInfoRequest.md)
 - [EnrolManualEnrolUsersRequest](docs/EnrolManualEnrolUsersRequest.md)
 - [EnrolManualEnrolUsersRequestEnrolmentsInner](docs/EnrolManualEnrolUsersRequestEnrolmentsInner.md)
 - [EnrolManualUnenrolUsersRequest](docs/EnrolManualUnenrolUsersRequest.md)
 - [EnrolManualUnenrolUsersRequestEnrolmentsInner](docs/EnrolManualUnenrolUsersRequestEnrolmentsInner.md)
 - [EnrolMetaAddInstancesRequest](docs/EnrolMetaAddInstancesRequest.md)
 - [EnrolMetaAddInstancesRequestInstancesInner](docs/EnrolMetaAddInstancesRequestInstancesInner.md)
 - [EnrolMetaDeleteInstancesRequest](docs/EnrolMetaDeleteInstancesRequest.md)
 - [EnrolMetaDeleteInstancesRequestInstancesInner](docs/EnrolMetaDeleteInstancesRequestInstancesInner.md)
 - [EnrolSelfEnrolUser200Response](docs/EnrolSelfEnrolUser200Response.md)
 - [EnrolSelfEnrolUserRequest](docs/EnrolSelfEnrolUserRequest.md)
 - [EnrolSelfGetInstanceInfo200Response](docs/EnrolSelfGetInstanceInfo200Response.md)
 - [EnrolSelfGetInstanceInfoRequest](docs/EnrolSelfGetInstanceInfoRequest.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GradereportOverviewGetCourseGrades200Response](docs/GradereportOverviewGetCourseGrades200Response.md)
 - [GradereportOverviewGetCourseGrades200ResponseGradesInner](docs/GradereportOverviewGetCourseGrades200ResponseGradesInner.md)
 - [GradereportOverviewGetCourseGradesRequest](docs/GradereportOverviewGetCourseGradesRequest.md)
 - [GradereportOverviewViewGradeReportRequest](docs/GradereportOverviewViewGradeReportRequest.md)
 - [GradereportSingleviewGetGradeItemsForSearchWidget200Response](docs/GradereportSingleviewGetGradeItemsForSearchWidget200Response.md)
 - [GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner](docs/GradereportSingleviewGetGradeItemsForSearchWidget200ResponseGradeitemsInner.md)
 - [GradereportUserGetAccessInformation200Response](docs/GradereportUserGetAccessInformation200Response.md)
 - [GradereportUserGetAccessInformationRequest](docs/GradereportUserGetAccessInformationRequest.md)
 - [GradereportUserGetGradeItems200Response](docs/GradereportUserGetGradeItems200Response.md)
 - [GradereportUserGetGradeItems200ResponseUsergradesInner](docs/GradereportUserGetGradeItems200ResponseUsergradesInner.md)
 - [GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner](docs/GradereportUserGetGradeItems200ResponseUsergradesInnerGradeitemsInner.md)
 - [GradereportUserGetGradeItemsRequest](docs/GradereportUserGetGradeItemsRequest.md)
 - [GradereportUserGetGradesTable200Response](docs/GradereportUserGetGradesTable200Response.md)
 - [GradereportUserGetGradesTable200ResponseTablesInner](docs/GradereportUserGetGradesTable200ResponseTablesInner.md)
 - [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner](docs/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.md)
 - [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage](docs/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage.md)
 - [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal](docs/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal.md)
 - [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname](docs/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname.md)
 - [GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader](docs/GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader.md)
 - [GradingformGuideGraderGradingpanelFetch200Response](docs/GradingformGuideGraderGradingpanelFetch200Response.md)
 - [GradingformGuideGraderGradingpanelFetch200ResponseGrade](docs/GradingformGuideGraderGradingpanelFetch200ResponseGrade.md)
 - [GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner](docs/GradingformGuideGraderGradingpanelFetch200ResponseGradeCommentsInner.md)
 - [GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner](docs/GradingformGuideGraderGradingpanelFetch200ResponseGradeCriterionInner.md)
 - [GradingformGuideGraderGradingpanelStore200Response](docs/GradingformGuideGraderGradingpanelStore200Response.md)
 - [GradingformGuideGraderGradingpanelStore200ResponseGrade](docs/GradingformGuideGraderGradingpanelStore200ResponseGrade.md)
 - [GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner](docs/GradingformGuideGraderGradingpanelStore200ResponseGradeCommentsInner.md)
 - [GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner](docs/GradingformGuideGraderGradingpanelStore200ResponseGradeCriterionInner.md)
 - [GradingformRubricGraderGradingpanelFetch200Response](docs/GradingformRubricGraderGradingpanelFetch200Response.md)
 - [GradingformRubricGraderGradingpanelFetch200ResponseGrade](docs/GradingformRubricGraderGradingpanelFetch200ResponseGrade.md)
 - [GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner](docs/GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInner.md)
 - [GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerLevelsInner](docs/GradingformRubricGraderGradingpanelFetch200ResponseGradeCriteriaInnerLevelsInner.md)
 - [GradingformRubricGraderGradingpanelStore200Response](docs/GradingformRubricGraderGradingpanelStore200Response.md)
 - [GradingformRubricGraderGradingpanelStore200ResponseGrade](docs/GradingformRubricGraderGradingpanelStore200ResponseGrade.md)
 - [GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner](docs/GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInner.md)
 - [GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner](docs/GradingformRubricGraderGradingpanelStore200ResponseGradeCriteriaInnerLevelsInner.md)
 - [LocalIomadLearningpathActivateRequest](docs/LocalIomadLearningpathActivateRequest.md)
 - [LocalIomadLearningpathAddcoursesRequest](docs/LocalIomadLearningpathAddcoursesRequest.md)
 - [LocalIomadLearningpathAddusersRequest](docs/LocalIomadLearningpathAddusersRequest.md)
 - [LocalIomadLearningpathCopypathRequest](docs/LocalIomadLearningpathCopypathRequest.md)
 - [LocalIomadLearningpathGetcoursesRequest](docs/LocalIomadLearningpathGetcoursesRequest.md)
 - [LocalIomadLearningpathGetprospectivecoursesRequest](docs/LocalIomadLearningpathGetprospectivecoursesRequest.md)
 - [LocalIomadLearningpathGetprospectiveusersRequest](docs/LocalIomadLearningpathGetprospectiveusersRequest.md)
 - [LocalIomadLearningpathGetusersRequest](docs/LocalIomadLearningpathGetusersRequest.md)
 - [LocalIomadLearningpathOrdercoursesRequest](docs/LocalIomadLearningpathOrdercoursesRequest.md)
 - [LocalIomadLearningpathOrdercoursesRequestCoursesInner](docs/LocalIomadLearningpathOrdercoursesRequestCoursesInner.md)
 - [LocalIomadLearningpathRemovecoursesRequest](docs/LocalIomadLearningpathRemovecoursesRequest.md)
 - [LocalIomadLearningpathRemoveusersRequest](docs/LocalIomadLearningpathRemoveusersRequest.md)
 - [MediaVideojsGetLanguageRequest](docs/MediaVideojsGetLanguageRequest.md)
 - [MessageAirnotifierAreNotificationPreferencesConfigured200Response](docs/MessageAirnotifierAreNotificationPreferencesConfigured200Response.md)
 - [MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner](docs/MessageAirnotifierAreNotificationPreferencesConfigured200ResponseUsersInner.md)
 - [MessageAirnotifierAreNotificationPreferencesConfiguredRequest](docs/MessageAirnotifierAreNotificationPreferencesConfiguredRequest.md)
 - [MessageAirnotifierEnableDevice200Response](docs/MessageAirnotifierEnableDevice200Response.md)
 - [MessageAirnotifierEnableDeviceRequest](docs/MessageAirnotifierEnableDeviceRequest.md)
 - [MessageAirnotifierGetUserDevices200Response](docs/MessageAirnotifierGetUserDevices200Response.md)
 - [MessageAirnotifierGetUserDevices200ResponseDevicesInner](docs/MessageAirnotifierGetUserDevices200ResponseDevicesInner.md)
 - [MessageAirnotifierGetUserDevicesRequest](docs/MessageAirnotifierGetUserDevicesRequest.md)
 - [MessagePopupGetPopupNotifications200Response](docs/MessagePopupGetPopupNotifications200Response.md)
 - [MessagePopupGetPopupNotifications200ResponseNotificationsInner](docs/MessagePopupGetPopupNotifications200ResponseNotificationsInner.md)
 - [MessagePopupGetPopupNotificationsRequest](docs/MessagePopupGetPopupNotificationsRequest.md)
 - [ModAssignCopyPreviousAttemptRequest](docs/ModAssignCopyPreviousAttemptRequest.md)
 - [ModAssignGetAssignments200Response](docs/ModAssignGetAssignments200Response.md)
 - [ModAssignGetAssignments200ResponseCoursesInner](docs/ModAssignGetAssignments200ResponseCoursesInner.md)
 - [ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner](docs/ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner.md)
 - [ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner](docs/ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInnerConfigsInner.md)
 - [ModAssignGetAssignments200ResponseWarningsInner](docs/ModAssignGetAssignments200ResponseWarningsInner.md)
 - [ModAssignGetAssignmentsRequest](docs/ModAssignGetAssignmentsRequest.md)
 - [ModAssignGetGrades200Response](docs/ModAssignGetGrades200Response.md)
 - [ModAssignGetGrades200ResponseAssignmentsInner](docs/ModAssignGetGrades200ResponseAssignmentsInner.md)
 - [ModAssignGetGrades200ResponseAssignmentsInnerGradesInner](docs/ModAssignGetGrades200ResponseAssignmentsInnerGradesInner.md)
 - [ModAssignGetGrades200ResponseWarningsInner](docs/ModAssignGetGrades200ResponseWarningsInner.md)
 - [ModAssignGetGradesRequest](docs/ModAssignGetGradesRequest.md)
 - [ModAssignGetParticipant200Response](docs/ModAssignGetParticipant200Response.md)
 - [ModAssignGetParticipant200ResponseUser](docs/ModAssignGetParticipant200ResponseUser.md)
 - [ModAssignGetParticipantRequest](docs/ModAssignGetParticipantRequest.md)
 - [ModAssignGetSubmissionStatus200Response](docs/ModAssignGetSubmissionStatus200Response.md)
 - [ModAssignGetSubmissionStatus200ResponseAssignmentdata](docs/ModAssignGetSubmissionStatus200ResponseAssignmentdata.md)
 - [ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments](docs/ModAssignGetSubmissionStatus200ResponseAssignmentdataAttachments.md)
 - [ModAssignGetSubmissionStatus200ResponseFeedback](docs/ModAssignGetSubmissionStatus200ResponseFeedback.md)
 - [ModAssignGetSubmissionStatus200ResponseFeedbackGrade](docs/ModAssignGetSubmissionStatus200ResponseFeedbackGrade.md)
 - [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner](docs/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner.md)
 - [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner](docs/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner.md)
 - [ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner](docs/ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner.md)
 - [ModAssignGetSubmissionStatus200ResponseGradingsummary](docs/ModAssignGetSubmissionStatus200ResponseGradingsummary.md)
 - [ModAssignGetSubmissionStatus200ResponseLastattempt](docs/ModAssignGetSubmissionStatus200ResponseLastattempt.md)
 - [ModAssignGetSubmissionStatus200ResponseLastattemptSubmission](docs/ModAssignGetSubmissionStatus200ResponseLastattemptSubmission.md)
 - [ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner](docs/ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner.md)
 - [ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner](docs/ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner.md)
 - [ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission](docs/ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission.md)
 - [ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner](docs/ModAssignGetSubmissionStatus200ResponsePreviousattemptsInner.md)
 - [ModAssignGetSubmissionStatusRequest](docs/ModAssignGetSubmissionStatusRequest.md)
 - [ModAssignGetSubmissions200Response](docs/ModAssignGetSubmissions200Response.md)
 - [ModAssignGetSubmissions200ResponseAssignmentsInner](docs/ModAssignGetSubmissions200ResponseAssignmentsInner.md)
 - [ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner](docs/ModAssignGetSubmissions200ResponseAssignmentsInnerSubmissionsInner.md)
 - [ModAssignGetSubmissionsRequest](docs/ModAssignGetSubmissionsRequest.md)
 - [ModAssignGetUserFlags200Response](docs/ModAssignGetUserFlags200Response.md)
 - [ModAssignGetUserFlags200ResponseAssignmentsInner](docs/ModAssignGetUserFlags200ResponseAssignmentsInner.md)
 - [ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner](docs/ModAssignGetUserFlags200ResponseAssignmentsInnerUserflagsInner.md)
 - [ModAssignGetUserFlags200ResponseWarningsInner](docs/ModAssignGetUserFlags200ResponseWarningsInner.md)
 - [ModAssignGetUserFlagsRequest](docs/ModAssignGetUserFlagsRequest.md)
 - [ModAssignGetUserMappings200Response](docs/ModAssignGetUserMappings200Response.md)
 - [ModAssignGetUserMappings200ResponseAssignmentsInner](docs/ModAssignGetUserMappings200ResponseAssignmentsInner.md)
 - [ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner](docs/ModAssignGetUserMappings200ResponseAssignmentsInnerMappingsInner.md)
 - [ModAssignGetUserMappings200ResponseWarningsInner](docs/ModAssignGetUserMappings200ResponseWarningsInner.md)
 - [ModAssignListParticipantsRequest](docs/ModAssignListParticipantsRequest.md)
 - [ModAssignLockSubmissionsRequest](docs/ModAssignLockSubmissionsRequest.md)
 - [ModAssignRevealIdentitiesRequest](docs/ModAssignRevealIdentitiesRequest.md)
 - [ModAssignRevertSubmissionsToDraftRequest](docs/ModAssignRevertSubmissionsToDraftRequest.md)
 - [ModAssignSaveGradeRequest](docs/ModAssignSaveGradeRequest.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdata](docs/ModAssignSaveGradeRequestAdvancedgradingdata.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataGuide](docs/ModAssignSaveGradeRequestAdvancedgradingdataGuide.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner](docs/ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInner.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner](docs/ModAssignSaveGradeRequestAdvancedgradingdataGuideCriteriaInnerFillingsInner.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataRubric](docs/ModAssignSaveGradeRequestAdvancedgradingdataRubric.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner](docs/ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInner.md)
 - [ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner](docs/ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner.md)
 - [ModAssignSaveGradeRequestPlugindata](docs/ModAssignSaveGradeRequestPlugindata.md)
 - [ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor](docs/ModAssignSaveGradeRequestPlugindataAssignfeedbackcommentsEditor.md)
 - [ModAssignSaveGradesRequest](docs/ModAssignSaveGradesRequest.md)
 - [ModAssignSaveGradesRequestGradesInner](docs/ModAssignSaveGradesRequestGradesInner.md)
 - [ModAssignSaveGradesRequestGradesInnerPlugindata](docs/ModAssignSaveGradesRequestGradesInnerPlugindata.md)
 - [ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor](docs/ModAssignSaveGradesRequestGradesInnerPlugindataAssignfeedbackcommentsEditor.md)
 - [ModAssignSaveSubmissionRequest](docs/ModAssignSaveSubmissionRequest.md)
 - [ModAssignSaveSubmissionRequestPlugindata](docs/ModAssignSaveSubmissionRequestPlugindata.md)
 - [ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor](docs/ModAssignSaveSubmissionRequestPlugindataOnlinetextEditor.md)
 - [ModAssignSaveUserExtensionsRequest](docs/ModAssignSaveUserExtensionsRequest.md)
 - [ModAssignSetUserFlagsRequest](docs/ModAssignSetUserFlagsRequest.md)
 - [ModAssignSetUserFlagsRequestUserflagsInner](docs/ModAssignSetUserFlagsRequestUserflagsInner.md)
 - [ModAssignStartSubmission200Response](docs/ModAssignStartSubmission200Response.md)
 - [ModAssignStartSubmissionRequest](docs/ModAssignStartSubmissionRequest.md)
 - [ModAssignSubmitForGradingRequest](docs/ModAssignSubmitForGradingRequest.md)
 - [ModAssignSubmitGradingFormRequest](docs/ModAssignSubmitGradingFormRequest.md)
 - [ModAssignViewAssignRequest](docs/ModAssignViewAssignRequest.md)
 - [ModBigbluebuttonbnCanJoin200Response](docs/ModBigbluebuttonbnCanJoin200Response.md)
 - [ModBigbluebuttonbnCanJoinRequest](docs/ModBigbluebuttonbnCanJoinRequest.md)
 - [ModBigbluebuttonbnCompletionValidateRequest](docs/ModBigbluebuttonbnCompletionValidateRequest.md)
 - [ModBigbluebuttonbnEndMeetingRequest](docs/ModBigbluebuttonbnEndMeetingRequest.md)
 - [ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response](docs/ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response.md)
 - [ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner](docs/ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200ResponseBigbluebuttonbnsInner.md)
 - [ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest](docs/ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest.md)
 - [ModBigbluebuttonbnGetJoinUrl200Response](docs/ModBigbluebuttonbnGetJoinUrl200Response.md)
 - [ModBigbluebuttonbnGetRecordings200Response](docs/ModBigbluebuttonbnGetRecordings200Response.md)
 - [ModBigbluebuttonbnGetRecordings200ResponseTabledata](docs/ModBigbluebuttonbnGetRecordings200ResponseTabledata.md)
 - [ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner](docs/ModBigbluebuttonbnGetRecordings200ResponseTabledataColumnsInner.md)
 - [ModBigbluebuttonbnGetRecordingsRequest](docs/ModBigbluebuttonbnGetRecordingsRequest.md)
 - [ModBigbluebuttonbnGetRecordingsToImport200Response](docs/ModBigbluebuttonbnGetRecordingsToImport200Response.md)
 - [ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata](docs/ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledata.md)
 - [ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner](docs/ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner.md)
 - [ModBigbluebuttonbnGetRecordingsToImportRequest](docs/ModBigbluebuttonbnGetRecordingsToImportRequest.md)
 - [ModBigbluebuttonbnMeetingInfo200Response](docs/ModBigbluebuttonbnMeetingInfo200Response.md)
 - [ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner](docs/ModBigbluebuttonbnMeetingInfo200ResponseFeaturesInner.md)
 - [ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner](docs/ModBigbluebuttonbnMeetingInfo200ResponsePresentationsInner.md)
 - [ModBigbluebuttonbnMeetingInfoRequest](docs/ModBigbluebuttonbnMeetingInfoRequest.md)
 - [ModBigbluebuttonbnUpdateRecordingRequest](docs/ModBigbluebuttonbnUpdateRecordingRequest.md)
 - [ModBigbluebuttonbnViewBigbluebuttonbnRequest](docs/ModBigbluebuttonbnViewBigbluebuttonbnRequest.md)
 - [ModBookGetBooksByCourses200Response](docs/ModBookGetBooksByCourses200Response.md)
 - [ModBookGetBooksByCourses200ResponseBooksInner](docs/ModBookGetBooksByCourses200ResponseBooksInner.md)
 - [ModBookGetBooksByCoursesRequest](docs/ModBookGetBooksByCoursesRequest.md)
 - [ModBookViewBookRequest](docs/ModBookViewBookRequest.md)
 - [ModChatGetChatLatestMessages200Response](docs/ModChatGetChatLatestMessages200Response.md)
 - [ModChatGetChatLatestMessages200ResponseMessagesInner](docs/ModChatGetChatLatestMessages200ResponseMessagesInner.md)
 - [ModChatGetChatLatestMessagesRequest](docs/ModChatGetChatLatestMessagesRequest.md)
 - [ModChatGetChatUsers200Response](docs/ModChatGetChatUsers200Response.md)
 - [ModChatGetChatUsers200ResponseUsersInner](docs/ModChatGetChatUsers200ResponseUsersInner.md)
 - [ModChatGetChatUsersRequest](docs/ModChatGetChatUsersRequest.md)
 - [ModChatGetChatsByCourses200Response](docs/ModChatGetChatsByCourses200Response.md)
 - [ModChatGetChatsByCourses200ResponseChatsInner](docs/ModChatGetChatsByCourses200ResponseChatsInner.md)
 - [ModChatGetChatsByCoursesRequest](docs/ModChatGetChatsByCoursesRequest.md)
 - [ModChatGetSessionMessages200Response](docs/ModChatGetSessionMessages200Response.md)
 - [ModChatGetSessionMessages200ResponseMessagesInner](docs/ModChatGetSessionMessages200ResponseMessagesInner.md)
 - [ModChatGetSessionMessagesRequest](docs/ModChatGetSessionMessagesRequest.md)
 - [ModChatGetSessions200Response](docs/ModChatGetSessions200Response.md)
 - [ModChatGetSessions200ResponseSessionsInner](docs/ModChatGetSessions200ResponseSessionsInner.md)
 - [ModChatGetSessions200ResponseSessionsInnerSessionusersInner](docs/ModChatGetSessions200ResponseSessionsInnerSessionusersInner.md)
 - [ModChatGetSessionsRequest](docs/ModChatGetSessionsRequest.md)
 - [ModChatLoginUser200Response](docs/ModChatLoginUser200Response.md)
 - [ModChatLoginUserRequest](docs/ModChatLoginUserRequest.md)
 - [ModChatSendChatMessage200Response](docs/ModChatSendChatMessage200Response.md)
 - [ModChatSendChatMessageRequest](docs/ModChatSendChatMessageRequest.md)
 - [ModChatViewChatRequest](docs/ModChatViewChatRequest.md)
 - [ModChatViewSessionsRequest](docs/ModChatViewSessionsRequest.md)
 - [ModChoiceDeleteChoiceResponses200Response](docs/ModChoiceDeleteChoiceResponses200Response.md)
 - [ModChoiceDeleteChoiceResponsesRequest](docs/ModChoiceDeleteChoiceResponsesRequest.md)
 - [ModChoiceGetChoiceOptions200Response](docs/ModChoiceGetChoiceOptions200Response.md)
 - [ModChoiceGetChoiceOptions200ResponseOptionsInner](docs/ModChoiceGetChoiceOptions200ResponseOptionsInner.md)
 - [ModChoiceGetChoiceOptionsRequest](docs/ModChoiceGetChoiceOptionsRequest.md)
 - [ModChoiceGetChoiceResults200Response](docs/ModChoiceGetChoiceResults200Response.md)
 - [ModChoiceGetChoiceResults200ResponseOptionsInner](docs/ModChoiceGetChoiceResults200ResponseOptionsInner.md)
 - [ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner](docs/ModChoiceGetChoiceResults200ResponseOptionsInnerUserresponsesInner.md)
 - [ModChoiceGetChoicesByCourses200Response](docs/ModChoiceGetChoicesByCourses200Response.md)
 - [ModChoiceGetChoicesByCourses200ResponseChoicesInner](docs/ModChoiceGetChoicesByCourses200ResponseChoicesInner.md)
 - [ModChoiceSubmitChoiceResponse200Response](docs/ModChoiceSubmitChoiceResponse200Response.md)
 - [ModChoiceSubmitChoiceResponse200ResponseAnswersInner](docs/ModChoiceSubmitChoiceResponse200ResponseAnswersInner.md)
 - [ModChoiceSubmitChoiceResponseRequest](docs/ModChoiceSubmitChoiceResponseRequest.md)
 - [ModDataAddEntry200Response](docs/ModDataAddEntry200Response.md)
 - [ModDataAddEntry200ResponseFieldnotificationsInner](docs/ModDataAddEntry200ResponseFieldnotificationsInner.md)
 - [ModDataAddEntryRequest](docs/ModDataAddEntryRequest.md)
 - [ModDataAddEntryRequestDataInner](docs/ModDataAddEntryRequestDataInner.md)
 - [ModDataApproveEntryRequest](docs/ModDataApproveEntryRequest.md)
 - [ModDataDeleteEntry200Response](docs/ModDataDeleteEntry200Response.md)
 - [ModDataDeleteEntryRequest](docs/ModDataDeleteEntryRequest.md)
 - [ModDataDeleteSavedPresetRequest](docs/ModDataDeleteSavedPresetRequest.md)
 - [ModDataGetDataAccessInformation200Response](docs/ModDataGetDataAccessInformation200Response.md)
 - [ModDataGetDataAccessInformationRequest](docs/ModDataGetDataAccessInformationRequest.md)
 - [ModDataGetDatabasesByCourses200Response](docs/ModDataGetDatabasesByCourses200Response.md)
 - [ModDataGetDatabasesByCourses200ResponseDatabasesInner](docs/ModDataGetDatabasesByCourses200ResponseDatabasesInner.md)
 - [ModDataGetEntries200Response](docs/ModDataGetEntries200Response.md)
 - [ModDataGetEntries200ResponseEntriesInner](docs/ModDataGetEntries200ResponseEntriesInner.md)
 - [ModDataGetEntries200ResponseEntriesInnerContentsInner](docs/ModDataGetEntries200ResponseEntriesInnerContentsInner.md)
 - [ModDataGetEntries200ResponseEntriesInnerTagsInner](docs/ModDataGetEntries200ResponseEntriesInnerTagsInner.md)
 - [ModDataGetEntriesRequest](docs/ModDataGetEntriesRequest.md)
 - [ModDataGetEntry200Response](docs/ModDataGetEntry200Response.md)
 - [ModDataGetEntry200ResponseEntry](docs/ModDataGetEntry200ResponseEntry.md)
 - [ModDataGetEntry200ResponseEntryContentsInner](docs/ModDataGetEntry200ResponseEntryContentsInner.md)
 - [ModDataGetEntry200ResponseRatinginfo](docs/ModDataGetEntry200ResponseRatinginfo.md)
 - [ModDataGetEntry200ResponseRatinginfoRatingsInner](docs/ModDataGetEntry200ResponseRatinginfoRatingsInner.md)
 - [ModDataGetEntry200ResponseRatinginfoScalesInner](docs/ModDataGetEntry200ResponseRatinginfoScalesInner.md)
 - [ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner](docs/ModDataGetEntry200ResponseRatinginfoScalesInnerItemsInner.md)
 - [ModDataGetEntryRequest](docs/ModDataGetEntryRequest.md)
 - [ModDataGetFields200Response](docs/ModDataGetFields200Response.md)
 - [ModDataGetFields200ResponseFieldsInner](docs/ModDataGetFields200ResponseFieldsInner.md)
 - [ModDataGetFieldsRequest](docs/ModDataGetFieldsRequest.md)
 - [ModDataGetMappingInformation200Response](docs/ModDataGetMappingInformation200Response.md)
 - [ModDataGetMappingInformation200ResponseData](docs/ModDataGetMappingInformation200ResponseData.md)
 - [ModDataGetMappingInformationRequest](docs/ModDataGetMappingInformationRequest.md)
 - [ModDataSearchEntries200Response](docs/ModDataSearchEntries200Response.md)
 - [ModDataSearchEntries200ResponseEntriesInner](docs/ModDataSearchEntries200ResponseEntriesInner.md)
 - [ModDataSearchEntriesRequest](docs/ModDataSearchEntriesRequest.md)
 - [ModDataSearchEntriesRequestAdvsearchInner](docs/ModDataSearchEntriesRequestAdvsearchInner.md)
 - [ModDataUpdateEntry200Response](docs/ModDataUpdateEntry200Response.md)
 - [ModDataUpdateEntry200ResponseFieldnotificationsInner](docs/ModDataUpdateEntry200ResponseFieldnotificationsInner.md)
 - [ModDataUpdateEntryRequest](docs/ModDataUpdateEntryRequest.md)
 - [ModDataUpdateEntryRequestDataInner](docs/ModDataUpdateEntryRequestDataInner.md)
 - [ModDataViewDatabaseRequest](docs/ModDataViewDatabaseRequest.md)
 - [ModFeedbackGetAnalysis200Response](docs/ModFeedbackGetAnalysis200Response.md)
 - [ModFeedbackGetAnalysis200ResponseItemsdataInner](docs/ModFeedbackGetAnalysis200ResponseItemsdataInner.md)
 - [ModFeedbackGetAnalysis200ResponseItemsdataInnerItem](docs/ModFeedbackGetAnalysis200ResponseItemsdataInnerItem.md)
 - [ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner](docs/ModFeedbackGetAnalysis200ResponseItemsdataInnerItemItemfilesInner.md)
 - [ModFeedbackGetAnalysisRequest](docs/ModFeedbackGetAnalysisRequest.md)
 - [ModFeedbackGetCurrentCompletedTmp200Response](docs/ModFeedbackGetCurrentCompletedTmp200Response.md)
 - [ModFeedbackGetCurrentCompletedTmp200ResponseFeedback](docs/ModFeedbackGetCurrentCompletedTmp200ResponseFeedback.md)
 - [ModFeedbackGetCurrentCompletedTmpRequest](docs/ModFeedbackGetCurrentCompletedTmpRequest.md)
 - [ModFeedbackGetFeedbackAccessInformation200Response](docs/ModFeedbackGetFeedbackAccessInformation200Response.md)
 - [ModFeedbackGetFeedbackAccessInformationRequest](docs/ModFeedbackGetFeedbackAccessInformationRequest.md)
 - [ModFeedbackGetFeedbacksByCourses200Response](docs/ModFeedbackGetFeedbacksByCourses200Response.md)
 - [ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner](docs/ModFeedbackGetFeedbacksByCourses200ResponseFeedbacksInner.md)
 - [ModFeedbackGetFinishedResponses200Response](docs/ModFeedbackGetFinishedResponses200Response.md)
 - [ModFeedbackGetFinishedResponses200ResponseResponsesInner](docs/ModFeedbackGetFinishedResponses200ResponseResponsesInner.md)
 - [ModFeedbackGetFinishedResponsesRequest](docs/ModFeedbackGetFinishedResponsesRequest.md)
 - [ModFeedbackGetItems200Response](docs/ModFeedbackGetItems200Response.md)
 - [ModFeedbackGetItems200ResponseItemsInner](docs/ModFeedbackGetItems200ResponseItemsInner.md)
 - [ModFeedbackGetLastCompleted200Response](docs/ModFeedbackGetLastCompleted200Response.md)
 - [ModFeedbackGetLastCompleted200ResponseCompleted](docs/ModFeedbackGetLastCompleted200ResponseCompleted.md)
 - [ModFeedbackGetNonRespondents200Response](docs/ModFeedbackGetNonRespondents200Response.md)
 - [ModFeedbackGetNonRespondents200ResponseUsersInner](docs/ModFeedbackGetNonRespondents200ResponseUsersInner.md)
 - [ModFeedbackGetNonRespondentsRequest](docs/ModFeedbackGetNonRespondentsRequest.md)
 - [ModFeedbackGetPageItems200Response](docs/ModFeedbackGetPageItems200Response.md)
 - [ModFeedbackGetPageItemsRequest](docs/ModFeedbackGetPageItemsRequest.md)
 - [ModFeedbackGetResponsesAnalysis200Response](docs/ModFeedbackGetResponsesAnalysis200Response.md)
 - [ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner](docs/ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner.md)
 - [ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner](docs/ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInnerResponsesInner.md)
 - [ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner](docs/ModFeedbackGetResponsesAnalysis200ResponseAttemptsInner.md)
 - [ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner](docs/ModFeedbackGetResponsesAnalysis200ResponseAttemptsInnerResponsesInner.md)
 - [ModFeedbackGetResponsesAnalysisRequest](docs/ModFeedbackGetResponsesAnalysisRequest.md)
 - [ModFeedbackGetUnfinishedResponses200Response](docs/ModFeedbackGetUnfinishedResponses200Response.md)
 - [ModFeedbackGetUnfinishedResponses200ResponseResponsesInner](docs/ModFeedbackGetUnfinishedResponses200ResponseResponsesInner.md)
 - [ModFeedbackLaunchFeedback200Response](docs/ModFeedbackLaunchFeedback200Response.md)
 - [ModFeedbackProcessPage200Response](docs/ModFeedbackProcessPage200Response.md)
 - [ModFeedbackProcessPageRequest](docs/ModFeedbackProcessPageRequest.md)
 - [ModFeedbackProcessPageRequestResponsesInner](docs/ModFeedbackProcessPageRequestResponsesInner.md)
 - [ModFeedbackViewFeedbackRequest](docs/ModFeedbackViewFeedbackRequest.md)
 - [ModFolderGetFoldersByCourses200Response](docs/ModFolderGetFoldersByCourses200Response.md)
 - [ModFolderGetFoldersByCourses200ResponseFoldersInner](docs/ModFolderGetFoldersByCourses200ResponseFoldersInner.md)
 - [ModFolderViewFolderRequest](docs/ModFolderViewFolderRequest.md)
 - [ModForumAddDiscussion200Response](docs/ModForumAddDiscussion200Response.md)
 - [ModForumAddDiscussionPost200Response](docs/ModForumAddDiscussionPost200Response.md)
 - [ModForumAddDiscussionPost200ResponseMessagesInner](docs/ModForumAddDiscussionPost200ResponseMessagesInner.md)
 - [ModForumAddDiscussionPost200ResponsePost](docs/ModForumAddDiscussionPost200ResponsePost.md)
 - [ModForumAddDiscussionPost200ResponsePostAttachmentsInner](docs/ModForumAddDiscussionPost200ResponsePostAttachmentsInner.md)
 - [ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml](docs/ModForumAddDiscussionPost200ResponsePostAttachmentsInnerHtml.md)
 - [ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls](docs/ModForumAddDiscussionPost200ResponsePostAttachmentsInnerUrls.md)
 - [ModForumAddDiscussionPost200ResponsePostAuthor](docs/ModForumAddDiscussionPost200ResponsePostAuthor.md)
 - [ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner](docs/ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner.md)
 - [ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls](docs/ModForumAddDiscussionPost200ResponsePostAuthorGroupsInnerUrls.md)
 - [ModForumAddDiscussionPost200ResponsePostAuthorUrls](docs/ModForumAddDiscussionPost200ResponsePostAuthorUrls.md)
 - [ModForumAddDiscussionPost200ResponsePostCapabilities](docs/ModForumAddDiscussionPost200ResponsePostCapabilities.md)
 - [ModForumAddDiscussionPost200ResponsePostHtml](docs/ModForumAddDiscussionPost200ResponsePostHtml.md)
 - [ModForumAddDiscussionPost200ResponsePostTagsInner](docs/ModForumAddDiscussionPost200ResponsePostTagsInner.md)
 - [ModForumAddDiscussionPost200ResponsePostTagsInnerUrls](docs/ModForumAddDiscussionPost200ResponsePostTagsInnerUrls.md)
 - [ModForumAddDiscussionPost200ResponsePostUrls](docs/ModForumAddDiscussionPost200ResponsePostUrls.md)
 - [ModForumAddDiscussionPostRequest](docs/ModForumAddDiscussionPostRequest.md)
 - [ModForumAddDiscussionPostRequestOptionsInner](docs/ModForumAddDiscussionPostRequestOptionsInner.md)
 - [ModForumAddDiscussionRequest](docs/ModForumAddDiscussionRequest.md)
 - [ModForumAddDiscussionRequestOptionsInner](docs/ModForumAddDiscussionRequestOptionsInner.md)
 - [ModForumCanAddDiscussion200Response](docs/ModForumCanAddDiscussion200Response.md)
 - [ModForumCanAddDiscussionRequest](docs/ModForumCanAddDiscussionRequest.md)
 - [ModForumDeletePost200Response](docs/ModForumDeletePost200Response.md)
 - [ModForumDeletePostRequest](docs/ModForumDeletePostRequest.md)
 - [ModForumGetDiscussionPost200Response](docs/ModForumGetDiscussionPost200Response.md)
 - [ModForumGetDiscussionPost200ResponsePost](docs/ModForumGetDiscussionPost200ResponsePost.md)
 - [ModForumGetDiscussionPost200ResponsePostAttachmentsInner](docs/ModForumGetDiscussionPost200ResponsePostAttachmentsInner.md)
 - [ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml](docs/ModForumGetDiscussionPost200ResponsePostAttachmentsInnerHtml.md)
 - [ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls](docs/ModForumGetDiscussionPost200ResponsePostAttachmentsInnerUrls.md)
 - [ModForumGetDiscussionPost200ResponsePostAuthor](docs/ModForumGetDiscussionPost200ResponsePostAuthor.md)
 - [ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner](docs/ModForumGetDiscussionPost200ResponsePostAuthorGroupsInner.md)
 - [ModForumGetDiscussionPost200ResponsePostAuthorGroupsInnerUrls](docs/ModForumGetDiscussionPost200ResponsePostAuthorGroupsInnerUrls.md)
 - [ModForumGetDiscussionPost200ResponsePostAuthorUrls](docs/ModForumGetDiscussionPost200ResponsePostAuthorUrls.md)
 - [ModForumGetDiscussionPost200ResponsePostCapabilities](docs/ModForumGetDiscussionPost200ResponsePostCapabilities.md)
 - [ModForumGetDiscussionPost200ResponsePostHtml](docs/ModForumGetDiscussionPost200ResponsePostHtml.md)
 - [ModForumGetDiscussionPost200ResponsePostTagsInner](docs/ModForumGetDiscussionPost200ResponsePostTagsInner.md)
 - [ModForumGetDiscussionPost200ResponsePostTagsInnerUrls](docs/ModForumGetDiscussionPost200ResponsePostTagsInnerUrls.md)
 - [ModForumGetDiscussionPost200ResponsePostUrls](docs/ModForumGetDiscussionPost200ResponsePostUrls.md)
 - [ModForumGetDiscussionPostRequest](docs/ModForumGetDiscussionPostRequest.md)
 - [ModForumGetDiscussionPosts200Response](docs/ModForumGetDiscussionPosts200Response.md)
 - [ModForumGetDiscussionPosts200ResponsePostsInner](docs/ModForumGetDiscussionPosts200ResponsePostsInner.md)
 - [ModForumGetDiscussionPosts200ResponseRatinginfo](docs/ModForumGetDiscussionPosts200ResponseRatinginfo.md)
 - [ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner](docs/ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner.md)
 - [ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner](docs/ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner.md)
 - [ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner](docs/ModForumGetDiscussionPosts200ResponseRatinginfoScalesInnerItemsInner.md)
 - [ModForumGetDiscussionPostsByUserid200Response](docs/ModForumGetDiscussionPostsByUserid200Response.md)
 - [ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner](docs/ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInner.md)
 - [ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts](docs/ModForumGetDiscussionPostsByUserid200ResponseDiscussionsInnerPosts.md)
 - [ModForumGetDiscussionPostsByUseridRequest](docs/ModForumGetDiscussionPostsByUseridRequest.md)
 - [ModForumGetDiscussionPostsRequest](docs/ModForumGetDiscussionPostsRequest.md)
 - [ModForumGetForumAccessInformation200Response](docs/ModForumGetForumAccessInformation200Response.md)
 - [ModForumGetForumAccessInformationRequest](docs/ModForumGetForumAccessInformationRequest.md)
 - [ModForumGetForumDiscussions200Response](docs/ModForumGetForumDiscussions200Response.md)
 - [ModForumGetForumDiscussions200ResponseDiscussionsInner](docs/ModForumGetForumDiscussions200ResponseDiscussionsInner.md)
 - [ModForumGetForumDiscussionsPaginated200Response](docs/ModForumGetForumDiscussionsPaginated200Response.md)
 - [ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner](docs/ModForumGetForumDiscussionsPaginated200ResponseDiscussionsInner.md)
 - [ModForumGetForumDiscussionsPaginatedRequest](docs/ModForumGetForumDiscussionsPaginatedRequest.md)
 - [ModForumGetForumDiscussionsRequest](docs/ModForumGetForumDiscussionsRequest.md)
 - [ModForumGetForumsByCoursesRequest](docs/ModForumGetForumsByCoursesRequest.md)
 - [ModForumPrepareDraftAreaForPost200Response](docs/ModForumPrepareDraftAreaForPost200Response.md)
 - [ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner](docs/ModForumPrepareDraftAreaForPost200ResponseAreaoptionsInner.md)
 - [ModForumPrepareDraftAreaForPostRequest](docs/ModForumPrepareDraftAreaForPostRequest.md)
 - [ModForumPrepareDraftAreaForPostRequestFilestokeepInner](docs/ModForumPrepareDraftAreaForPostRequestFilestokeepInner.md)
 - [ModForumSetLockState200Response](docs/ModForumSetLockState200Response.md)
 - [ModForumSetLockState200ResponseTimes](docs/ModForumSetLockState200ResponseTimes.md)
 - [ModForumSetLockStateRequest](docs/ModForumSetLockStateRequest.md)
 - [ModForumSetPinState200Response](docs/ModForumSetPinState200Response.md)
 - [ModForumSetPinState200ResponseCapabilities](docs/ModForumSetPinState200ResponseCapabilities.md)
 - [ModForumSetPinState200ResponseGroup](docs/ModForumSetPinState200ResponseGroup.md)
 - [ModForumSetPinState200ResponseGroupUrls](docs/ModForumSetPinState200ResponseGroupUrls.md)
 - [ModForumSetPinState200ResponseTimed](docs/ModForumSetPinState200ResponseTimed.md)
 - [ModForumSetPinState200ResponseTimes](docs/ModForumSetPinState200ResponseTimes.md)
 - [ModForumSetPinState200ResponseUrls](docs/ModForumSetPinState200ResponseUrls.md)
 - [ModForumSetPinState200ResponseUserstate](docs/ModForumSetPinState200ResponseUserstate.md)
 - [ModForumSetPinStateRequest](docs/ModForumSetPinStateRequest.md)
 - [ModForumSetSubscriptionState200Response](docs/ModForumSetSubscriptionState200Response.md)
 - [ModForumSetSubscriptionState200ResponseCapabilities](docs/ModForumSetSubscriptionState200ResponseCapabilities.md)
 - [ModForumSetSubscriptionState200ResponseGroup](docs/ModForumSetSubscriptionState200ResponseGroup.md)
 - [ModForumSetSubscriptionState200ResponseGroupUrls](docs/ModForumSetSubscriptionState200ResponseGroupUrls.md)
 - [ModForumSetSubscriptionState200ResponseTimed](docs/ModForumSetSubscriptionState200ResponseTimed.md)
 - [ModForumSetSubscriptionState200ResponseTimes](docs/ModForumSetSubscriptionState200ResponseTimes.md)
 - [ModForumSetSubscriptionState200ResponseUrls](docs/ModForumSetSubscriptionState200ResponseUrls.md)
 - [ModForumSetSubscriptionState200ResponseUserstate](docs/ModForumSetSubscriptionState200ResponseUserstate.md)
 - [ModForumSetSubscriptionStateRequest](docs/ModForumSetSubscriptionStateRequest.md)
 - [ModForumToggleFavouriteStateRequest](docs/ModForumToggleFavouriteStateRequest.md)
 - [ModForumUpdateDiscussionPost200Response](docs/ModForumUpdateDiscussionPost200Response.md)
 - [ModForumUpdateDiscussionPostRequest](docs/ModForumUpdateDiscussionPostRequest.md)
 - [ModForumUpdateDiscussionPostRequestOptionsInner](docs/ModForumUpdateDiscussionPostRequestOptionsInner.md)
 - [ModForumViewForumDiscussionRequest](docs/ModForumViewForumDiscussionRequest.md)
 - [ModForumViewForumRequest](docs/ModForumViewForumRequest.md)
 - [ModGlossaryAddEntry200Response](docs/ModGlossaryAddEntry200Response.md)
 - [ModGlossaryAddEntryRequest](docs/ModGlossaryAddEntryRequest.md)
 - [ModGlossaryAddEntryRequestOptionsInner](docs/ModGlossaryAddEntryRequestOptionsInner.md)
 - [ModGlossaryDeleteEntryRequest](docs/ModGlossaryDeleteEntryRequest.md)
 - [ModGlossaryGetAuthors200Response](docs/ModGlossaryGetAuthors200Response.md)
 - [ModGlossaryGetAuthors200ResponseAuthorsInner](docs/ModGlossaryGetAuthors200ResponseAuthorsInner.md)
 - [ModGlossaryGetAuthorsRequest](docs/ModGlossaryGetAuthorsRequest.md)
 - [ModGlossaryGetAuthorsRequestOptions](docs/ModGlossaryGetAuthorsRequestOptions.md)
 - [ModGlossaryGetCategories200Response](docs/ModGlossaryGetCategories200Response.md)
 - [ModGlossaryGetCategories200ResponseCategoriesInner](docs/ModGlossaryGetCategories200ResponseCategoriesInner.md)
 - [ModGlossaryGetCategoriesRequest](docs/ModGlossaryGetCategoriesRequest.md)
 - [ModGlossaryGetEntriesByAuthor200Response](docs/ModGlossaryGetEntriesByAuthor200Response.md)
 - [ModGlossaryGetEntriesByAuthor200ResponseEntriesInner](docs/ModGlossaryGetEntriesByAuthor200ResponseEntriesInner.md)
 - [ModGlossaryGetEntriesByAuthorId200Response](docs/ModGlossaryGetEntriesByAuthorId200Response.md)
 - [ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner](docs/ModGlossaryGetEntriesByAuthorId200ResponseEntriesInner.md)
 - [ModGlossaryGetEntriesByAuthorIdRequest](docs/ModGlossaryGetEntriesByAuthorIdRequest.md)
 - [ModGlossaryGetEntriesByAuthorRequest](docs/ModGlossaryGetEntriesByAuthorRequest.md)
 - [ModGlossaryGetEntriesByAuthorRequestOptions](docs/ModGlossaryGetEntriesByAuthorRequestOptions.md)
 - [ModGlossaryGetEntriesByCategory200Response](docs/ModGlossaryGetEntriesByCategory200Response.md)
 - [ModGlossaryGetEntriesByCategory200ResponseEntriesInner](docs/ModGlossaryGetEntriesByCategory200ResponseEntriesInner.md)
 - [ModGlossaryGetEntriesByCategoryRequest](docs/ModGlossaryGetEntriesByCategoryRequest.md)
 - [ModGlossaryGetEntriesByDateRequest](docs/ModGlossaryGetEntriesByDateRequest.md)
 - [ModGlossaryGetEntriesByLetterRequest](docs/ModGlossaryGetEntriesByLetterRequest.md)
 - [ModGlossaryGetEntriesBySearchRequest](docs/ModGlossaryGetEntriesBySearchRequest.md)
 - [ModGlossaryGetEntriesByTermRequest](docs/ModGlossaryGetEntriesByTermRequest.md)
 - [ModGlossaryGetEntriesToApproveRequest](docs/ModGlossaryGetEntriesToApproveRequest.md)
 - [ModGlossaryGetEntryById200Response](docs/ModGlossaryGetEntryById200Response.md)
 - [ModGlossaryGetEntryById200ResponseEntry](docs/ModGlossaryGetEntryById200ResponseEntry.md)
 - [ModGlossaryGetEntryById200ResponsePermissions](docs/ModGlossaryGetEntryById200ResponsePermissions.md)
 - [ModGlossaryGetEntryByIdRequest](docs/ModGlossaryGetEntryByIdRequest.md)
 - [ModGlossaryGetGlossariesByCourses200Response](docs/ModGlossaryGetGlossariesByCourses200Response.md)
 - [ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner](docs/ModGlossaryGetGlossariesByCourses200ResponseGlossariesInner.md)
 - [ModGlossaryPrepareEntryForEdition200Response](docs/ModGlossaryPrepareEntryForEdition200Response.md)
 - [ModGlossaryPrepareEntryForEdition200ResponseAreasInner](docs/ModGlossaryPrepareEntryForEdition200ResponseAreasInner.md)
 - [ModGlossaryPrepareEntryForEdition200ResponseAreasInnerOptionsInner](docs/ModGlossaryPrepareEntryForEdition200ResponseAreasInnerOptionsInner.md)
 - [ModGlossaryPrepareEntryForEditionRequest](docs/ModGlossaryPrepareEntryForEditionRequest.md)
 - [ModGlossaryUpdateEntry200Response](docs/ModGlossaryUpdateEntry200Response.md)
 - [ModGlossaryUpdateEntryRequest](docs/ModGlossaryUpdateEntryRequest.md)
 - [ModGlossaryUpdateEntryRequestOptionsInner](docs/ModGlossaryUpdateEntryRequestOptionsInner.md)
 - [ModGlossaryViewEntry200Response](docs/ModGlossaryViewEntry200Response.md)
 - [ModGlossaryViewGlossary200Response](docs/ModGlossaryViewGlossary200Response.md)
 - [ModGlossaryViewGlossaryRequest](docs/ModGlossaryViewGlossaryRequest.md)
 - [ModH5pactivityGetAttempts200Response](docs/ModH5pactivityGetAttempts200Response.md)
 - [ModH5pactivityGetAttempts200ResponseUsersattemptsInner](docs/ModH5pactivityGetAttempts200ResponseUsersattemptsInner.md)
 - [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner](docs/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerAttemptsInner.md)
 - [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored](docs/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScored.md)
 - [ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner](docs/ModH5pactivityGetAttempts200ResponseUsersattemptsInnerScoredAttemptsInner.md)
 - [ModH5pactivityGetAttemptsRequest](docs/ModH5pactivityGetAttemptsRequest.md)
 - [ModH5pactivityGetH5pactivitiesByCourses200Response](docs/ModH5pactivityGetH5pactivitiesByCourses200Response.md)
 - [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner](docs/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInner.md)
 - [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile](docs/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pactivitiesInnerDeployedfile.md)
 - [ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings](docs/ModH5pactivityGetH5pactivitiesByCourses200ResponseH5pglobalsettings.md)
 - [ModH5pactivityGetH5pactivityAccessInformation200Response](docs/ModH5pactivityGetH5pactivityAccessInformation200Response.md)
 - [ModH5pactivityGetH5pactivityAccessInformationRequest](docs/ModH5pactivityGetH5pactivityAccessInformationRequest.md)
 - [ModH5pactivityGetResults200Response](docs/ModH5pactivityGetResults200Response.md)
 - [ModH5pactivityGetResults200ResponseAttemptsInner](docs/ModH5pactivityGetResults200ResponseAttemptsInner.md)
 - [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner](docs/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInner.md)
 - [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner](docs/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInner.md)
 - [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer](docs/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerCorrectanswer.md)
 - [ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer](docs/ModH5pactivityGetResults200ResponseAttemptsInnerResultsInnerOptionsInnerUseranswer.md)
 - [ModH5pactivityGetResultsRequest](docs/ModH5pactivityGetResultsRequest.md)
 - [ModH5pactivityGetUserAttempts200Response](docs/ModH5pactivityGetUserAttempts200Response.md)
 - [ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner](docs/ModH5pactivityGetUserAttempts200ResponseUsersattemptsInner.md)
 - [ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored](docs/ModH5pactivityGetUserAttempts200ResponseUsersattemptsInnerScored.md)
 - [ModH5pactivityGetUserAttemptsRequest](docs/ModH5pactivityGetUserAttemptsRequest.md)
 - [ModH5pactivityLogReportViewedRequest](docs/ModH5pactivityLogReportViewedRequest.md)
 - [ModH5pactivityViewH5pactivityRequest](docs/ModH5pactivityViewH5pactivityRequest.md)
 - [ModImscpGetImscpsByCourses200Response](docs/ModImscpGetImscpsByCourses200Response.md)
 - [ModImscpGetImscpsByCourses200ResponseImscpsInner](docs/ModImscpGetImscpsByCourses200ResponseImscpsInner.md)
 - [ModImscpViewImscpRequest](docs/ModImscpViewImscpRequest.md)
 - [ModIomadcertificateGetIomadcertificatesByCourses200Response](docs/ModIomadcertificateGetIomadcertificatesByCourses200Response.md)
 - [ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner](docs/ModIomadcertificateGetIomadcertificatesByCourses200ResponseIomadcertificatesInner.md)
 - [ModIomadcertificateGetIssuedIomadcertificates200Response](docs/ModIomadcertificateGetIssuedIomadcertificates200Response.md)
 - [ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner](docs/ModIomadcertificateGetIssuedIomadcertificates200ResponseIssuesInner.md)
 - [ModIomadcertificateGetIssuedIomadcertificatesRequest](docs/ModIomadcertificateGetIssuedIomadcertificatesRequest.md)
 - [ModIomadcertificateIssueIomadcertificate200Response](docs/ModIomadcertificateIssueIomadcertificate200Response.md)
 - [ModIomadcertificateIssueIomadcertificate200ResponseIssue](docs/ModIomadcertificateIssueIomadcertificate200ResponseIssue.md)
 - [ModIomadcertificateIssueIomadcertificateRequest](docs/ModIomadcertificateIssueIomadcertificateRequest.md)
 - [ModLabelGetLabelsByCourses200Response](docs/ModLabelGetLabelsByCourses200Response.md)
 - [ModLabelGetLabelsByCourses200ResponseLabelsInner](docs/ModLabelGetLabelsByCourses200ResponseLabelsInner.md)
 - [ModLessonFinishAttempt200Response](docs/ModLessonFinishAttempt200Response.md)
 - [ModLessonFinishAttempt200ResponseDataInner](docs/ModLessonFinishAttempt200ResponseDataInner.md)
 - [ModLessonFinishAttempt200ResponseMessagesInner](docs/ModLessonFinishAttempt200ResponseMessagesInner.md)
 - [ModLessonFinishAttemptRequest](docs/ModLessonFinishAttemptRequest.md)
 - [ModLessonGetAttemptsOverview200Response](docs/ModLessonGetAttemptsOverview200Response.md)
 - [ModLessonGetAttemptsOverview200ResponseData](docs/ModLessonGetAttemptsOverview200ResponseData.md)
 - [ModLessonGetAttemptsOverview200ResponseDataStudentsInner](docs/ModLessonGetAttemptsOverview200ResponseDataStudentsInner.md)
 - [ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner](docs/ModLessonGetAttemptsOverview200ResponseDataStudentsInnerAttemptsInner.md)
 - [ModLessonGetAttemptsOverviewRequest](docs/ModLessonGetAttemptsOverviewRequest.md)
 - [ModLessonGetContentPagesViewed200Response](docs/ModLessonGetContentPagesViewed200Response.md)
 - [ModLessonGetContentPagesViewed200ResponsePagesInner](docs/ModLessonGetContentPagesViewed200ResponsePagesInner.md)
 - [ModLessonGetContentPagesViewedRequest](docs/ModLessonGetContentPagesViewedRequest.md)
 - [ModLessonGetLesson200Response](docs/ModLessonGetLesson200Response.md)
 - [ModLessonGetLesson200ResponseLesson](docs/ModLessonGetLesson200ResponseLesson.md)
 - [ModLessonGetLessonAccessInformation200Response](docs/ModLessonGetLessonAccessInformation200Response.md)
 - [ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner](docs/ModLessonGetLessonAccessInformation200ResponsePreventaccessreasonsInner.md)
 - [ModLessonGetLessonAccessInformationRequest](docs/ModLessonGetLessonAccessInformationRequest.md)
 - [ModLessonGetLessonRequest](docs/ModLessonGetLessonRequest.md)
 - [ModLessonGetLessonsByCourses200Response](docs/ModLessonGetLessonsByCourses200Response.md)
 - [ModLessonGetLessonsByCourses200ResponseLessonsInner](docs/ModLessonGetLessonsByCourses200ResponseLessonsInner.md)
 - [ModLessonGetPageData200Response](docs/ModLessonGetPageData200Response.md)
 - [ModLessonGetPageData200ResponseAnswersInner](docs/ModLessonGetPageData200ResponseAnswersInner.md)
 - [ModLessonGetPageData200ResponseMessagesInner](docs/ModLessonGetPageData200ResponseMessagesInner.md)
 - [ModLessonGetPageData200ResponsePage](docs/ModLessonGetPageData200ResponsePage.md)
 - [ModLessonGetPageDataRequest](docs/ModLessonGetPageDataRequest.md)
 - [ModLessonGetPages200Response](docs/ModLessonGetPages200Response.md)
 - [ModLessonGetPages200ResponsePagesInner](docs/ModLessonGetPages200ResponsePagesInner.md)
 - [ModLessonGetPages200ResponsePagesInnerPage](docs/ModLessonGetPages200ResponsePagesInnerPage.md)
 - [ModLessonGetPagesPossibleJumps200Response](docs/ModLessonGetPagesPossibleJumps200Response.md)
 - [ModLessonGetPagesPossibleJumps200ResponseJumpsInner](docs/ModLessonGetPagesPossibleJumps200ResponseJumpsInner.md)
 - [ModLessonGetPagesRequest](docs/ModLessonGetPagesRequest.md)
 - [ModLessonGetQuestionsAttempts200Response](docs/ModLessonGetQuestionsAttempts200Response.md)
 - [ModLessonGetQuestionsAttempts200ResponseAttemptsInner](docs/ModLessonGetQuestionsAttempts200ResponseAttemptsInner.md)
 - [ModLessonGetQuestionsAttemptsRequest](docs/ModLessonGetQuestionsAttemptsRequest.md)
 - [ModLessonGetUserAttempt200Response](docs/ModLessonGetUserAttempt200Response.md)
 - [ModLessonGetUserAttempt200ResponseAnswerpagesInner](docs/ModLessonGetUserAttempt200ResponseAnswerpagesInner.md)
 - [ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata](docs/ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata.md)
 - [ModLessonGetUserAttempt200ResponseUserstats](docs/ModLessonGetUserAttempt200ResponseUserstats.md)
 - [ModLessonGetUserAttempt200ResponseUserstatsGradeinfo](docs/ModLessonGetUserAttempt200ResponseUserstatsGradeinfo.md)
 - [ModLessonGetUserAttemptGrade200Response](docs/ModLessonGetUserAttemptGrade200Response.md)
 - [ModLessonGetUserAttemptGrade200ResponseGrade](docs/ModLessonGetUserAttemptGrade200ResponseGrade.md)
 - [ModLessonGetUserAttemptGradeRequest](docs/ModLessonGetUserAttemptGradeRequest.md)
 - [ModLessonGetUserAttemptRequest](docs/ModLessonGetUserAttemptRequest.md)
 - [ModLessonGetUserGrade200Response](docs/ModLessonGetUserGrade200Response.md)
 - [ModLessonGetUserGradeRequest](docs/ModLessonGetUserGradeRequest.md)
 - [ModLessonGetUserTimers200Response](docs/ModLessonGetUserTimers200Response.md)
 - [ModLessonGetUserTimers200ResponseTimersInner](docs/ModLessonGetUserTimers200ResponseTimersInner.md)
 - [ModLessonLaunchAttempt200Response](docs/ModLessonLaunchAttempt200Response.md)
 - [ModLessonLaunchAttemptRequest](docs/ModLessonLaunchAttemptRequest.md)
 - [ModLessonProcessPage200Response](docs/ModLessonProcessPage200Response.md)
 - [ModLessonProcessPageRequest](docs/ModLessonProcessPageRequest.md)
 - [ModLessonProcessPageRequestDataInner](docs/ModLessonProcessPageRequestDataInner.md)
 - [ModLtiCreateToolProxy200Response](docs/ModLtiCreateToolProxy200Response.md)
 - [ModLtiCreateToolProxyRequest](docs/ModLtiCreateToolProxyRequest.md)
 - [ModLtiCreateToolType200Response](docs/ModLtiCreateToolType200Response.md)
 - [ModLtiCreateToolType200ResponseState](docs/ModLtiCreateToolType200ResponseState.md)
 - [ModLtiCreateToolType200ResponseUrls](docs/ModLtiCreateToolType200ResponseUrls.md)
 - [ModLtiCreateToolTypeRequest](docs/ModLtiCreateToolTypeRequest.md)
 - [ModLtiDeleteCourseToolTypeRequest](docs/ModLtiDeleteCourseToolTypeRequest.md)
 - [ModLtiDeleteToolProxy200Response](docs/ModLtiDeleteToolProxy200Response.md)
 - [ModLtiDeleteToolProxyRequest](docs/ModLtiDeleteToolProxyRequest.md)
 - [ModLtiDeleteToolTypeRequest](docs/ModLtiDeleteToolTypeRequest.md)
 - [ModLtiGetLtisByCourses200Response](docs/ModLtiGetLtisByCourses200Response.md)
 - [ModLtiGetLtisByCourses200ResponseLtisInner](docs/ModLtiGetLtisByCourses200ResponseLtisInner.md)
 - [ModLtiGetToolLaunchData200Response](docs/ModLtiGetToolLaunchData200Response.md)
 - [ModLtiGetToolLaunchData200ResponseParametersInner](docs/ModLtiGetToolLaunchData200ResponseParametersInner.md)
 - [ModLtiGetToolLaunchDataRequest](docs/ModLtiGetToolLaunchDataRequest.md)
 - [ModLtiGetToolProxiesRequest](docs/ModLtiGetToolProxiesRequest.md)
 - [ModLtiGetToolProxyRegistrationRequest200Response](docs/ModLtiGetToolProxyRegistrationRequest200Response.md)
 - [ModLtiGetToolTypesAndProxies200Response](docs/ModLtiGetToolTypesAndProxies200Response.md)
 - [ModLtiGetToolTypesAndProxies200ResponseProxiesInner](docs/ModLtiGetToolTypesAndProxies200ResponseProxiesInner.md)
 - [ModLtiGetToolTypesAndProxies200ResponseTypesInner](docs/ModLtiGetToolTypesAndProxies200ResponseTypesInner.md)
 - [ModLtiGetToolTypesAndProxies200ResponseTypesInnerState](docs/ModLtiGetToolTypesAndProxies200ResponseTypesInnerState.md)
 - [ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls](docs/ModLtiGetToolTypesAndProxies200ResponseTypesInnerUrls.md)
 - [ModLtiGetToolTypesAndProxiesCount200Response](docs/ModLtiGetToolTypesAndProxiesCount200Response.md)
 - [ModLtiGetToolTypesAndProxiesCountRequest](docs/ModLtiGetToolTypesAndProxiesCountRequest.md)
 - [ModLtiGetToolTypesAndProxiesRequest](docs/ModLtiGetToolTypesAndProxiesRequest.md)
 - [ModLtiGetToolTypesRequest](docs/ModLtiGetToolTypesRequest.md)
 - [ModLtiIsCartridge200Response](docs/ModLtiIsCartridge200Response.md)
 - [ModLtiIsCartridgeRequest](docs/ModLtiIsCartridgeRequest.md)
 - [ModLtiToggleShowinactivitychooserRequest](docs/ModLtiToggleShowinactivitychooserRequest.md)
 - [ModLtiUpdateToolType200Response](docs/ModLtiUpdateToolType200Response.md)
 - [ModLtiUpdateToolTypeRequest](docs/ModLtiUpdateToolTypeRequest.md)
 - [ModLtiViewLtiRequest](docs/ModLtiViewLtiRequest.md)
 - [ModPageGetPagesByCourses200Response](docs/ModPageGetPagesByCourses200Response.md)
 - [ModPageGetPagesByCourses200ResponsePagesInner](docs/ModPageGetPagesByCourses200ResponsePagesInner.md)
 - [ModPageViewPageRequest](docs/ModPageViewPageRequest.md)
 - [ModQuizAddRandomQuestions200Response](docs/ModQuizAddRandomQuestions200Response.md)
 - [ModQuizAddRandomQuestionsRequest](docs/ModQuizAddRandomQuestionsRequest.md)
 - [ModQuizGetAttemptAccessInformation200Response](docs/ModQuizGetAttemptAccessInformation200Response.md)
 - [ModQuizGetAttemptAccessInformationRequest](docs/ModQuizGetAttemptAccessInformationRequest.md)
 - [ModQuizGetAttemptData200Response](docs/ModQuizGetAttemptData200Response.md)
 - [ModQuizGetAttemptData200ResponseAttempt](docs/ModQuizGetAttemptData200ResponseAttempt.md)
 - [ModQuizGetAttemptData200ResponseQuestionsInner](docs/ModQuizGetAttemptData200ResponseQuestionsInner.md)
 - [ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner](docs/ModQuizGetAttemptData200ResponseQuestionsInnerResponsefileareasInner.md)
 - [ModQuizGetAttemptDataRequest](docs/ModQuizGetAttemptDataRequest.md)
 - [ModQuizGetAttemptDataRequestPreflightdataInner](docs/ModQuizGetAttemptDataRequestPreflightdataInner.md)
 - [ModQuizGetAttemptReview200Response](docs/ModQuizGetAttemptReview200Response.md)
 - [ModQuizGetAttemptReview200ResponseAdditionaldataInner](docs/ModQuizGetAttemptReview200ResponseAdditionaldataInner.md)
 - [ModQuizGetAttemptReview200ResponseAttempt](docs/ModQuizGetAttemptReview200ResponseAttempt.md)
 - [ModQuizGetAttemptReview200ResponseQuestionsInner](docs/ModQuizGetAttemptReview200ResponseQuestionsInner.md)
 - [ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner](docs/ModQuizGetAttemptReview200ResponseQuestionsInnerResponsefileareasInner.md)
 - [ModQuizGetAttemptReviewRequest](docs/ModQuizGetAttemptReviewRequest.md)
 - [ModQuizGetAttemptSummary200Response](docs/ModQuizGetAttemptSummary200Response.md)
 - [ModQuizGetAttemptSummaryRequest](docs/ModQuizGetAttemptSummaryRequest.md)
 - [ModQuizGetCombinedReviewOptions200Response](docs/ModQuizGetCombinedReviewOptions200Response.md)
 - [ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner](docs/ModQuizGetCombinedReviewOptions200ResponseAlloptionsInner.md)
 - [ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner](docs/ModQuizGetCombinedReviewOptions200ResponseSomeoptionsInner.md)
 - [ModQuizGetCombinedReviewOptionsRequest](docs/ModQuizGetCombinedReviewOptionsRequest.md)
 - [ModQuizGetQuizAccessInformation200Response](docs/ModQuizGetQuizAccessInformation200Response.md)
 - [ModQuizGetQuizAccessInformationRequest](docs/ModQuizGetQuizAccessInformationRequest.md)
 - [ModQuizGetQuizFeedbackForGrade200Response](docs/ModQuizGetQuizFeedbackForGrade200Response.md)
 - [ModQuizGetQuizFeedbackForGradeRequest](docs/ModQuizGetQuizFeedbackForGradeRequest.md)
 - [ModQuizGetQuizRequiredQtypes200Response](docs/ModQuizGetQuizRequiredQtypes200Response.md)
 - [ModQuizGetQuizzesByCourses200Response](docs/ModQuizGetQuizzesByCourses200Response.md)
 - [ModQuizGetQuizzesByCourses200ResponseQuizzesInner](docs/ModQuizGetQuizzesByCourses200ResponseQuizzesInner.md)
 - [ModQuizGetReopenAttemptConfirmationRequest](docs/ModQuizGetReopenAttemptConfirmationRequest.md)
 - [ModQuizGetUserAttempts200Response](docs/ModQuizGetUserAttempts200Response.md)
 - [ModQuizGetUserAttempts200ResponseAttemptsInner](docs/ModQuizGetUserAttempts200ResponseAttemptsInner.md)
 - [ModQuizGetUserAttemptsRequest](docs/ModQuizGetUserAttemptsRequest.md)
 - [ModQuizGetUserBestGrade200Response](docs/ModQuizGetUserBestGrade200Response.md)
 - [ModQuizGetUserBestGradeRequest](docs/ModQuizGetUserBestGradeRequest.md)
 - [ModQuizProcessAttempt200Response](docs/ModQuizProcessAttempt200Response.md)
 - [ModQuizProcessAttemptRequest](docs/ModQuizProcessAttemptRequest.md)
 - [ModQuizReopenAttemptRequest](docs/ModQuizReopenAttemptRequest.md)
 - [ModQuizSaveAttemptRequest](docs/ModQuizSaveAttemptRequest.md)
 - [ModQuizSetQuestionVersion200Response](docs/ModQuizSetQuestionVersion200Response.md)
 - [ModQuizSetQuestionVersionRequest](docs/ModQuizSetQuestionVersionRequest.md)
 - [ModQuizStartAttempt200Response](docs/ModQuizStartAttempt200Response.md)
 - [ModQuizStartAttemptRequest](docs/ModQuizStartAttemptRequest.md)
 - [ModQuizUpdateFilterConditionRequest](docs/ModQuizUpdateFilterConditionRequest.md)
 - [ModQuizViewAttemptRequest](docs/ModQuizViewAttemptRequest.md)
 - [ModQuizViewAttemptReviewRequest](docs/ModQuizViewAttemptReviewRequest.md)
 - [ModResourceGetResourcesByCourses200Response](docs/ModResourceGetResourcesByCourses200Response.md)
 - [ModResourceGetResourcesByCourses200ResponseResourcesInner](docs/ModResourceGetResourcesByCourses200ResponseResourcesInner.md)
 - [ModResourceViewResourceRequest](docs/ModResourceViewResourceRequest.md)
 - [ModScormGetScormAccessInformation200Response](docs/ModScormGetScormAccessInformation200Response.md)
 - [ModScormGetScormAccessInformationRequest](docs/ModScormGetScormAccessInformationRequest.md)
 - [ModScormGetScormAttemptCount200Response](docs/ModScormGetScormAttemptCount200Response.md)
 - [ModScormGetScormAttemptCountRequest](docs/ModScormGetScormAttemptCountRequest.md)
 - [ModScormGetScormScoTracks200Response](docs/ModScormGetScormScoTracks200Response.md)
 - [ModScormGetScormScoTracks200ResponseData](docs/ModScormGetScormScoTracks200ResponseData.md)
 - [ModScormGetScormScoTracks200ResponseDataTracksInner](docs/ModScormGetScormScoTracks200ResponseDataTracksInner.md)
 - [ModScormGetScormScoTracksRequest](docs/ModScormGetScormScoTracksRequest.md)
 - [ModScormGetScormScoes200Response](docs/ModScormGetScormScoes200Response.md)
 - [ModScormGetScormScoes200ResponseScoesInner](docs/ModScormGetScormScoes200ResponseScoesInner.md)
 - [ModScormGetScormScoes200ResponseScoesInnerExtradataInner](docs/ModScormGetScormScoes200ResponseScoesInnerExtradataInner.md)
 - [ModScormGetScormScoesRequest](docs/ModScormGetScormScoesRequest.md)
 - [ModScormGetScormUserData200Response](docs/ModScormGetScormUserData200Response.md)
 - [ModScormGetScormUserData200ResponseDataInner](docs/ModScormGetScormUserData200ResponseDataInner.md)
 - [ModScormGetScormUserData200ResponseDataInnerDefaultdataInner](docs/ModScormGetScormUserData200ResponseDataInnerDefaultdataInner.md)
 - [ModScormGetScormUserDataRequest](docs/ModScormGetScormUserDataRequest.md)
 - [ModScormGetScormsByCourses200Response](docs/ModScormGetScormsByCourses200Response.md)
 - [ModScormGetScormsByCourses200ResponseOptionsInner](docs/ModScormGetScormsByCourses200ResponseOptionsInner.md)
 - [ModScormGetScormsByCourses200ResponseScormsInner](docs/ModScormGetScormsByCourses200ResponseScormsInner.md)
 - [ModScormInsertScormTracks200Response](docs/ModScormInsertScormTracks200Response.md)
 - [ModScormInsertScormTracksRequest](docs/ModScormInsertScormTracksRequest.md)
 - [ModScormLaunchScoRequest](docs/ModScormLaunchScoRequest.md)
 - [ModScormViewScormRequest](docs/ModScormViewScormRequest.md)
 - [ModSurveyGetQuestions200Response](docs/ModSurveyGetQuestions200Response.md)
 - [ModSurveyGetQuestions200ResponseQuestionsInner](docs/ModSurveyGetQuestions200ResponseQuestionsInner.md)
 - [ModSurveyGetQuestionsRequest](docs/ModSurveyGetQuestionsRequest.md)
 - [ModSurveyGetSurveysByCourses200Response](docs/ModSurveyGetSurveysByCourses200Response.md)
 - [ModSurveyGetSurveysByCourses200ResponseSurveysInner](docs/ModSurveyGetSurveysByCourses200ResponseSurveysInner.md)
 - [ModSurveySubmitAnswersRequest](docs/ModSurveySubmitAnswersRequest.md)
 - [ModSurveySubmitAnswersRequestAnswersInner](docs/ModSurveySubmitAnswersRequestAnswersInner.md)
 - [ModSurveyViewSurveyRequest](docs/ModSurveyViewSurveyRequest.md)
 - [ModUrlGetUrlsByCourses200Response](docs/ModUrlGetUrlsByCourses200Response.md)
 - [ModUrlGetUrlsByCourses200ResponseUrlsInner](docs/ModUrlGetUrlsByCourses200ResponseUrlsInner.md)
 - [ModUrlViewUrlRequest](docs/ModUrlViewUrlRequest.md)
 - [ModWikiEditPage200Response](docs/ModWikiEditPage200Response.md)
 - [ModWikiEditPageRequest](docs/ModWikiEditPageRequest.md)
 - [ModWikiGetPageContents200Response](docs/ModWikiGetPageContents200Response.md)
 - [ModWikiGetPageContents200ResponsePage](docs/ModWikiGetPageContents200ResponsePage.md)
 - [ModWikiGetPageContentsRequest](docs/ModWikiGetPageContentsRequest.md)
 - [ModWikiGetPageForEditing200Response](docs/ModWikiGetPageForEditing200Response.md)
 - [ModWikiGetPageForEditing200ResponsePagesection](docs/ModWikiGetPageForEditing200ResponsePagesection.md)
 - [ModWikiGetPageForEditingRequest](docs/ModWikiGetPageForEditingRequest.md)
 - [ModWikiGetSubwikiFilesRequest](docs/ModWikiGetSubwikiFilesRequest.md)
 - [ModWikiGetSubwikiPages200Response](docs/ModWikiGetSubwikiPages200Response.md)
 - [ModWikiGetSubwikiPages200ResponsePagesInner](docs/ModWikiGetSubwikiPages200ResponsePagesInner.md)
 - [ModWikiGetSubwikiPagesRequest](docs/ModWikiGetSubwikiPagesRequest.md)
 - [ModWikiGetSubwikiPagesRequestOptions](docs/ModWikiGetSubwikiPagesRequestOptions.md)
 - [ModWikiGetSubwikis200Response](docs/ModWikiGetSubwikis200Response.md)
 - [ModWikiGetSubwikis200ResponseSubwikisInner](docs/ModWikiGetSubwikis200ResponseSubwikisInner.md)
 - [ModWikiGetSubwikisRequest](docs/ModWikiGetSubwikisRequest.md)
 - [ModWikiGetWikisByCourses200Response](docs/ModWikiGetWikisByCourses200Response.md)
 - [ModWikiGetWikisByCourses200ResponseWikisInner](docs/ModWikiGetWikisByCourses200ResponseWikisInner.md)
 - [ModWikiGetWikisByCoursesRequest](docs/ModWikiGetWikisByCoursesRequest.md)
 - [ModWikiNewPage200Response](docs/ModWikiNewPage200Response.md)
 - [ModWikiNewPageRequest](docs/ModWikiNewPageRequest.md)
 - [ModWikiViewPage200Response](docs/ModWikiViewPage200Response.md)
 - [ModWikiViewPageRequest](docs/ModWikiViewPageRequest.md)
 - [ModWikiViewWiki200Response](docs/ModWikiViewWiki200Response.md)
 - [ModWorkshopAddSubmission200Response](docs/ModWorkshopAddSubmission200Response.md)
 - [ModWorkshopAddSubmissionRequest](docs/ModWorkshopAddSubmissionRequest.md)
 - [ModWorkshopDeleteSubmission200Response](docs/ModWorkshopDeleteSubmission200Response.md)
 - [ModWorkshopDeleteSubmissionRequest](docs/ModWorkshopDeleteSubmissionRequest.md)
 - [ModWorkshopEvaluateAssessment200Response](docs/ModWorkshopEvaluateAssessment200Response.md)
 - [ModWorkshopEvaluateAssessmentRequest](docs/ModWorkshopEvaluateAssessmentRequest.md)
 - [ModWorkshopEvaluateSubmission200Response](docs/ModWorkshopEvaluateSubmission200Response.md)
 - [ModWorkshopEvaluateSubmissionRequest](docs/ModWorkshopEvaluateSubmissionRequest.md)
 - [ModWorkshopGetAssessment200Response](docs/ModWorkshopGetAssessment200Response.md)
 - [ModWorkshopGetAssessment200ResponseAssessment](docs/ModWorkshopGetAssessment200ResponseAssessment.md)
 - [ModWorkshopGetAssessmentFormDefinition200Response](docs/ModWorkshopGetAssessmentFormDefinition200Response.md)
 - [ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner](docs/ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner.md)
 - [ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner](docs/ModWorkshopGetAssessmentFormDefinition200ResponseDimensionsinfoInner.md)
 - [ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner](docs/ModWorkshopGetAssessmentFormDefinition200ResponseFieldsInner.md)
 - [ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner](docs/ModWorkshopGetAssessmentFormDefinition200ResponseOptionsInner.md)
 - [ModWorkshopGetAssessmentFormDefinitionRequest](docs/ModWorkshopGetAssessmentFormDefinitionRequest.md)
 - [ModWorkshopGetAssessmentRequest](docs/ModWorkshopGetAssessmentRequest.md)
 - [ModWorkshopGetGrades200Response](docs/ModWorkshopGetGrades200Response.md)
 - [ModWorkshopGetGradesReport200Response](docs/ModWorkshopGetGradesReport200Response.md)
 - [ModWorkshopGetGradesReport200ResponseReport](docs/ModWorkshopGetGradesReport200ResponseReport.md)
 - [ModWorkshopGetGradesReport200ResponseReportGradesInner](docs/ModWorkshopGetGradesReport200ResponseReportGradesInner.md)
 - [ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner](docs/ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewedbyInner.md)
 - [ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner](docs/ModWorkshopGetGradesReport200ResponseReportGradesInnerReviewerofInner.md)
 - [ModWorkshopGetGradesReportRequest](docs/ModWorkshopGetGradesReportRequest.md)
 - [ModWorkshopGetGradesRequest](docs/ModWorkshopGetGradesRequest.md)
 - [ModWorkshopGetReviewerAssessments200Response](docs/ModWorkshopGetReviewerAssessments200Response.md)
 - [ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner](docs/ModWorkshopGetReviewerAssessments200ResponseAssessmentsInner.md)
 - [ModWorkshopGetReviewerAssessmentsRequest](docs/ModWorkshopGetReviewerAssessmentsRequest.md)
 - [ModWorkshopGetSubmission200Response](docs/ModWorkshopGetSubmission200Response.md)
 - [ModWorkshopGetSubmission200ResponseSubmission](docs/ModWorkshopGetSubmission200ResponseSubmission.md)
 - [ModWorkshopGetSubmissionRequest](docs/ModWorkshopGetSubmissionRequest.md)
 - [ModWorkshopGetSubmissions200Response](docs/ModWorkshopGetSubmissions200Response.md)
 - [ModWorkshopGetSubmissions200ResponseSubmissionsInner](docs/ModWorkshopGetSubmissions200ResponseSubmissionsInner.md)
 - [ModWorkshopGetSubmissionsRequest](docs/ModWorkshopGetSubmissionsRequest.md)
 - [ModWorkshopGetUserPlan200Response](docs/ModWorkshopGetUserPlan200Response.md)
 - [ModWorkshopGetUserPlan200ResponseUserplan](docs/ModWorkshopGetUserPlan200ResponseUserplan.md)
 - [ModWorkshopGetUserPlan200ResponseUserplanExamplesInner](docs/ModWorkshopGetUserPlan200ResponseUserplanExamplesInner.md)
 - [ModWorkshopGetUserPlan200ResponseUserplanPhasesInner](docs/ModWorkshopGetUserPlan200ResponseUserplanPhasesInner.md)
 - [ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner](docs/ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerActionsInner.md)
 - [ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner](docs/ModWorkshopGetUserPlan200ResponseUserplanPhasesInnerTasksInner.md)
 - [ModWorkshopGetUserPlanRequest](docs/ModWorkshopGetUserPlanRequest.md)
 - [ModWorkshopGetWorkshopAccessInformation200Response](docs/ModWorkshopGetWorkshopAccessInformation200Response.md)
 - [ModWorkshopGetWorkshopAccessInformationRequest](docs/ModWorkshopGetWorkshopAccessInformationRequest.md)
 - [ModWorkshopGetWorkshopsByCourses200Response](docs/ModWorkshopGetWorkshopsByCourses200Response.md)
 - [ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner](docs/ModWorkshopGetWorkshopsByCourses200ResponseWorkshopsInner.md)
 - [ModWorkshopUpdateAssessment200Response](docs/ModWorkshopUpdateAssessment200Response.md)
 - [ModWorkshopUpdateAssessmentRequest](docs/ModWorkshopUpdateAssessmentRequest.md)
 - [ModWorkshopUpdateAssessmentRequestDataInner](docs/ModWorkshopUpdateAssessmentRequestDataInner.md)
 - [ModWorkshopUpdateSubmission200Response](docs/ModWorkshopUpdateSubmission200Response.md)
 - [ModWorkshopUpdateSubmissionRequest](docs/ModWorkshopUpdateSubmissionRequest.md)
 - [ModWorkshopViewWorkshopRequest](docs/ModWorkshopViewWorkshopRequest.md)
 - [PaygwPaypalCreateTransactionComplete200Response](docs/PaygwPaypalCreateTransactionComplete200Response.md)
 - [PaygwPaypalCreateTransactionCompleteRequest](docs/PaygwPaypalCreateTransactionCompleteRequest.md)
 - [PaygwPaypalGetConfigForJs200Response](docs/PaygwPaypalGetConfigForJs200Response.md)
 - [PaygwPaypalGetConfigForJsRequest](docs/PaygwPaypalGetConfigForJsRequest.md)
 - [QbankColumnsortorderSetColumnSizeRequest](docs/QbankColumnsortorderSetColumnSizeRequest.md)
 - [QbankColumnsortorderSetColumnbankOrderRequest](docs/QbankColumnsortorderSetColumnbankOrderRequest.md)
 - [QbankColumnsortorderSetHiddenColumnsRequest](docs/QbankColumnsortorderSetHiddenColumnsRequest.md)
 - [QbankEditquestionSetStatus200Response](docs/QbankEditquestionSetStatus200Response.md)
 - [QbankEditquestionSetStatusRequest](docs/QbankEditquestionSetStatusRequest.md)
 - [QbankTagquestionSubmitTagsFormRequest](docs/QbankTagquestionSubmitTagsFormRequest.md)
 - [QbankViewquestiontextSetQuestionTextFormatRequest](docs/QbankViewquestiontextSetQuestionTextFormatRequest.md)
 - [QuizaccessSebValidateQuizKeys200Response](docs/QuizaccessSebValidateQuizKeys200Response.md)
 - [QuizaccessSebValidateQuizKeysRequest](docs/QuizaccessSebValidateQuizKeysRequest.md)
 - [ReportCompetencyDataForReport200Response](docs/ReportCompetencyDataForReport200Response.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInner](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInner.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework.md)
 - [ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse](docs/ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse.md)
 - [ReportCompetencyDataForReportRequest](docs/ReportCompetencyDataForReportRequest.md)
 - [ReportInsightsActionExecutedRequest](docs/ReportInsightsActionExecutedRequest.md)
 - [ReportInsightsSetFixedPrediction200Response](docs/ReportInsightsSetFixedPrediction200Response.md)
 - [ReportInsightsSetFixedPredictionRequest](docs/ReportInsightsSetFixedPredictionRequest.md)
 - [ReportInsightsSetNotusefulPrediction200Response](docs/ReportInsightsSetNotusefulPrediction200Response.md)
 - [ReportInsightsSetNotusefulPredictionRequest](docs/ReportInsightsSetNotusefulPredictionRequest.md)
 - [TinyAutosaveResetSessionRequest](docs/TinyAutosaveResetSessionRequest.md)
 - [TinyAutosaveResumeSession200Response](docs/TinyAutosaveResumeSession200Response.md)
 - [TinyAutosaveResumeSessionRequest](docs/TinyAutosaveResumeSessionRequest.md)
 - [TinyAutosaveUpdateSessionRequest](docs/TinyAutosaveUpdateSessionRequest.md)
 - [TinyEquationFilter200Response](docs/TinyEquationFilter200Response.md)
 - [TinyEquationFilterRequest](docs/TinyEquationFilterRequest.md)
 - [TinyPremiumGetApiKey200Response](docs/TinyPremiumGetApiKey200Response.md)
 - [TinyPremiumGetApiKeyRequest](docs/TinyPremiumGetApiKeyRequest.md)
 - [ToolAnalyticsPotentialContextsRequest](docs/ToolAnalyticsPotentialContextsRequest.md)
 - [ToolBehatGetEntityGenerator200Response](docs/ToolBehatGetEntityGenerator200Response.md)
 - [ToolBehatGetEntityGeneratorRequest](docs/ToolBehatGetEntityGeneratorRequest.md)
 - [ToolDataprivacyApproveDataRequestRequest](docs/ToolDataprivacyApproveDataRequestRequest.md)
 - [ToolDataprivacyBulkApproveDataRequestsRequest](docs/ToolDataprivacyBulkApproveDataRequestsRequest.md)
 - [ToolDataprivacyBulkDenyDataRequestsRequest](docs/ToolDataprivacyBulkDenyDataRequestsRequest.md)
 - [ToolDataprivacyCancelDataRequestRequest](docs/ToolDataprivacyCancelDataRequestRequest.md)
 - [ToolDataprivacyConfirmContextsForDeletion200Response](docs/ToolDataprivacyConfirmContextsForDeletion200Response.md)
 - [ToolDataprivacyConfirmContextsForDeletionRequest](docs/ToolDataprivacyConfirmContextsForDeletionRequest.md)
 - [ToolDataprivacyContactDpoRequest](docs/ToolDataprivacyContactDpoRequest.md)
 - [ToolDataprivacyCreateCategoryForm200Response](docs/ToolDataprivacyCreateCategoryForm200Response.md)
 - [ToolDataprivacyCreateCategoryForm200ResponseCategory](docs/ToolDataprivacyCreateCategoryForm200ResponseCategory.md)
 - [ToolDataprivacyCreateCategoryFormRequest](docs/ToolDataprivacyCreateCategoryFormRequest.md)
 - [ToolDataprivacyCreatePurposeForm200Response](docs/ToolDataprivacyCreatePurposeForm200Response.md)
 - [ToolDataprivacyCreatePurposeForm200ResponsePurpose](docs/ToolDataprivacyCreatePurposeForm200ResponsePurpose.md)
 - [ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner](docs/ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner.md)
 - [ToolDataprivacyCreatePurposeFormRequest](docs/ToolDataprivacyCreatePurposeFormRequest.md)
 - [ToolDataprivacyDeleteCategoryRequest](docs/ToolDataprivacyDeleteCategoryRequest.md)
 - [ToolDataprivacyDeletePurposeRequest](docs/ToolDataprivacyDeletePurposeRequest.md)
 - [ToolDataprivacyGetActivityOptions200Response](docs/ToolDataprivacyGetActivityOptions200Response.md)
 - [ToolDataprivacyGetActivityOptions200ResponseOptionsInner](docs/ToolDataprivacyGetActivityOptions200ResponseOptionsInner.md)
 - [ToolDataprivacyGetActivityOptionsRequest](docs/ToolDataprivacyGetActivityOptionsRequest.md)
 - [ToolDataprivacyGetCategoryOptions200Response](docs/ToolDataprivacyGetCategoryOptions200Response.md)
 - [ToolDataprivacyGetCategoryOptions200ResponseOptionsInner](docs/ToolDataprivacyGetCategoryOptions200ResponseOptionsInner.md)
 - [ToolDataprivacyGetCategoryOptionsRequest](docs/ToolDataprivacyGetCategoryOptionsRequest.md)
 - [ToolDataprivacyGetDataRequest200Response](docs/ToolDataprivacyGetDataRequest200Response.md)
 - [ToolDataprivacyGetDataRequest200ResponseResult](docs/ToolDataprivacyGetDataRequest200ResponseResult.md)
 - [ToolDataprivacyGetPurposeOptions200Response](docs/ToolDataprivacyGetPurposeOptions200Response.md)
 - [ToolDataprivacyGetPurposeOptions200ResponseOptionsInner](docs/ToolDataprivacyGetPurposeOptions200ResponseOptionsInner.md)
 - [ToolDataprivacyGetUsersRequest](docs/ToolDataprivacyGetUsersRequest.md)
 - [ToolDataprivacySetContextDefaults200Response](docs/ToolDataprivacySetContextDefaults200Response.md)
 - [ToolDataprivacySetContextDefaultsRequest](docs/ToolDataprivacySetContextDefaultsRequest.md)
 - [ToolDataprivacySetContextForm200Response](docs/ToolDataprivacySetContextForm200Response.md)
 - [ToolDataprivacySetContextFormRequest](docs/ToolDataprivacySetContextFormRequest.md)
 - [ToolDataprivacySetContextlevelForm200Response](docs/ToolDataprivacySetContextlevelForm200Response.md)
 - [ToolDataprivacySetContextlevelFormRequest](docs/ToolDataprivacySetContextlevelFormRequest.md)
 - [ToolDataprivacySubmitSelectedCoursesFormRequest](docs/ToolDataprivacySubmitSelectedCoursesFormRequest.md)
 - [ToolDataprivacyTreeExtraBranches200Response](docs/ToolDataprivacyTreeExtraBranches200Response.md)
 - [ToolDataprivacyTreeExtraBranches200ResponseBranchesInner](docs/ToolDataprivacyTreeExtraBranches200ResponseBranchesInner.md)
 - [ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner](docs/ToolDataprivacyTreeExtraBranches200ResponseBranchesInnerBranchesInner.md)
 - [ToolDataprivacyTreeExtraBranchesRequest](docs/ToolDataprivacyTreeExtraBranchesRequest.md)
 - [ToolIomadpolicyGetIomadpolicyVersion200Response](docs/ToolIomadpolicyGetIomadpolicyVersion200Response.md)
 - [ToolIomadpolicyGetIomadpolicyVersion200ResponseResult](docs/ToolIomadpolicyGetIomadpolicyVersion200ResponseResult.md)
 - [ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy](docs/ToolIomadpolicyGetIomadpolicyVersion200ResponseResultIomadpolicy.md)
 - [ToolIomadpolicyGetIomadpolicyVersionRequest](docs/ToolIomadpolicyGetIomadpolicyVersionRequest.md)
 - [ToolIomadpolicySubmitAcceptOnBehalfRequest](docs/ToolIomadpolicySubmitAcceptOnBehalfRequest.md)
 - [ToolLpDataForCompetenciesManagePage200Response](docs/ToolLpDataForCompetenciesManagePage200Response.md)
 - [ToolLpDataForCompetenciesManagePageRequest](docs/ToolLpDataForCompetenciesManagePageRequest.md)
 - [ToolLpDataForCompetencyFrameworksManagePage200Response](docs/ToolLpDataForCompetencyFrameworksManagePage200Response.md)
 - [ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner](docs/ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.md)
 - [ToolLpDataForCompetencyFrameworksManagePageRequest](docs/ToolLpDataForCompetencyFrameworksManagePageRequest.md)
 - [ToolLpDataForCompetencySummary200Response](docs/ToolLpDataForCompetencySummary200Response.md)
 - [ToolLpDataForCompetencySummary200ResponseComppath](docs/ToolLpDataForCompetencySummary200ResponseComppath.md)
 - [ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner](docs/ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner.md)
 - [ToolLpDataForCompetencySummaryRequest](docs/ToolLpDataForCompetencySummaryRequest.md)
 - [ToolLpDataForCourseCompetenciesPage200Response](docs/ToolLpDataForCourseCompetenciesPage200Response.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInner.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursecompetency.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerCoursemodulesInner.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerRuleoutcomeoptionsInner.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse](docs/ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerUsercompetencycourse.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseSettings](docs/ToolLpDataForCourseCompetenciesPage200ResponseSettings.md)
 - [ToolLpDataForCourseCompetenciesPage200ResponseStatistics](docs/ToolLpDataForCourseCompetenciesPage200ResponseStatistics.md)
 - [ToolLpDataForCourseCompetenciesPageRequest](docs/ToolLpDataForCourseCompetenciesPageRequest.md)
 - [ToolLpDataForPlanPage200Response](docs/ToolLpDataForPlanPage200Response.md)
 - [ToolLpDataForPlanPage200ResponseCompetenciesInner](docs/ToolLpDataForPlanPage200ResponseCompetenciesInner.md)
 - [ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency](docs/ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.md)
 - [ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan](docs/ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetencyplan.md)
 - [ToolLpDataForPlansPage200Response](docs/ToolLpDataForPlansPage200Response.md)
 - [ToolLpDataForPlansPageRequest](docs/ToolLpDataForPlansPageRequest.md)
 - [ToolLpDataForRelatedCompetenciesSection200Response](docs/ToolLpDataForRelatedCompetenciesSection200Response.md)
 - [ToolLpDataForRelatedCompetenciesSectionRequest](docs/ToolLpDataForRelatedCompetenciesSectionRequest.md)
 - [ToolLpDataForTemplateCompetenciesPage200Response](docs/ToolLpDataForTemplateCompetenciesPage200Response.md)
 - [ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner](docs/ToolLpDataForTemplateCompetenciesPage200ResponseCompetenciesInner.md)
 - [ToolLpDataForTemplateCompetenciesPage200ResponseStatistics](docs/ToolLpDataForTemplateCompetenciesPage200ResponseStatistics.md)
 - [ToolLpDataForTemplateCompetenciesPageRequest](docs/ToolLpDataForTemplateCompetenciesPageRequest.md)
 - [ToolLpDataForTemplatesManagePage200Response](docs/ToolLpDataForTemplatesManagePage200Response.md)
 - [ToolLpDataForTemplatesManagePage200ResponseTemplatesInner](docs/ToolLpDataForTemplatesManagePage200ResponseTemplatesInner.md)
 - [ToolLpDataForUserCompetencySummary200Response](docs/ToolLpDataForUserCompetencySummary200Response.md)
 - [ToolLpDataForUserCompetencySummary200ResponseEvidenceInner](docs/ToolLpDataForUserCompetencySummary200ResponseEvidenceInner.md)
 - [ToolLpDataForUserCompetencySummary200ResponseUsercompetency](docs/ToolLpDataForUserCompetencySummary200ResponseUsercompetency.md)
 - [ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan](docs/ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.md)
 - [ToolLpDataForUserCompetencySummaryInCourse200Response](docs/ToolLpDataForUserCompetencySummaryInCourse200Response.md)
 - [ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary](docs/ToolLpDataForUserCompetencySummaryInCourse200ResponseUsercompetencysummary.md)
 - [ToolLpDataForUserCompetencySummaryInCourseRequest](docs/ToolLpDataForUserCompetencySummaryInCourseRequest.md)
 - [ToolLpDataForUserCompetencySummaryInPlan200Response](docs/ToolLpDataForUserCompetencySummaryInPlan200Response.md)
 - [ToolLpDataForUserCompetencySummaryInPlanRequest](docs/ToolLpDataForUserCompetencySummaryInPlanRequest.md)
 - [ToolLpDataForUserCompetencySummaryRequest](docs/ToolLpDataForUserCompetencySummaryRequest.md)
 - [ToolLpDataForUserEvidenceListPage200Response](docs/ToolLpDataForUserEvidenceListPage200Response.md)
 - [ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner](docs/ToolLpDataForUserEvidenceListPage200ResponseEvidenceInner.md)
 - [ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner](docs/ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner.md)
 - [ToolLpDataForUserEvidenceListPageRequest](docs/ToolLpDataForUserEvidenceListPageRequest.md)
 - [ToolLpDataForUserEvidencePage200Response](docs/ToolLpDataForUserEvidencePage200Response.md)
 - [ToolLpDataForUserEvidencePage200ResponseUserevidence](docs/ToolLpDataForUserEvidencePage200ResponseUserevidence.md)
 - [ToolLpDataForUserEvidencePageRequest](docs/ToolLpDataForUserEvidencePageRequest.md)
 - [ToolLpSearchCohorts200Response](docs/ToolLpSearchCohorts200Response.md)
 - [ToolLpSearchCohorts200ResponseCohortsInner](docs/ToolLpSearchCohorts200ResponseCohortsInner.md)
 - [ToolLpSearchCohortsRequest](docs/ToolLpSearchCohortsRequest.md)
 - [ToolLpSearchUsers200Response](docs/ToolLpSearchUsers200Response.md)
 - [ToolLpSearchUsers200ResponseUsersInner](docs/ToolLpSearchUsers200ResponseUsersInner.md)
 - [ToolLpSearchUsersRequest](docs/ToolLpSearchUsersRequest.md)
 - [ToolMobileCallExternalFunctions200Response](docs/ToolMobileCallExternalFunctions200Response.md)
 - [ToolMobileCallExternalFunctions200ResponseResponsesInner](docs/ToolMobileCallExternalFunctions200ResponseResponsesInner.md)
 - [ToolMobileCallExternalFunctionsRequest](docs/ToolMobileCallExternalFunctionsRequest.md)
 - [ToolMobileCallExternalFunctionsRequestRequestsInner](docs/ToolMobileCallExternalFunctionsRequestRequestsInner.md)
 - [ToolMobileGetAutologinKey200Response](docs/ToolMobileGetAutologinKey200Response.md)
 - [ToolMobileGetAutologinKeyRequest](docs/ToolMobileGetAutologinKeyRequest.md)
 - [ToolMobileGetConfig200Response](docs/ToolMobileGetConfig200Response.md)
 - [ToolMobileGetConfig200ResponseSettingsInner](docs/ToolMobileGetConfig200ResponseSettingsInner.md)
 - [ToolMobileGetConfigRequest](docs/ToolMobileGetConfigRequest.md)
 - [ToolMobileGetContent200Response](docs/ToolMobileGetContent200Response.md)
 - [ToolMobileGetContent200ResponseOtherdataInner](docs/ToolMobileGetContent200ResponseOtherdataInner.md)
 - [ToolMobileGetContent200ResponseRestrict](docs/ToolMobileGetContent200ResponseRestrict.md)
 - [ToolMobileGetContent200ResponseTemplatesInner](docs/ToolMobileGetContent200ResponseTemplatesInner.md)
 - [ToolMobileGetContentRequest](docs/ToolMobileGetContentRequest.md)
 - [ToolMobileGetContentRequestArgsInner](docs/ToolMobileGetContentRequestArgsInner.md)
 - [ToolMobileGetPluginsSupportingMobile200Response](docs/ToolMobileGetPluginsSupportingMobile200Response.md)
 - [ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner](docs/ToolMobileGetPluginsSupportingMobile200ResponsePluginsInner.md)
 - [ToolMobileGetPublicConfig200Response](docs/ToolMobileGetPublicConfig200Response.md)
 - [ToolMobileGetPublicConfig200ResponseIdentityprovidersInner](docs/ToolMobileGetPublicConfig200ResponseIdentityprovidersInner.md)
 - [ToolMobileGetTokensForQrLogin200Response](docs/ToolMobileGetTokensForQrLogin200Response.md)
 - [ToolMobileGetTokensForQrLoginRequest](docs/ToolMobileGetTokensForQrLoginRequest.md)
 - [ToolMobileValidateSubscriptionKey200Response](docs/ToolMobileValidateSubscriptionKey200Response.md)
 - [ToolMobileValidateSubscriptionKeyRequest](docs/ToolMobileValidateSubscriptionKeyRequest.md)
 - [ToolMoodlenetSearchCourses200Response](docs/ToolMoodlenetSearchCourses200Response.md)
 - [ToolMoodlenetSearchCourses200ResponseCoursesInner](docs/ToolMoodlenetSearchCourses200ResponseCoursesInner.md)
 - [ToolMoodlenetSearchCoursesRequest](docs/ToolMoodlenetSearchCoursesRequest.md)
 - [ToolMoodlenetVerifyWebfinger200Response](docs/ToolMoodlenetVerifyWebfinger200Response.md)
 - [ToolMoodlenetVerifyWebfingerRequest](docs/ToolMoodlenetVerifyWebfingerRequest.md)
 - [ToolPolicyGetPolicyVersion200Response](docs/ToolPolicyGetPolicyVersion200Response.md)
 - [ToolPolicyGetPolicyVersion200ResponseResult](docs/ToolPolicyGetPolicyVersion200ResponseResult.md)
 - [ToolPolicyGetPolicyVersion200ResponseResultPolicy](docs/ToolPolicyGetPolicyVersion200ResponseResultPolicy.md)
 - [ToolPolicyGetPolicyVersionRequest](docs/ToolPolicyGetPolicyVersionRequest.md)
 - [ToolPolicySubmitAcceptOnBehalfRequest](docs/ToolPolicySubmitAcceptOnBehalfRequest.md)
 - [ToolTemplatelibraryListTemplatesRequest](docs/ToolTemplatelibraryListTemplatesRequest.md)
 - [ToolTemplatelibraryLoadCanonicalTemplateRequest](docs/ToolTemplatelibraryLoadCanonicalTemplateRequest.md)
 - [ToolUsertoursCompleteTourRequest](docs/ToolUsertoursCompleteTourRequest.md)
 - [ToolUsertoursFetchAndStartTour200Response](docs/ToolUsertoursFetchAndStartTour200Response.md)
 - [ToolUsertoursFetchAndStartTour200ResponseTourconfig](docs/ToolUsertoursFetchAndStartTour200ResponseTourconfig.md)
 - [ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner](docs/ToolUsertoursFetchAndStartTour200ResponseTourconfigStepsInner.md)
 - [ToolUsertoursFetchAndStartTourRequest](docs/ToolUsertoursFetchAndStartTourRequest.md)
 - [ToolUsertoursResetTour200Response](docs/ToolUsertoursResetTour200Response.md)
 - [ToolUsertoursResetTourRequest](docs/ToolUsertoursResetTourRequest.md)
 - [ToolUsertoursStepShownRequest](docs/ToolUsertoursStepShownRequest.md)
 - [ToolXmldbInvokeMoveActionRequest](docs/ToolXmldbInvokeMoveActionRequest.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="apiKey"></a>
### apiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



