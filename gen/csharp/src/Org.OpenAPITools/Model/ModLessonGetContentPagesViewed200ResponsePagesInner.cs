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
    /// The content pages viewed.
    /// </summary>
    [DataContract(Name = "mod_lesson_get_content_pages_viewed_200_response_pages_inner")]
    public partial class ModLessonGetContentPagesViewed200ResponsePagesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModLessonGetContentPagesViewed200ResponsePagesInner" /> class.
        /// </summary>
        /// <param name="flag">1 if the next page was calculated randomly. (default to null).</param>
        /// <param name="id">The attempt id. (default to null).</param>
        /// <param name="lessonid">The lesson id. (default to null).</param>
        /// <param name="nextpageid">The next page chosen id. (default to null).</param>
        /// <param name="pageid">The page id. (default to null).</param>
        /// <param name="retry">The lesson attempt number. (default to null).</param>
        /// <param name="timeseen">The time the page was seen. (default to null).</param>
        /// <param name="userid">The user who viewed the page. (default to null).</param>
        public ModLessonGetContentPagesViewed200ResponsePagesInner(int flag = null, int id = null, int lessonid = null, int nextpageid = null, int pageid = null, int retry = null, int timeseen = null, int userid = null)
        {
            this.Flag = flag;
            this.Id = id;
            this.Lessonid = lessonid;
            this.Nextpageid = nextpageid;
            this.Pageid = pageid;
            this.Retry = retry;
            this.Timeseen = timeseen;
            this.Userid = userid;
        }

        /// <summary>
        /// 1 if the next page was calculated randomly.
        /// </summary>
        /// <value>1 if the next page was calculated randomly.</value>
        [DataMember(Name = "flag", EmitDefaultValue = false)]
        public int Flag { get; set; }

        /// <summary>
        /// The attempt id.
        /// </summary>
        /// <value>The attempt id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// The lesson id.
        /// </summary>
        /// <value>The lesson id.</value>
        [DataMember(Name = "lessonid", EmitDefaultValue = false)]
        public int Lessonid { get; set; }

        /// <summary>
        /// The next page chosen id.
        /// </summary>
        /// <value>The next page chosen id.</value>
        [DataMember(Name = "nextpageid", EmitDefaultValue = false)]
        public int Nextpageid { get; set; }

        /// <summary>
        /// The page id.
        /// </summary>
        /// <value>The page id.</value>
        [DataMember(Name = "pageid", EmitDefaultValue = false)]
        public int Pageid { get; set; }

        /// <summary>
        /// The lesson attempt number.
        /// </summary>
        /// <value>The lesson attempt number.</value>
        [DataMember(Name = "retry", EmitDefaultValue = false)]
        public int Retry { get; set; }

        /// <summary>
        /// The time the page was seen.
        /// </summary>
        /// <value>The time the page was seen.</value>
        [DataMember(Name = "timeseen", EmitDefaultValue = false)]
        public int Timeseen { get; set; }

        /// <summary>
        /// The user who viewed the page.
        /// </summary>
        /// <value>The user who viewed the page.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModLessonGetContentPagesViewed200ResponsePagesInner {\n");
            sb.Append("  Flag: ").Append(Flag).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Lessonid: ").Append(Lessonid).Append("\n");
            sb.Append("  Nextpageid: ").Append(Nextpageid).Append("\n");
            sb.Append("  Pageid: ").Append(Pageid).Append("\n");
            sb.Append("  Retry: ").Append(Retry).Append("\n");
            sb.Append("  Timeseen: ").Append(Timeseen).Append("\n");
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
