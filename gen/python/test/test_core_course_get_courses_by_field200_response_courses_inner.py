# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_course_get_courses_by_field200_response_courses_inner import CoreCourseGetCoursesByField200ResponseCoursesInner

class TestCoreCourseGetCoursesByField200ResponseCoursesInner(unittest.TestCase):
    """CoreCourseGetCoursesByField200ResponseCoursesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCourseGetCoursesByField200ResponseCoursesInner:
        """Test CoreCourseGetCoursesByField200ResponseCoursesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCourseGetCoursesByField200ResponseCoursesInner`
        """
        model = CoreCourseGetCoursesByField200ResponseCoursesInner()
        if include_optional:
            return CoreCourseGetCoursesByField200ResponseCoursesInner(
                cacherev = 56,
                calendartype = 'null',
                categoryid = 56,
                categoryname = 'null',
                completionnotify = 56,
                contacts = [
                    openapi_client.models.core_course_get_courses_by_field_200_response_courses_inner_contacts_inner.core_course_get_courses_by_field_200_response_courses_inner_contacts_inner(
                        fullname = 'null', 
                        id = 56, )
                    ],
                courseformatoptions = [
                    openapi_client.models.core_course_get_courses_by_field_200_response_courses_inner_courseformatoptions_inner.core_course_get_courses_by_field_200_response_courses_inner_courseformatoptions_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
                courseimage = 'null',
                customfields = [
                    openapi_client.models.core_course_get_courses_by_field_200_response_courses_inner_customfields_inner.core_course_get_courses_by_field_200_response_courses_inner_customfields_inner(
                        name = '', 
                        shortname = '', 
                        type = '', 
                        value = '', 
                        valueraw = '', )
                    ],
                defaultgroupingid = 56,
                displayname = 'null',
                enablecompletion = 56,
                enddate = 56,
                enrollmentmethods = [
                    None
                    ],
                filters = [
                    openapi_client.models.core_course_get_courses_by_field_200_response_courses_inner_filters_inner.core_course_get_courses_by_field_200_response_courses_inner_filters_inner(
                        filter = 'null', 
                        inheritedstate = 56, 
                        localstate = 56, )
                    ],
                format = 'null',
                fullname = 'null',
                groupmode = 56,
                groupmodeforce = 56,
                id = 56,
                idnumber = 'null',
                lang = 'null',
                legacyfiles = 56,
                marker = 56,
                maxbytes = 56,
                newsitems = 56,
                overviewfiles = [
                    openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                        filename = '', 
                        filepath = '', 
                        filesize = 56, 
                        fileurl = '', 
                        isexternalfile = True, 
                        mimetype = '', 
                        repositorytype = '', 
                        timemodified = 56, )
                    ],
                requested = 56,
                shortname = '',
                showactivitydates = True,
                showcompletionconditions = True,
                showgrades = 56,
                showreports = 56,
                sortorder = 56,
                startdate = 56,
                summary = '',
                summaryfiles = [
                    openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                        filename = '', 
                        filepath = '', 
                        filesize = 56, 
                        fileurl = '', 
                        isexternalfile = True, 
                        mimetype = '', 
                        repositorytype = '', 
                        timemodified = 56, )
                    ],
                summaryformat = 56,
                theme = 'null',
                timecreated = 56,
                timemodified = 56,
                visible = 56
            )
        else:
            return CoreCourseGetCoursesByField200ResponseCoursesInner(
        )
        """

    def testCoreCourseGetCoursesByField200ResponseCoursesInner(self):
        """Test CoreCourseGetCoursesByField200ResponseCoursesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()