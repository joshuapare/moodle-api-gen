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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// ModQuizGetAttemptReview200ResponseAttempt
    /// </summary>
    [DataContract(Name = "mod_quiz_get_attempt_review_200_response_attempt")]
    public partial class ModQuizGetAttemptReview200ResponseAttempt : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModQuizGetAttemptReview200ResponseAttempt" /> class.
        /// </summary>
        /// <param name="attempt">Sequentially numbers this students attempts at this quiz..</param>
        /// <param name="currentpage">Attempt current page..</param>
        /// <param name="gradednotificationsenttime">Time when the student was notified that manual grading of their attempt was complete..</param>
        /// <param name="id">Attempt id..</param>
        /// <param name="layout">Attempt layout..</param>
        /// <param name="preview">Whether is a preview attempt or not..</param>
        /// <param name="quiz">Foreign key reference to the quiz that was attempted..</param>
        /// <param name="state">The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;..</param>
        /// <param name="sumgrades">Total marks for this attempt..</param>
        /// <param name="timecheckstate">Next time quiz cron should check attempt for                                                         state changes.  NULL means never check..</param>
        /// <param name="timefinish">Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet..</param>
        /// <param name="timemodified">Last modified time..</param>
        /// <param name="timemodifiedoffline">Last modified time via webservices..</param>
        /// <param name="timestart">Time when the attempt was started..</param>
        /// <param name="uniqueid">Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt..</param>
        /// <param name="userid">Foreign key reference to the user whose attempt this is..</param>
        public ModQuizGetAttemptReview200ResponseAttempt(int attempt = default(int), int currentpage = default(int), int gradednotificationsenttime = default(int), int id = default(int), string layout = default(string), int preview = default(int), int quiz = default(int), string state = default(string), decimal sumgrades = default(decimal), int timecheckstate = default(int), int timefinish = default(int), int timemodified = default(int), int timemodifiedoffline = default(int), int timestart = default(int), int uniqueid = default(int), int userid = default(int))
        {
            this.Attempt = attempt;
            this.Currentpage = currentpage;
            this.Gradednotificationsenttime = gradednotificationsenttime;
            this.Id = id;
            this.Layout = layout;
            this.Preview = preview;
            this.Quiz = quiz;
            this.State = state;
            this.Sumgrades = sumgrades;
            this.Timecheckstate = timecheckstate;
            this.Timefinish = timefinish;
            this.Timemodified = timemodified;
            this.Timemodifiedoffline = timemodifiedoffline;
            this.Timestart = timestart;
            this.Uniqueid = uniqueid;
            this.Userid = userid;
        }

        /// <summary>
        /// Sequentially numbers this students attempts at this quiz.
        /// </summary>
        /// <value>Sequentially numbers this students attempts at this quiz.</value>
        [DataMember(Name = "attempt", EmitDefaultValue = false)]
        public int Attempt { get; set; }

        /// <summary>
        /// Attempt current page.
        /// </summary>
        /// <value>Attempt current page.</value>
        [DataMember(Name = "currentpage", EmitDefaultValue = false)]
        public int Currentpage { get; set; }

        /// <summary>
        /// Time when the student was notified that manual grading of their attempt was complete.
        /// </summary>
        /// <value>Time when the student was notified that manual grading of their attempt was complete.</value>
        [DataMember(Name = "gradednotificationsenttime", EmitDefaultValue = false)]
        public int Gradednotificationsenttime { get; set; }

        /// <summary>
        /// Attempt id.
        /// </summary>
        /// <value>Attempt id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Attempt layout.
        /// </summary>
        /// <value>Attempt layout.</value>
        [DataMember(Name = "layout", EmitDefaultValue = false)]
        public string Layout { get; set; }

        /// <summary>
        /// Whether is a preview attempt or not.
        /// </summary>
        /// <value>Whether is a preview attempt or not.</value>
        [DataMember(Name = "preview", EmitDefaultValue = false)]
        public int Preview { get; set; }

        /// <summary>
        /// Foreign key reference to the quiz that was attempted.
        /// </summary>
        /// <value>Foreign key reference to the quiz that was attempted.</value>
        [DataMember(Name = "quiz", EmitDefaultValue = false)]
        public int Quiz { get; set; }

        /// <summary>
        /// The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;.
        /// </summary>
        /// <value>The current state of the attempts. &#39;inprogress&#39;,                                                 &#39;overdue&#39;, &#39;finished&#39; or &#39;abandoned&#39;.</value>
        [DataMember(Name = "state", EmitDefaultValue = false)]
        public string State { get; set; }

        /// <summary>
        /// Total marks for this attempt.
        /// </summary>
        /// <value>Total marks for this attempt.</value>
        [DataMember(Name = "sumgrades", EmitDefaultValue = false)]
        public decimal Sumgrades { get; set; }

        /// <summary>
        /// Next time quiz cron should check attempt for                                                         state changes.  NULL means never check.
        /// </summary>
        /// <value>Next time quiz cron should check attempt for                                                         state changes.  NULL means never check.</value>
        [DataMember(Name = "timecheckstate", EmitDefaultValue = false)]
        public int Timecheckstate { get; set; }

        /// <summary>
        /// Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet.
        /// </summary>
        /// <value>Time when the attempt was submitted.                                                     0 if the attempt has not been submitted yet.</value>
        [DataMember(Name = "timefinish", EmitDefaultValue = false)]
        public int Timefinish { get; set; }

        /// <summary>
        /// Last modified time.
        /// </summary>
        /// <value>Last modified time.</value>
        [DataMember(Name = "timemodified", EmitDefaultValue = false)]
        public int Timemodified { get; set; }

        /// <summary>
        /// Last modified time via webservices.
        /// </summary>
        /// <value>Last modified time via webservices.</value>
        [DataMember(Name = "timemodifiedoffline", EmitDefaultValue = false)]
        public int Timemodifiedoffline { get; set; }

        /// <summary>
        /// Time when the attempt was started.
        /// </summary>
        /// <value>Time when the attempt was started.</value>
        [DataMember(Name = "timestart", EmitDefaultValue = false)]
        public int Timestart { get; set; }

        /// <summary>
        /// Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt.
        /// </summary>
        /// <value>Foreign key reference to the question_usage that holds the                                                     details of the the question_attempts that make up this quiz                                                     attempt.</value>
        [DataMember(Name = "uniqueid", EmitDefaultValue = false)]
        public int Uniqueid { get; set; }

        /// <summary>
        /// Foreign key reference to the user whose attempt this is.
        /// </summary>
        /// <value>Foreign key reference to the user whose attempt this is.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModQuizGetAttemptReview200ResponseAttempt {\n");
            sb.Append("  Attempt: ").Append(Attempt).Append("\n");
            sb.Append("  Currentpage: ").Append(Currentpage).Append("\n");
            sb.Append("  Gradednotificationsenttime: ").Append(Gradednotificationsenttime).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Layout: ").Append(Layout).Append("\n");
            sb.Append("  Preview: ").Append(Preview).Append("\n");
            sb.Append("  Quiz: ").Append(Quiz).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Sumgrades: ").Append(Sumgrades).Append("\n");
            sb.Append("  Timecheckstate: ").Append(Timecheckstate).Append("\n");
            sb.Append("  Timefinish: ").Append(Timefinish).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Timemodifiedoffline: ").Append(Timemodifiedoffline).Append("\n");
            sb.Append("  Timestart: ").Append(Timestart).Append("\n");
            sb.Append("  Uniqueid: ").Append(Uniqueid).Append("\n");
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