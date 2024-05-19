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
    /// ModWikiNewPageRequest
    /// </summary>
    [DataContract(Name = "mod_wiki_new_page_request")]
    public partial class ModWikiNewPageRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiNewPageRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWikiNewPageRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWikiNewPageRequest" /> class.
        /// </summary>
        /// <param name="content">Page contents. (required).</param>
        /// <param name="contentformat">Page contents format. If an invalid format is provided, default                     wiki format is used. (default to &quot;null&quot;).</param>
        /// <param name="groupid">Subwiki&#39;s group ID. Used if subwiki does not exists. (default to null).</param>
        /// <param name="subwikiid">Page&#39;s subwiki ID..</param>
        /// <param name="title">New page title. (required) (default to &quot;null&quot;).</param>
        /// <param name="userid">Subwiki&#39;s user ID. Used if subwiki does not exists. (default to null).</param>
        /// <param name="wikiid">Page&#39;s wiki ID. Used if subwiki does not exists. (default to null).</param>
        public ModWikiNewPageRequest(string content = default(string), string contentformat = @"null", int groupid = null, int subwikiid = default(int), string title = @"null", int userid = null, int wikiid = null)
        {
            // to ensure "content" is required (not null)
            if (content == null)
            {
                throw new ArgumentNullException("content is a required property for ModWikiNewPageRequest and cannot be null");
            }
            this.Content = content;
            // to ensure "title" is required (not null)
            if (title == null)
            {
                throw new ArgumentNullException("title is a required property for ModWikiNewPageRequest and cannot be null");
            }
            this.Title = title;
            // use default value if no "contentformat" provided
            this.Contentformat = contentformat ?? @"null";
            this.Groupid = groupid;
            this.Subwikiid = subwikiid;
            this.Userid = userid;
            this.Wikiid = wikiid;
        }

        /// <summary>
        /// Page contents.
        /// </summary>
        /// <value>Page contents.</value>
        [DataMember(Name = "content", IsRequired = true, EmitDefaultValue = true)]
        public string Content { get; set; }

        /// <summary>
        /// Page contents format. If an invalid format is provided, default                     wiki format is used.
        /// </summary>
        /// <value>Page contents format. If an invalid format is provided, default                     wiki format is used.</value>
        [DataMember(Name = "contentformat", EmitDefaultValue = false)]
        public string Contentformat { get; set; }

        /// <summary>
        /// Subwiki&#39;s group ID. Used if subwiki does not exists.
        /// </summary>
        /// <value>Subwiki&#39;s group ID. Used if subwiki does not exists.</value>
        [DataMember(Name = "groupid", EmitDefaultValue = false)]
        public int Groupid { get; set; }

        /// <summary>
        /// Page&#39;s subwiki ID.
        /// </summary>
        /// <value>Page&#39;s subwiki ID.</value>
        [DataMember(Name = "subwikiid", EmitDefaultValue = false)]
        public int Subwikiid { get; set; }

        /// <summary>
        /// New page title.
        /// </summary>
        /// <value>New page title.</value>
        [DataMember(Name = "title", IsRequired = true, EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Subwiki&#39;s user ID. Used if subwiki does not exists.
        /// </summary>
        /// <value>Subwiki&#39;s user ID. Used if subwiki does not exists.</value>
        [DataMember(Name = "userid", EmitDefaultValue = false)]
        public int Userid { get; set; }

        /// <summary>
        /// Page&#39;s wiki ID. Used if subwiki does not exists.
        /// </summary>
        /// <value>Page&#39;s wiki ID. Used if subwiki does not exists.</value>
        [DataMember(Name = "wikiid", EmitDefaultValue = false)]
        public int Wikiid { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModWikiNewPageRequest {\n");
            sb.Append("  Content: ").Append(Content).Append("\n");
            sb.Append("  Contentformat: ").Append(Contentformat).Append("\n");
            sb.Append("  Groupid: ").Append(Groupid).Append("\n");
            sb.Append("  Subwikiid: ").Append(Subwikiid).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Userid: ").Append(Userid).Append("\n");
            sb.Append("  Wikiid: ").Append(Wikiid).Append("\n");
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