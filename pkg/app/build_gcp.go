package app

import (
	"context"
	"log"

	"cloud.google.com/go/storage"
	"golang.org/x/oauth2/google"
	"google.golang.org/api/option"
)

func getGCPClient(path, projectID string) (*storage.Client, error) {
	ctx := context.Background()

	creds, err := google.FindDefaultCredentials(ctx, storage.ScopeReadOnly)
	if err != nil {
		log.Fatal(err)
	}
	return storage.NewClient(ctx, option.WithCredentials(creds))
}
