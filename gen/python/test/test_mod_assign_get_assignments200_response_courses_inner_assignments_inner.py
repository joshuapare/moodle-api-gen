# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_assignments200_response_courses_inner_assignments_inner import ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner

class TestModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(unittest.TestCase):
    """ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner:
        """Test ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner`
        """
        model = ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner()
        if include_optional:
            return ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(
                activity = 'null',
                activityattachments = [
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
                activityformat = 56,
                allowsubmissionsfromdate = 56,
                attemptreopenmethod = 'null',
                blindmarking = 56,
                cmid = 56,
                completionsubmit = 56,
                configs = [
                    openapi_client.models.mod_assign_get_assignments_200_response_courses_inner_assignments_inner_configs_inner.mod_assign_get_assignments_200_response_courses_inner_assignments_inner_configs_inner(
                        assignment = 56, 
                        id = 56, 
                        name = '', 
                        plugin = 'null', 
                        subtype = 'null', 
                        value = 'null', )
                    ],
                course = 56,
                cutoffdate = 56,
                duedate = 56,
                grade = 56,
                gradingduedate = 56,
                hidegrader = 56,
                id = 56,
                intro = 'null',
                introattachments = [
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
                introfiles = [
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
                introformat = 56,
                markingallocation = 56,
                markingworkflow = 56,
                maxattempts = 56,
                name = 'null',
                nosubmissions = 56,
                preventsubmissionnotingroup = 56,
                requireallteammemberssubmit = 56,
                requiresubmissionstatement = 56,
                revealidentities = 56,
                sendlatenotifications = 56,
                sendnotifications = 56,
                sendstudentnotifications = 56,
                submissionattachments = 56,
                submissiondrafts = 56,
                submissionstatement = 'null',
                submissionstatementformat = 56,
                teamsubmission = 56,
                teamsubmissiongroupingid = 56,
                timelimit = 56,
                timemodified = 56
            )
        else:
            return ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(
        )
        """

    def testModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner(self):
        """Test ModAssignGetAssignments200ResponseCoursesInnerAssignmentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
