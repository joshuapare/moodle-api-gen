/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ModAssignGetSubmissionStatus200ResponseFeedbackGrade
    /// </summary>
    [DataContract(Name = "mod_assign_get_submission_status_200_response_feedback_grade")]
    public partial class ModAssignGetSubmissionStatus200ResponseFeedbackGrade : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200ResponseFeedbackGrade" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignGetSubmissionStatus200ResponseFeedbackGrade() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200ResponseFeedbackGrade" /> class.
        /// </summary>
        /// <param name="assignment">assignment id.</param>
        /// <param name="attemptnumber">attempt number (required).</param>
        /// <param name="grade">grade (required).</param>
        /// <param name="gradefordisplay">grade rendered into a format suitable for display.</param>
        /// <param name="grader">grader, -1 if grader is hidden (required).</param>
        /// <param name="id">grade id (required).</param>
        /// <param name="timecreated">grade creation time (required).</param>
        /// <param name="timemodified">grade last modified time (required).</param>
        /// <param name="userid">student id (required).</param>
        public ModAssignGetSubmissionStatus200ResponseFeedbackGrade(int assignment = default(int), int attemptnumber = default(int), string grade = default(string), string gradefordisplay = default(string), int grader = default(int), int id = default(int), int timecreated = default(int), int timemodified = default(int), int userid = default(int))
        {
            this.Attemptnumber = attemptnumber;
            // to ensure "grade" is required (not null)
            if (grade == null)
            {
                throw new ArgumentNullException("grade is a required property for ModAssignGetSubmissionStatus200ResponseFeedbackGrade and cannot be null");
            }
            this.Grade = grade;
            this.Grader = grader;
            this.Id = id;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Userid = userid;
            this.Assignment = assignment;
            this.Gradefordisplay = gradefordisplay;
        }

        /// <summary>
        /// assignment id
        /// </summary>
        /// <value>assignment id</value>
        [DataMember(Name = "assignment", EmitDefaultValue = false)]
        public int Assignment { get; set; }

        /// <summary>
        /// attempt number
        /// </summary>
        /// <value>attempt number</value>
        [DataMember(Name = "attemptnumber", IsRequired = true, EmitDefaultValue = true)]
        public int Attemptnumber { get; set; }

        /// <summary>
        /// grade
        /// </summary>
        /// <value>grade</value>
        [DataMember(Name = "grade", IsRequired = true, EmitDefaultValue = true)]
        public string Grade { get; set; }

        /// <summary>
        /// grade rendered into a format suitable for display
        /// </summary>
        /// <value>grade rendered into a format suitable for display</value>
        [DataMember(Name = "gradefordisplay", EmitDefaultValue = false)]
        public string Gradefordisplay { get; set; }

        /// <summary>
        /// grader, -1 if grader is hidden
        /// </summary>
        /// <value>grader, -1 if grader is hidden</value>
        [DataMember(Name = "grader", IsRequired = true, EmitDefaultValue = true)]
        public int Grader { get; set; }

        /// <summary>
        /// grade id
        /// </summary>
        /// <value>grade id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// grade creation time
        /// </summary>
        /// <value>grade creation time</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// grade last modified time
        /// </summary>
        /// <value>grade last modified time</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// student id
        /// </summary>
        /// <value>student id</value>
        [DataMember(Name = "userid", IsRequired = true, EmitDefaultValue = true)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModAssignGetSubmissionStatus200ResponseFeedbackGrade {\n");
            sb.Append("  Assignment: ").Append(Assignment).Append("\n");
            sb.Append("  Attemptnumber: ").Append(Attemptnumber).Append("\n");
            sb.Append("  Grade: ").Append(Grade).Append("\n");
            sb.Append("  Gradefordisplay: ").Append(Gradefordisplay).Append("\n");
            sb.Append("  Grader: ").Append(Grader).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}