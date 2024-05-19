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
    /// note
    /// </summary>
    [DataContract(Name = "core_notes_get_notes_200_response_notes_inner")]
    public partial class CoreNotesGetNotes200ResponseNotesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreNotesGetNotes200ResponseNotesInner" /> class.
        /// </summary>
        /// <param name="courseid">course id of the note (default to null).</param>
        /// <param name="format">text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN) (default to null).</param>
        /// <param name="noteid">id of the note (default to null).</param>
        /// <param name="publishstate">&#39;personal&#39;, &#39;course&#39; or &#39;site&#39;.</param>
        /// <param name="text">the text of the message - text or HTML.</param>
        /// <param name="userid">id of the user the note is about.</param>
        public CoreNotesGetNotes200ResponseNotesInner(int courseid = null, int format = null, int noteid = null, string publishstate = default(string), string text = default(string), int userid = default(int))
        {
            this.Courseid = courseid;
            this.Format = format;
            this.Noteid = noteid;
            this.Publishstate = publishstate;
            this.Text = text;
            this.Userid = userid;
        }

        /// <summary>
        /// course id of the note
        /// </summary>
        /// <value>course id of the note</value>
        [DataMember(Name = "courseid", EmitDefaultValue = false)]
        public int Courseid { get; set; }

        /// <summary>
        /// text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)
        /// </summary>
        /// <value>text format (1 &#x3D; HTML, 0 &#x3D; MOODLE, 2 &#x3D; PLAIN, or 4 &#x3D; MARKDOWN)</value>
        [DataMember(Name = "format", EmitDefaultValue = false)]
        public int Format { get; set; }

        /// <summary>
        /// id of the note
        /// </summary>
        /// <value>id of the note</value>
        [DataMember(Name = "noteid", EmitDefaultValue = false)]
        public int Noteid { get; set; }

        /// <summary>
        /// &#39;personal&#39;, &#39;course&#39; or &#39;site&#39;
        /// </summary>
        /// <value>&#39;personal&#39;, &#39;course&#39; or &#39;site&#39;</value>
        [DataMember(Name = "publishstate", EmitDefaultValue = false)]
        public string Publishstate { get; set; }

        /// <summary>
        /// the text of the message - text or HTML
        /// </summary>
        /// <value>the text of the message - text or HTML</value>
        [DataMember(Name = "text", EmitDefaultValue = false)]
        public string Text { get; set; }

        /// <summary>
        /// id of the user the note is about
        /// </summary>
        /// <value>id of the user the note is about</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreNotesGetNotes200ResponseNotesInner {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  Noteid: ").Append(Noteid).Append("\n");
            sb.Append("  Publishstate: ").Append(Publishstate).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
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