# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.mod_lesson_api import ModLessonApi


class TestModLessonApi(unittest.TestCase):
    """ModLessonApi unit test stubs"""

    def setUp(self) -> None:
        self.api = ModLessonApi()

    def tearDown(self) -> None:
        pass

    def test_mod_lesson_finish_attempt(self) -> None:
        """Test case for mod_lesson_finish_attempt

        Finishes the current attempt.
        """
        pass

    def test_mod_lesson_get_attempts_overview(self) -> None:
        """Test case for mod_lesson_get_attempts_overview

        Get a list of all the attempts made by users in a lesson.
        """
        pass

    def test_mod_lesson_get_content_pages_viewed(self) -> None:
        """Test case for mod_lesson_get_content_pages_viewed

        Return the list of content pages viewed by a user during a lesson attempt.
        """
        pass

    def test_mod_lesson_get_lesson(self) -> None:
        """Test case for mod_lesson_get_lesson

        Return information of a given lesson.
        """
        pass

    def test_mod_lesson_get_lesson_access_information(self) -> None:
        """Test case for mod_lesson_get_lesson_access_information

        Return access information for a given lesson.
        """
        pass

    def test_mod_lesson_get_lessons_by_courses(self) -> None:
        """Test case for mod_lesson_get_lessons_by_courses

        Returns a list of lessons in a provided list of courses,                             if no list is provided all lessons that the user can view will be returned.
        """
        pass

    def test_mod_lesson_get_page_data(self) -> None:
        """Test case for mod_lesson_get_page_data

        Return information of a given page, including its contents.
        """
        pass

    def test_mod_lesson_get_pages(self) -> None:
        """Test case for mod_lesson_get_pages

        Return the list of pages in a lesson (based on the user permissions).
        """
        pass

    def test_mod_lesson_get_pages_possible_jumps(self) -> None:
        """Test case for mod_lesson_get_pages_possible_jumps

        Return all the possible jumps for the pages in a given lesson.
        """
        pass

    def test_mod_lesson_get_questions_attempts(self) -> None:
        """Test case for mod_lesson_get_questions_attempts

        Return the list of questions attempts in a given lesson.
        """
        pass

    def test_mod_lesson_get_user_attempt(self) -> None:
        """Test case for mod_lesson_get_user_attempt

        Return information about the given user attempt (including answers).
        """
        pass

    def test_mod_lesson_get_user_attempt_grade(self) -> None:
        """Test case for mod_lesson_get_user_attempt_grade

        Return grade information in the attempt for a given user.
        """
        pass

    def test_mod_lesson_get_user_grade(self) -> None:
        """Test case for mod_lesson_get_user_grade

        Return the final grade in the lesson for the given user.
        """
        pass

    def test_mod_lesson_get_user_timers(self) -> None:
        """Test case for mod_lesson_get_user_timers

        Return the timers in the current lesson for the given user.
        """
        pass

    def test_mod_lesson_launch_attempt(self) -> None:
        """Test case for mod_lesson_launch_attempt

        Starts a new attempt or continues an existing one.
        """
        pass

    def test_mod_lesson_process_page(self) -> None:
        """Test case for mod_lesson_process_page

        Processes page responses.
        """
        pass

    def test_mod_lesson_view_lesson(self) -> None:
        """Test case for mod_lesson_view_lesson

        Trigger the course module viewed event and update the module completion status.
        """
        pass


if __name__ == '__main__':
    unittest.main()
