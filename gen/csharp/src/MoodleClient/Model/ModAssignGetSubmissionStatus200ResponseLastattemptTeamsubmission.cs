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
    /// ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission
    /// </summary>
    [DataContract(Name = "mod_assign_get_submission_status_200_response_lastattempt_teamsubmission")]
    public partial class ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission" /> class.
        /// </summary>
        /// <param name="assignment">assignment id.</param>
        /// <param name="attemptnumber">attempt number (required).</param>
        /// <param name="gradingstatus">Grading status..</param>
        /// <param name="groupid">group id (required).</param>
        /// <param name="id">submission id (required).</param>
        /// <param name="latest">latest attempt.</param>
        /// <param name="plugins">plugins.</param>
        /// <param name="status">submission status (required).</param>
        /// <param name="timecreated">submission creation time (required).</param>
        /// <param name="timemodified">submission last modified time (required).</param>
        /// <param name="timestarted">submission start time.</param>
        /// <param name="userid">student id (required).</param>
        public ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission(int assignment = default(int), int attemptnumber = default(int), string gradingstatus = default(string), int groupid = default(int), int id = default(int), int latest = default(int), List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> plugins = default(List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner>), string status = default(string), int timecreated = default(int), int timemodified = default(int), int timestarted = default(int), int userid = default(int))
        {
            this.Attemptnumber = attemptnumber;
            this.Groupid = groupid;
            this.Id = id;
            // to ensure "status" is required (not null)
            if (status == null)
            {
                throw new ArgumentNullException("status is a required property for ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission and cannot be null");
            }
            this.Status = status;
            this.Timecreated = timecreated;
            this.Timemodified = timemodified;
            this.Userid = userid;
            this.Assignment = assignment;
            this.Gradingstatus = gradingstatus;
            this.Latest = latest;
            this.Plugins = plugins;
            this.Timestarted = timestarted;
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
        /// Grading status.
        /// </summary>
        /// <value>Grading status.</value>
        [DataMember(Name = "gradingstatus", EmitDefaultValue = false)]
        public string Gradingstatus { get; set; }

        /// <summary>
        /// group id
        /// </summary>
        /// <value>group id</value>
        [DataMember(Name = "groupid", IsRequired = true, EmitDefaultValue = true)]
        public int Groupid { get; set; }

        /// <summary>
        /// submission id
        /// </summary>
        /// <value>submission id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// latest attempt
        /// </summary>
        /// <value>latest attempt</value>
        [DataMember(Name = "latest", EmitDefaultValue = false)]
        public int Latest { get; set; }

        /// <summary>
        /// Gets or Sets Plugins
        /// </summary>
        [DataMember(Name = "plugins", EmitDefaultValue = false)]
        public List<ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInner> Plugins { get; set; }

        /// <summary>
        /// submission status
        /// </summary>
        /// <value>submission status</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public string Status { get; set; }

        /// <summary>
        /// submission creation time
        /// </summary>
        /// <value>submission creation time</value>
        [DataMember(Name = "timecreated", IsRequired = true, EmitDefaultValue = true)]
        public int Timecreated { get; set; }

        /// <summary>
        /// submission last modified time
        /// </summary>
        /// <value>submission last modified time</value>
        [DataMember(Name = "timemodified", IsRequired = true, EmitDefaultValue = true)]
        public int Timemodified { get; set; }

        /// <summary>
        /// submission start time
        /// </summary>
        /// <value>submission start time</value>
        [DataMember(Name = "timestarted", EmitDefaultValue = false)]
        public int Timestarted { get; set; }

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
            sb.Append("class ModAssignGetSubmissionStatus200ResponseLastattemptTeamsubmission {\n");
            sb.Append("  Assignment: ").Append(Assignment).Append("\n");
            sb.Append("  Attemptnumber: ").Append(Attemptnumber).Append("\n");
            sb.Append("  Gradingstatus: ").Append(Gradingstatus).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Latest: ").Append(Latest).Append("\n");
            sb.Append("  Plugins: ").Append(Plugins).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Timecreated: ").Append(Timecreated).Append("\n");
            sb.Append("  Timemodified: ").Append(Timemodified).Append("\n");
            sb.Append("  Timestarted: ").Append(Timestarted).Append("\n");
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
