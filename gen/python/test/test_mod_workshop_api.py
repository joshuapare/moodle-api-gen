# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.mod_workshop_api import ModWorkshopApi


class TestModWorkshopApi(unittest.TestCase):
    """ModWorkshopApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ModWorkshopApi()

    def tearDown(self) -> None:
        pass

    def test_mod_workshop_add_submission(self) -> None:
        """Test case for mod_workshop_add_submission

        Add a new submission to a given workshop.
        """
        pass

    def test_mod_workshop_delete_submission(self) -> None:
        """Test case for mod_workshop_delete_submission

        Deletes the given submission.
        """
        pass

    def test_mod_workshop_evaluate_assessment(self) -> None:
        """Test case for mod_workshop_evaluate_assessment

        Evaluates an assessment (used by teachers for provide feedback to the reviewer).
        """
        pass

    def test_mod_workshop_evaluate_submission(self) -> None:
        """Test case for mod_workshop_evaluate_submission

        Evaluates a submission (used by teachers for provide feedback or override the submission grade).
        """
        pass

    def test_mod_workshop_get_assessment(self) -> None:
        """Test case for mod_workshop_get_assessment

        Retrieves the given assessment.
        """
        pass

    def test_mod_workshop_get_assessment_form_definition(self) -> None:
        """Test case for mod_workshop_get_assessment_form_definition

        Retrieves the assessment form definition.
        """
        pass

    def test_mod_workshop_get_grades(self) -> None:
        """Test case for mod_workshop_get_grades

        Returns the assessment and submission grade for the given user.
        """
        pass

    def test_mod_workshop_get_grades_report(self) -> None:
        """Test case for mod_workshop_get_grades_report

        Retrieves the assessment grades report.
        """
        pass

    def test_mod_workshop_get_reviewer_assessments(self) -> None:
        """Test case for mod_workshop_get_reviewer_assessments

        Retrieves all the assessments reviewed by the given user.
        """
        pass

    def test_mod_workshop_get_submission(self) -> None:
        """Test case for mod_workshop_get_submission

        Retrieves the given submission.
        """
        pass

    def test_mod_workshop_get_submission_assessments(self) -> None:
        """Test case for mod_workshop_get_submission_assessments

        Retrieves all the assessments of the given submission.
        """
        pass

    def test_mod_workshop_get_submissions(self) -> None:
        """Test case for mod_workshop_get_submissions

        Retrieves all the workshop submissions or the one done by the given user (except example submissions).
        """
        pass

    def test_mod_workshop_get_user_plan(self) -> None:
        """Test case for mod_workshop_get_user_plan

        Return the planner information for the given user.
        """
        pass

    def test_mod_workshop_get_workshop_access_information(self) -> None:
        """Test case for mod_workshop_get_workshop_access_information

        Return access information for a given workshop.
        """
        pass

    def test_mod_workshop_get_workshops_by_courses(self) -> None:
        """Test case for mod_workshop_get_workshops_by_courses

        Returns a list of workshops in a provided list of courses, if no list is provided all workshops that                             the user can view will be returned.
        """
        pass

    def test_mod_workshop_update_assessment(self) -> None:
        """Test case for mod_workshop_update_assessment

        Add information to an allocated assessment.
        """
        pass

    def test_mod_workshop_update_submission(self) -> None:
        """Test case for mod_workshop_update_submission

        Update the given submission.
        """
        pass

    def test_mod_workshop_view_submission(self) -> None:
        """Test case for mod_workshop_view_submission

        Trigger the submission viewed event.
        """
        pass

    def test_mod_workshop_view_workshop(self) -> None:
        """Test case for mod_workshop_view_workshop

        Trigger the course module viewed event and update the module completion status.
        """
        pass


if __name__ == '__main__':
    unittest.main()