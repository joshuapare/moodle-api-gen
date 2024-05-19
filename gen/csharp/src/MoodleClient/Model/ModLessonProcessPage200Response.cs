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
    /// ModLessonProcessPage200Response
    /// </summary>
    [DataContract(Name = "mod_lesson_process_page_200_response")]
    public partial class ModLessonProcessPage200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonProcessPage200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModLessonProcessPage200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonProcessPage200Response" /> class.
        /// </summary>
        /// <param name="attemptsremaining">Number of attempts remaining. (required) (default to null).</param>
        /// <param name="correctanswer">Whether the answer is correct. (required) (default to null).</param>
        /// <param name="displaymenu">Whether we should display the menu or not in this page. (required).</param>
        /// <param name="feedback">The response feedback. (required) (default to &quot;null&quot;).</param>
        /// <param name="inmediatejump">Whether the page processing redirect directly to anoter page. (required) (default to null).</param>
        /// <param name="isessayquestion">Whether is a essay question. (required) (default to null).</param>
        /// <param name="maxattemptsreached">Whether we reachered the max number of attempts. (required) (default to null).</param>
        /// <param name="messages">messages (required).</param>
        /// <param name="newpageid">New page id (if a jump was made). (required) (default to null).</param>
        /// <param name="noanswer">Whether there aren&#39;t answers. (required) (default to null).</param>
        /// <param name="nodefaultresponse">Whether there is not a default response. (required) (default to null).</param>
        /// <param name="ongoingscore">The ongoing message. (required) (default to &quot;null&quot;).</param>
        /// <param name="progress">Progress percentage in the lesson. (required) (default to null).</param>
        /// <param name="response">The response. (required) (default to &quot;null&quot;).</param>
        /// <param name="reviewmode">Whether the user is reviewing. (required) (default to null).</param>
        /// <param name="studentanswer">The student answer. (required) (default to &quot;null&quot;).</param>
        /// <param name="userresponse">The user response. (required) (default to &quot;null&quot;).</param>
        /// <param name="warnings">warnings.</param>
        public ModLessonProcessPage200Response(int attemptsremaining = null, bool correctanswer = null, bool displaymenu = default(bool), string feedback = @"null", bool inmediatejump = null, bool isessayquestion = null, bool maxattemptsreached = null, List<ModLessonGetPageData200ResponseMessagesInner> messages = default(List<ModLessonGetPageData200ResponseMessagesInner>), int newpageid = null, bool noanswer = null, bool nodefaultresponse = null, string ongoingscore = @"null", int progress = null, string response = @"null", bool reviewmode = null, string studentanswer = @"null", string userresponse = @"null", List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Attemptsremaining = attemptsremaining;
            this.Correctanswer = correctanswer;
            this.Displaymenu = displaymenu;
            // to ensure "feedback" is required (not null)
            if (feedback == null)
            {
                throw new ArgumentNullException("feedback is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Feedback = feedback;
            this.Inmediatejump = inmediatejump;
            this.Isessayquestion = isessayquestion;
            this.Maxattemptsreached = maxattemptsreached;
            // to ensure "messages" is required (not null)
            if (messages == null)
            {
                throw new ArgumentNullException("messages is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Messages = messages;
            this.Newpageid = newpageid;
            this.Noanswer = noanswer;
            this.Nodefaultresponse = nodefaultresponse;
            // to ensure "ongoingscore" is required (not null)
            if (ongoingscore == null)
            {
                throw new ArgumentNullException("ongoingscore is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Ongoingscore = ongoingscore;
            this.Progress = progress;
            // to ensure "response" is required (not null)
            if (response == null)
            {
                throw new ArgumentNullException("response is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Response = response;
            this.Reviewmode = reviewmode;
            // to ensure "studentanswer" is required (not null)
            if (studentanswer == null)
            {
                throw new ArgumentNullException("studentanswer is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Studentanswer = studentanswer;
            // to ensure "userresponse" is required (not null)
            if (userresponse == null)
            {
                throw new ArgumentNullException("userresponse is a required property for ModLessonProcessPage200Response and cannot be null");
            }
            this.Userresponse = userresponse;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Number of attempts remaining.
        /// </summary>
        /// <value>Number of attempts remaining.</value>
        [DataMember(Name = "attemptsremaining", IsRequired = true, EmitDefaultValue = true)]
        public int Attemptsremaining { get; set; }

        /// <summary>
        /// Whether the answer is correct.
        /// </summary>
        /// <value>Whether the answer is correct.</value>
        [DataMember(Name = "correctanswer", IsRequired = true, EmitDefaultValue = true)]
        public bool Correctanswer { get; set; }

        /// <summary>
        /// Whether we should display the menu or not in this page.
        /// </summary>
        /// <value>Whether we should display the menu or not in this page.</value>
        [DataMember(Name = "displaymenu", IsRequired = true, EmitDefaultValue = true)]
        public bool Displaymenu { get; set; }

        /// <summary>
        /// The response feedback.
        /// </summary>
        /// <value>The response feedback.</value>
        [DataMember(Name = "feedback", IsRequired = true, EmitDefaultValue = true)]
        public string Feedback { get; set; }

        /// <summary>
        /// Whether the page processing redirect directly to anoter page.
        /// </summary>
        /// <value>Whether the page processing redirect directly to anoter page.</value>
        [DataMember(Name = "inmediatejump", IsRequired = true, EmitDefaultValue = true)]
        public bool Inmediatejump { get; set; }

        /// <summary>
        /// Whether is a essay question.
        /// </summary>
        /// <value>Whether is a essay question.</value>
        [DataMember(Name = "isessayquestion", IsRequired = true, EmitDefaultValue = true)]
        public bool Isessayquestion { get; set; }

        /// <summary>
        /// Whether we reachered the max number of attempts.
        /// </summary>
        /// <value>Whether we reachered the max number of attempts.</value>
        [DataMember(Name = "maxattemptsreached", IsRequired = true, EmitDefaultValue = true)]
        public bool Maxattemptsreached { get; set; }

        /// <summary>
        /// Gets or Sets Messages
        /// </summary>
        [DataMember(Name = "messages", IsRequired = true, EmitDefaultValue = true)]
        public List<ModLessonGetPageData200ResponseMessagesInner> Messages { get; set; }

        /// <summary>
        /// New page id (if a jump was made).
        /// </summary>
        /// <value>New page id (if a jump was made).</value>
        [DataMember(Name = "newpageid", IsRequired = true, EmitDefaultValue = true)]
        public int Newpageid { get; set; }

        /// <summary>
        /// Whether there aren&#39;t answers.
        /// </summary>
        /// <value>Whether there aren&#39;t answers.</value>
        [DataMember(Name = "noanswer", IsRequired = true, EmitDefaultValue = true)]
        public bool Noanswer { get; set; }

        /// <summary>
        /// Whether there is not a default response.
        /// </summary>
        /// <value>Whether there is not a default response.</value>
        [DataMember(Name = "nodefaultresponse", IsRequired = true, EmitDefaultValue = true)]
        public bool Nodefaultresponse { get; set; }

        /// <summary>
        /// The ongoing message.
        /// </summary>
        /// <value>The ongoing message.</value>
        [DataMember(Name = "ongoingscore", IsRequired = true, EmitDefaultValue = true)]
        public string Ongoingscore { get; set; }

        /// <summary>
        /// Progress percentage in the lesson.
        /// </summary>
        /// <value>Progress percentage in the lesson.</value>
        [DataMember(Name = "progress", IsRequired = true, EmitDefaultValue = true)]
        public int Progress { get; set; }

        /// <summary>
        /// The response.
        /// </summary>
        /// <value>The response.</value>
        [DataMember(Name = "response", IsRequired = true, EmitDefaultValue = true)]
        public string Response { get; set; }

        /// <summary>
        /// Whether the user is reviewing.
        /// </summary>
        /// <value>Whether the user is reviewing.</value>
        [DataMember(Name = "reviewmode", IsRequired = true, EmitDefaultValue = true)]
        public bool Reviewmode { get; set; }

        /// <summary>
        /// The student answer.
        /// </summary>
        /// <value>The student answer.</value>
        [DataMember(Name = "studentanswer", IsRequired = true, EmitDefaultValue = true)]
        public string Studentanswer { get; set; }

        /// <summary>
        /// The user response.
        /// </summary>
        /// <value>The user response.</value>
        [DataMember(Name = "userresponse", IsRequired = true, EmitDefaultValue = true)]
        public string Userresponse { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonProcessPage200Response {\n");
            sb.Append("  Attemptsremaining: ").Append(Attemptsremaining).Append("\n");
            sb.Append("  Correctanswer: ").Append(Correctanswer).Append("\n");
            sb.Append("  Displaymenu: ").Append(Displaymenu).Append("\n");
            sb.Append("  Feedback: ").Append(Feedback).Append("\n");
            sb.Append("  Inmediatejump: ").Append(Inmediatejump).Append("\n");
            sb.Append("  Isessayquestion: ").Append(Isessayquestion).Append("\n");
            sb.Append("  Maxattemptsreached: ").Append(Maxattemptsreached).Append("\n");
            sb.Append("  Messages: ").Append(Messages).Append("\n");
            sb.Append("  Newpageid: ").Append(Newpageid).Append("\n");
            sb.Append("  Noanswer: ").Append(Noanswer).Append("\n");
            sb.Append("  Nodefaultresponse: ").Append(Nodefaultresponse).Append("\n");
            sb.Append("  Ongoingscore: ").Append(Ongoingscore).Append("\n");
            sb.Append("  Progress: ").Append(Progress).Append("\n");
            sb.Append("  Response: ").Append(Response).Append("\n");
            sb.Append("  Reviewmode: ").Append(Reviewmode).Append("\n");
            sb.Append("  Studentanswer: ").Append(Studentanswer).Append("\n");
            sb.Append("  Userresponse: ").Append(Userresponse).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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