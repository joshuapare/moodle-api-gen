# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt_submission import ModAssignGetSubmissionStatus200ResponseLastattemptSubmission

class TestModAssignGetSubmissionStatus200ResponseLastattemptSubmission(unittest.TestCase):
    """ModAssignGetSubmissionStatus200ResponseLastattemptSubmission unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetSubmissionStatus200ResponseLastattemptSubmission:
        """Test ModAssignGetSubmissionStatus200ResponseLastattemptSubmission
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetSubmissionStatus200ResponseLastattemptSubmission`
        """
        model = ModAssignGetSubmissionStatus200ResponseLastattemptSubmission()
        if include_optional:
            return ModAssignGetSubmissionStatus200ResponseLastattemptSubmission(
                assignment = 56,
                attemptnumber = 56,
                gradingstatus = '',
                groupid = 56,
                id = 56,
                latest = 56,
                plugins = [
                    openapi_client.models.mod_assign_get_submission_status_200_response_lastattempt_submission_plugins_inner.mod_assign_get_submission_status_200_response_lastattempt_submission_plugins_inner(
                        editorfields = [
                            openapi_client.models.mod_assign_get_submission_status_200_response_lastattempt_submission_plugins_inner_editorfields_inner.mod_assign_get_submission_status_200_response_lastattempt_submission_plugins_inner_editorfields_inner(
                                description = '', 
                                format = 56, 
                                name = '', 
                                text = '', )
                            ], 
                        fileareas = [
                            openapi_client.models.mod_assign_get_submission_status_200_response_feedback_plugins_inner_fileareas_inner.mod_assign_get_submission_status_200_response_feedback_plugins_inner_fileareas_inner(
                                area = '', 
                                files = [
                                    openapi_client.models.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner.core_block_get_dashboard_blocks_200_response_blocks_inner_contents_files_inner(
                                        filename = '', 
                                        filepath = '', 
                                        filesize = 56, 
                                        fileurl = '', 
                                        isexternalfile = True, 
                                        mimetype = '', 
                                        repositorytype = '', 
                                        timemodified = 56, )
                                    ], )
                            ], 
                        name = '', 
                        type = '', )
                    ],
                status = 'null',
                timecreated = 56,
                timemodified = 56,
                timestarted = 56,
                userid = 56
            )
        else:
            return ModAssignGetSubmissionStatus200ResponseLastattemptSubmission(
                attemptnumber = 56,
                groupid = 56,
                id = 56,
                status = 'null',
                timecreated = 56,
                timemodified = 56,
                userid = 56,
        )
        """

    def testModAssignGetSubmissionStatus200ResponseLastattemptSubmission(self):
        """Test ModAssignGetSubmissionStatus200ResponseLastattemptSubmission"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
